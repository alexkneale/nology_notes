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
let isDone: boolean = false;
// string
let fullName: string = "John Smith";
let greeting: string = "Hello, my name is ${fullName}";
// number
let decimal: number = 6;
let float: number = 100.232;

// arrays -- can use two notatations -- both valid
// js developer way
let list: number[] = [1, 2, 3];
let list2: string[] = ["pie", "gravy"];

// c# and java developer way
let list3: Array<number> = [1, 2, 3];
let list4: Array<string> = ["Pie", "gravy"];

//// TUPLES
// express an array of fixed (or variable) length but differing types
// ? on a type means that it is optional
// declaration
let person: [string, number, number?];

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

let something: unknown;

something = 1234;

console.log(something == 1234);
console.log(something === 1234);
console.log(something !== 1234);

//// ENUM
// friendly names for numeric values
// automatically numbered from 0

enum Color {
    Red,
    Green,
    Blue,
}
let c: Color = Color.Green; // 1
console.log(c); // 1

// can start from any number
enum Color2 {
    Red = 4,
    Green,
    Blue,
}
let c2: Color2 = Color2.Green; // 5
console.log(c2); // 5

// or can number all manually
enum Color3 {
    Red = 4,
    Green = 8,
    Blue = 16,
}
let c3: Color3 = Color3.Green; // 8
console.log(c3); // 8

// can also go from numeric value to the name
let c4: string = Color3[8]; //Green
console.log(c4); // Green

//// Any
// all types are subtypes of any
// gives us route to describe variables that we do not know the type of yet

let thing: any = "thing T. Thing";
thing = false; // all ok

//// VOID
// in some ways, opposite of any
// the absence of any type at all
// often the type of function that doesnt return a value
// if variable declared with type void, can only assign undefined to them
let unusable: void = undefined;

//// NULL and UNDEFINED
// as in JS

//// NEVER
// never is subtype of every type but nothing is a subtype of never
// every > never > nothing
// never: represents the type of values that never occur

// functions that never return
function notEver(): never {
    while (true) {}
}

//// object
// used to represent anything that is not a primitive
// allows better representation of APIs, e.g. Object.create

declare function create(o: object | null): void;
create({ prop: 0 }); // ok
create(null); // ok
// below would cause error
//create(42);

//// type assertiono
// sometime as developers we need to override the compiler
// usuall when an entity is more specific than its current type
// two syntax
// syntax one: angle-bracket syntax
let newThing: any = "thing T thing";
let nameLength: number = (<string>newThing).length;

// as-syntax
let newThing2: any = "thing T thing";
let nameLength2: number = (newThing2 as string).length;

//// Unknown top-type
// type-safe counterpart of any
// anything is assignable to unknown
// unknown isnt assignable to anything but itself and any without a type-assertion or control flow based narrowing

// no operations are permitted on an unknown without assertion or narrowing

let x: unknown = "hi"; // ok
x = 42; //ok
x !== 10; //ok
//below would throw error - equality operations only
// x <= 22;
(x as number) >= 10; //ok
