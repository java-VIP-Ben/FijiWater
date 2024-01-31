// Employee.js File 
// This file contains the requests for employee routes

// consts and variables
var express = require('express');
var router = express.Router();

const libiotdb = require('../iotdb');
const bodyParser = require('body-parser');

// Parsing handlers
router.use(bodyParser.json());

// WhoAmI get request
router.get('/whoami', (request, response) => {
    const content = request.baseUrl;
    console.log(content);
    response.send(content);
});

// !! IMPORTANT !! 
// Make later changes so that employees cannot see all of the accounts, only their own.

// regular get requests
router.get('/', (request, response) => {

    // All accounts (<- this will be the thing changed later)
    const queryString = 'SELECT * FROM Employee';

    // Response statements for either error, results, or nothing
    libiotdb.pool.query(queryString, (error, result, fields) => {
        if (error) {
            console.log("ERROR: " + error);
            response.status(500).json(JSON.stringify(error));
        }
        if (result.length > 0) {
            console.log(JSON.stringify(result));
            response.status(200).json(result);
        } else {
            console.log('Query returned no results');
            response.status(204);
        }
    });
});

// Adding an Employee (they have permissions to do this)
router.post('/add', (request, response) => {
    const content = request.body;
    const queryString = `INSERT INTO Employee (Name, Adress, City, Zip, State) VALUES (?,?,?,?)`;

    libiotdb.pool.query(queryString, [content.Name, content.Address, content.City, content.Zip, content.State], (error, result, fields) => {
        if (error) {
            console.log("ERROR: " + error);
            response.status(500).json(JSON.stringify(error));
        } else {
            response.status(200).json({"Id": result.insertId});
            console.log({"Id": result.insertId});
            response.status(200).end();
        }
    });
});

// Deleting an Account (they also have these permissions)
router.delete('/delete/:id', (request, response) => {
    const content = request.body;
    const queryString = `DELETE FROM Employee WHERE id =?`;

    libiotdb.pool.query(queryString, [content.id], (error, result, fields) => {
        if (error) {
            console.log("ERROR: " + error);
            response.status(500).json(JSON.stringify(error));
        } else {
            console.log("Success!");
            response.status(200).end();
        }
    });
});

// Getting an account by a specific ID
// This is the get route that we would like to allow the Employees, rather than the * from employee
router.get('/:id', (request, response) => {
    const content = request.params;
    const queryString = 'SELECT Id FROM Employee WHERE Id = ?';

    libiotdb.pool.query(queryString, [content.id], (error, result, fields) => {
        if (error) {
            console.log("ERROR: " + error);
            response.status(500).json(JSON.stringify(error));
        }

        if (result.length > 0) {
            console.log(JSON.stringify(result));
            response.status(200).json(result);
        } else {
            console.log('Query returned no results');
            response.status(204).end();
        }
    });
});

// Updating an Employee Account 
// Employees will have access to this Information
// Maybe implement a check so accounts cannot duplicate info with other accounts
router.post('/update', (request, response) => {
    const content = request.body;
    console.log(content.Id.toString());
    const queryString = `UPDATE Employee SET Name = ?, Address = ?, City = ?, State = ?, Zip = ? WHERE Id = ?`;
    libiotdb.pool.query(queryString, [content.Name, content.Address, content.City, content.State, content.Zip, content.Id], (error, result, fields) => {
        if (error) {
            console.log("ERROR: " + error);
            response.status(500).json(JSON.stringify(error));
        } else {
            response.status(200).json({"Id": result.insertId});
            console.log({"Id": result.insertId});
            response.status(200).end();

        }
    });
});



// Leave this command be, it belongs at the bottom of the file
module.exports = router;
