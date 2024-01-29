//states.js file


//1.) Requirements
var express = require('express');
var router = express.Router();


//2.) Constants
const libiotdb = require('../iotdb');
const bodyParser = require('body-parser');
const cors = require('cors');

//3.) Router calls
router.use(bodyParser.json());
router.use(cors());
router.get('/whoami', (request, response) => {
	const content = request.baseUrl;
	console.log(content);
	response.send(content);
});

//Getting all Id's and Accounts from accounts table
router.get('/', (request, response) => {
	const queryString = `SELECT * FROM Accounts`; //getting information from all accounts

	//demonstrating the response:
	//if statements for either errors, results greater than 0, or nothing
	libiotdb.pool.query(queryString, (error, result, fields) => {
		if (error) {
			console.log("ERROR: " + error);
			response.status(500).json(JSON.stringify(error));
		}

		if(result.length > 0) {
			console.log(JSON.stringify(result));
			response.status(200).json(result);

		} else {
			console.log('Query returned zero results.');
			response.status(204).end();
		}
	});
});


//Add Account route
router.post('/add', (request, response) => {
	const content = request.body;
	const queryString = 'INSERT INTO Accounts (Name, Address, City, Zip, State) VALUES (?,?,?,?,?)';

	libiotdb.pool.query(queryString, [content.Name, content.Address, content.City, content.Zip, content.State], (error, result, fields) => {

		if(error) {
			console.log("ERROR: " + error);
			response.status(500).json(JSON.stringify(error));
		} else {
			//responding with a success and new ID
			response.status(200).json({"Id": result.insertId});
			console.log({"Id": result.insertId});
			response.status(200).end();
		}
	});
});

//Get Route
router.get('/:id', (request, response) => {
	const content = request.params;
	const queryString = `SELECT * FROM Accounts WHERE Id = ?`;

	libiotdb.pool.query(queryString, [content.id], (error, result, fields) => {
		if (error) {
			console.log("ERROR: " + error);
			response.status(500).json(JSON.stringify(error));
		}

		if(result.length > 0) {
            console.log("SUCCESS!")
			console.log(JSON.stringify(result));
			response.status(200).json(result[0]);
		} else {
			console.log('Query returned zero results.');
			response.status(204).end();
		}
	});
});


//Updating specific Accounts Route
router.post('/update', (request, response) => {
	const content = request.body;
    console.log(content.Id.toString());
	const queryString = `UPDATE Accounts SET Name = ?, Address = ?, City = ?, State = ?, Zip =?  WHERE Id = ?`;

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

//Delete Accounts Route (for the second time) 
router.delete('/delete/:id', (request, response) => {
	const content = request.params;
	const queryString = `DELETE FROM Accounts WHERE Id = ?`

	libiotdb.pool.query(queryString, [content.id], (error, result, fields) => {
		if (error) {
			console.log("ERROR: " + error);
			response.status(500).json(JSON.stringify(error));
		} else {
			console.log('Success!');
			response.status(200).end();
		}
	});
});

module.exports = router;
