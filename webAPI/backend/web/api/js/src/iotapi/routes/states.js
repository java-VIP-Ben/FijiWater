//states.js file


//1.) Requirements
var express = require('express');
var router = express.Router();


//2.) Constants
const libiotdb = require('../iotdb');
const bodyParser = require('body-parser');

//3.) Router calls
router.use(bodyParser.json());
router.get('/whoami', (request, response) => {
	const content = request.baseUrl;
	console.log(content);
	response.send(content);
});

//Getting all Id's and States from States table
router.get('/', (request, response) => {
	const queryString = 'SELECT Id, State from States';
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

//Add state route
router.post('/add', (request, response) => {
	const content = request.body;
	const queryString = 'INSERT INTO States (State) VALUES (?)';

	libiotdb.pool.query(queryString, [content.State], (error, result, fields) => {
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

//Delete Route
router.delete('/delete', (request, response) => {
	const content = request.body;
	const queryString = 'DELETE FROM States WHERE Id = ?';

	libiotdb.pool.query(queryString, [content.Id], (error, result, fields) => {
		if(error) {
			console.log("ERROR: " + error);
			response.status(500).json(JSON.stringify(error));
		} else {
			console.log('Success!');
			response.status(200).end();
		}
	});
});

//Get Route
router.get('/:id', (request, response) => {
	const content = request.params;
	const queryString = 'SELECT Id, State FROM States WHERE Id = ?';

	libiotdb.pool.query(queryString, [content.id], (error, result, fields) => {
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


//Update Route
router.post('/update', (request, response) => {
	const content = request.body;
	const queryString = 'UPDATE States SET State = ? WHERE Id = ?';

	libiotdb.pool.query(queryString, [content.State, content.Id], (error, result, fields) => {
		if (error) {
			console.log("ERROR: " + error);
			response.status(500).json(JSON.stringify(error));
		} else {
			console.log('Query returned zero results.');
			response.status(200).end();
		}
	});
});



module.exports = router;
