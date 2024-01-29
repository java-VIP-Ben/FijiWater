//constants
const express = require('express');
const bodyParser = require('body-parser');
const app = express();
const PORT = 3000;


//messages coming back
app.use(bodyParser.json());
app.listen(PORT, () => console.log('Hello Node running on port 3000'));

//get response <- similar to getters and setters learned at SICTC
app.get('/', (request, response) => {
	console.log(request.url);
	response.send('Hello, World');
});

//post request with json
app.post('/', (request, response) => {
	const content = request.body;
	console.log(content);
	response.json(content);
});
