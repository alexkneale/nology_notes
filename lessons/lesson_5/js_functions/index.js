// in JS a function is just a variable that contains block of code to execute

// function types
// many ways to define a function

// FUNCTION DECLARATION - use keyword 'function'

function greet() {
    console.log("Hello!");
}

greet();

// Function purity -- rules for having params in functions
// given same input, it should always return the same output
// function should not rely on global variables
// function should not mutate anything out of their scope.
// so a function should really be a self-contained executable block of code.

function sumTwoNums(n1, n2) {
    // console.log(n1 + n2);
    return n1 + n2;
}

const result = sumTwoNums(1, 2);
console.log(result);

// ES6 syntax, arrow functions

const myFunction = (name) => {
    console.log(`Hello ${name}`);
};

myFunction("alex");

// can access properties of function using .

console.log(myFunction.name);

// hoisting is main difference between ES5 and ES6
// ES5 (old style) functions are hoisted, meaning you can call them before they're defined
// ES6 are NOT hoisted

// in javascript, errors are difficult to debug
// this is because, never get compiler errors
// computer doesn't tell you where you went wrong
// it just runs the code without any safeguards
// you have to produce safeguards
