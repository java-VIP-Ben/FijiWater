//big time index file (this is the source of all evil)

//constants
const express = require('express');
const path = require('path');
const app = express();
//const routeStates = require('./routes/states.js'); //enabled after building out states.js
const routeAccounts = require('./routes/accounts.js'); //enabled after disabling states
const NAME = require(__dirname + '/package.json').name;
const libiotdb = require('./iotdb');
const PORT = 3000;
const cors = require('cors');

//Port and folder selection 
//app.use('/states', routeStates)
app.use('/accounts', routeAccounts)
app.listen(PORT, () => console.log('IoT REST API running on port 3000'));
app.use(cors());
/*
 * Example route testing that app is running 
 */

app.get('/whoami', (request, response) => {
	var url = path.join(request.baseUrl, request.url);
	console.log(url);
	response.send('<div><h1>Hello, Accounts</h1></div>');
});
