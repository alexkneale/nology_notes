//// additional types in ts compared with js
// array
// tuple
// enum
// any
// void
// never
// object
// unknown
//// to add type to variable declaration, use :
// boolean example
var isDone = false;
// string
var fullName = "John Smith";
var greeting = "Hello, my name is ${fullName}";
// number
var decimal = 6;
var float = 100.232;
// arrays -- can use two notatations -- both valid
// js developer way
var list = [1, 2, 3];
var list2 = ["pie", "gravy"];
// c# and java developer way
var list3 = [1, 2, 3];
var list4 = ["Pie", "gravy"];
//// TUPLES
// express an array of fixed (or variable) length but differing types
// ? on a type means that it is optional
// declaration
var person;
// if optional is in middle, all following must have ? too
// example initialization
person = ["john", 21];
// accessing tuples
// when we know index, correct type is retrieved too
console.log(person[0].substring(1));
// adding to tuples
// only type is correct
// correct example below
person[2] = 1234;
// incorrect example below
//person[2] = 'smith';
var something;
something = 1234;
console.log(something == 1234);
console.log(something === 1234);
console.log(something !== 1234);
//// ENUM
// friendly names for numeric values
// automatically numbered from 0
var Color;
(function (Color) {
    Color[Color["Red"] = 0] = "Red";
    Color[Color["Green"] = 1] = "Green";
    Color[Color["Blue"] = 2] = "Blue";
})(Color || (Color = {}));
var c = Color.Green; // 1
console.log(c); // 1
// can start from any number
var Color2;
(function (Color2) {
    Color2[Color2["Red"] = 4] = "Red";
    Color2[Color2["Green"] = 5] = "Green";
    Color2[Color2["Blue"] = 6] = "Blue";
})(Color2 || (Color2 = {}));
var c2 = Color2.Green; // 5
console.log(c2); // 5
// or can number all manually
var Color3;
(function (Color3) {
    Color3[Color3["Red"] = 4] = "Red";
    Color3[Color3["Green"] = 8] = "Green";
    Color3[Color3["Blue"] = 16] = "Blue";
})(Color3 || (Color3 = {}));
var c3 = Color3.Green; // 8
console.log(c3); // 8
// can also go from numeric value to the name
var c4 = Color3[8];
console.log(c4);
