// so far, code has always been read left to right, top to bottom

// web app browser on local machine
// sends out request to internet, which then connects to API (application programming interface)
// API is middle man between you and the web server/database
// API receives signal from your web browser (request), does that request
// then looks into database and process data
// then packages data for you and sends it back to you in a response

// API protects integrity of your database

// REST is a method for writing API endpoints

// what is HTTP?
// Hypertext Transfer Protocol is a messaging protocol that
// allows devices to communicate over the network
// It is a standard for formatting TCP (Transmission Control Protocal)
// messages over the network

// Components of an HTTP message
// Method (eg. GET, POST)
// URL (https://example.com)
// Headers
//  - Authorization= Bearer my-token
//  - Content-type=applicationo/json
// Body (data which is sent over, below is JSON body)
//  - {"message": "Hello World!"}

// Common HTTP Methods
// - GET --> Retrieve record/s from source, should not have a body
// - POST --> Save new record in source
// - DELETE --> delete record in source
// - PUT --> rewrite or write data in source
// - PATCH --> save partial data for existing record in source

//// CRUD (Create, Read, Update, Delete) --> basics webpage needs to have
// Create --> POST, PUT
// Read --> GET
// Update --> PATCH, PUT
// Delete --> DELETE

//// Status Codes

// https://http.cat/ for learning

// Success 2xx ("two hundreds")
// Redirection 3xx --> 304
// Client Errors 4xx
// Server Errors 5xx

//// RESTful Resources
// REST --> Representational State Transfer --> a standard
// for creating stateless APIs on top of HTTP

// look at example on slides

//// Postman --> application for handling APIs

//// Synchronous vs Asynchronous code

const firstFunction = () => {
    console.log("firstFucntion execution");
};

const secondFunc = () => {
    console.log("secondFunc execution");
};
// when we run code, all lines are run (69-71)
// Synchronous code
console.log("Hello World");
firstFunction();
secondFunc();

// Problem with APIs --> dont know how long requests will take
// We dont want one part of code to block the rest
// Introduce asynchronouos code

// Log after t seconds
const apiCall = (s: string, t: number) => {
    // run callback function after t seconds
    setTimeout(() => {
        console.log(s);
    }, t);
};

// example of asynchronous
const myAppProcess = () => {
    firstFunction();
    // wait 3 seconds before executing
    apiCall("Result of APICall", 3000);
    // run second function
    secondFunc();
};

myAppProcess();
// we will actually run SecondFunc() before apiCall
// as apiCall has setTimeout --> allows secondFunc to run
// while waiting for apiCall to run
