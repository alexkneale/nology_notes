// Control Flow

// if, else if, else etc
// execute code depending on condition met or not

//if - else - if else
// switch
// ternaries
// conditions

// if -> keyword, expects condition
if (5 > 3) {
    console.log("5 is greater than 3");
} else if (10 < 3) {
    console.log("Condition 2 is true");
} else {
    console.log("The if conditin was false");
}

const checkMyNumberIsGreaterThanTen = (number) => {
    if (number > 10) {
        return "your number is greater than 10";
    } else if (number < 10) {
        return "Your number is smaller than 10";
    } else {
        return "your number is 10";
    }
};

console.log(checkMyNumberIsGreaterThanTen(29));
console.log(checkMyNumberIsGreaterThanTen(1));
console.log(checkMyNumberIsGreaterThanTen(10));

// switch
// each case is looking for strict equality
const number = "3";

console.log(number);

switch (number) {
    case 1:
        console.log("Better luck next time");
        // note you have to include break, or else all other cases will also return true
        break;
    case 2:
        console.log("Try again");
        break;
    case "2":
        console.log("interesting");
        break;
    // can have multiple cases give the same return
    // essentially or statements for same output
    case 3:
    case "3":
        console.log("Who knows?");
        break;

    case 4:
        console.log("Maybe!");
        break;
    case 5:
        console.log("fotr sure");
        break;
    case 6:
        console.log("Most likely");
        break;
    default:
        console.log("outlook");
        break;
}

// note, when working in a function the return statement automatically exits functioon
// so no need for any break statements

// default is useful for bug proofing
// can use default to cover other cases that you hadn;'t anticipated
// ie passing string when param is number

// parameter vs argument
// parameter is abstract version in function definition
// argyment is actual value passed to function
