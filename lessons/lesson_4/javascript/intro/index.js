console.log(typeof "hi");

// note on let, const and var

//originally there was just var, let and const introduced more recently to deal with one issue
// var createas global scope varibales, whereas let/const dont

// for example, this would throw error

//global scope
var score = 0;

{
    //local scope
    var score = 1;

    //throws error
}

//global scope
let score = 0;

{
    //local scope
    let score = 1;

    //no error
}

// you can see why var would cause issues
// var makes variables muteable gloabale scope: so always accessible from everywhere and so always run the risk of ebing changed
//may not always want this

//for example

{
    //local scope, but var creates global variables
    var score = 1;
}

score = 0;
// no error, as score is global because it was defined with var

{
    //local scope, local variable (let)
    let score = 1;
}

score = 0;

// error, as trying to access local variable from global scope.

//operators

let value = 256;
value++;
console.log(value);
//257
console.log(value++);
//257, as we first print value, then add 1 to it
console.log(value);
//258
console.log(++value);
//259, as first we add 1, then print value

// string concatenation

// when you have +, default is to try to attempt string concatenation
// so even if you pass a string and a number with +, will get a string

// when you have - or any other mathematical operator (apart from +) working with strings, javascript will try to convert strings to numbers and then run operation

console.log("1" + "2"); // '12'
console.log("1" - "2"); // -1
console.log("abc" - "c"); // nan
console.log(1 + "6"); // '16'
console.log(1 * "6"); // 6

// boolean
//comparison
//evaluations
//lazy evaluations and early exits
// multiple expression handling

// truthy and falsey

// some unexpected behaviour -- lazy evaluations/ early exits

let x = 5;
console.log(x || 5 < 6);

// returns 5, as x has truthy value, and as we're dealing with or operator,
// in JS compiler, we just check if first element is true (truthy) and then return it

console.log(x && 6 < 6);
// true && false returns false

console.log(!x && 5 < 6);
// returns false, as !x is false and exits immediately

let y = 0;

console.log(y && x);
// false && true, returns 0 as exits immediately and outputs y value

console.log(10 && 3);
// returns 3
// all have truthy values, so returns last element (where it exits)

console.log(10 && 0 && 3);
// returns 0
// as 0 has falsey value, returns this element and exits

// nice way of converting numerical values into its truthy state

!!10;
// returns true
// !10 first gives us false
// then !(!10) gives us true (truthy value of 10)

// note on concatenating true and false, they take binary values

console.log(true + false);
// returns 1 + 0 = 1
