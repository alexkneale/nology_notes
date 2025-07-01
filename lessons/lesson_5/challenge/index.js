// challenge 1

// ## Challenge: Years to Days & Seconds

// ### MVP

// 1. Create a function that takes your age in years and returns your age in days.
// 1. Create a function that takes your age in years and returns your age in seconds.

// ```js
// ageInDays(32) => 11680
// ageInSeconds(32) => 1009152000
// ```

const yearsDays = (years) => {
    return years * 365;
};

const yearsSeconds = (years) => {
    return yearsDays(years) * 24 * 3600;
};
console.log(yearsDays(32));
console.log(yearsSeconds(32));

console.log();

// ## Challenge: Return the Remainder from Two Numbers

// ### MVP

// There is a single operator in JavaScript, capable of providing the remainder of
// a division operation. Two numbers are passed as parameters. The first parameter
// divided by the second parameter will have a remainder, possibly zero. Return that
// value.

// ```js
// remainder(1, 3) ➞ 1

// remainder(3, 4) ➞ 3

const remainder = (num1, num2) => {
    return num1 % num2;
};

console.log(remainder(1, 3));
console.log(remainder(3, 4));
console.log(remainder(-9, 45));
console.log(remainder(1, 3));
