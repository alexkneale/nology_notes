// Ternary Operator
// if else syntax simplified

const orange = "orange";

// check to see orange exists
console.log(orange ? "Orange exists" : "Orange does not exist");

// in function

const testIfTrue = (value) => {
    // here we create larger chain (if , else if, else)
    return value
        ? `${value} is true or truthy`
        : value === undefined
        ? `${value} is undefined`
        : `${value} is false or falsey`;
};

console.log(testIfTrue("Orange"));
console.log(testIfTrue(undefined));
console.log(testIfTrue(""));
