//1.) lines for environment and mysql packages
require('dotenv').config({path: __dirname + '/.env'});
let mysql2 = require('mysql2');

//2.) constants
const db_host = process.env.MYSQL_HOST
const db_name = process.env.MYSQL_DATABASE
const db_userid = process.env.MYSQL_USER;
const db_password = process.env.MYSQL_PASSWORD;

//3.) Variables
let pool;
let isConnected = false;
let configPool = {
	host: db_host,
	user: db_userid,
	password: db_password,
	database: db_name,
	waitForConnections: true,
	connectionLimit: 15,
	queueLimit: 0
}

//4.) Connecting to a database <- using a try catch statement
try{
	pool = mysql2.createPool(configPool);
	isConnected = true;
}
catch(err){ //writing error codes in case something goes wrong
	console.log(err);
}

//5.) Checking db connection
function isDbConnected() {
	return isConnected;
}

//6.) Display our tables if they exist
function runQueryShowTables(){

	const queryString = 'SHOW TABLES';
	pool.query(queryString, (error, rows, fields) => { if (error) {
		console.log("ERROR " + error);
	}

	if(rows.length > 0) {
		rows.forEach(function(row) {
			console.log(row.Tables_in_IoT);
		});
	} else {
		console.log('query returned zero results');
	}
        });
return;
}

//7.) Unit Test
if(typeof require !== 'undefined') {
	if(require.main == module) {
		if(isDbConnected()) {
			console.log("Database: Connected");
			console.log("Tables:");
			runQueryShowTables();
		}
	}
}





module.exports = {pool};
