// js very easy to break
// ts allows you to implement more rules to avoid it being broken

// any valid js code will be valid ts code
// there are more rules in ts than in js (ts is superset of js)
// ts does a lot more with types (hence name)

// can only run js in browser, so have to convert ts to js

// use colon in variable declaration to explicitly set a type
// now variable will always be of same type

const favouriteNumber: number = 5;
const isRetired: boolean = false;
let message: string = "hello";

//message = isRetired;
// compilation error: Type 'boolean' is not assignable to type 'string'.

//arrays
const names: string[] = ["Charlie", "Dan"];
const numbers: number[] = [2, 4, 6, 8];

//// casting
// there are times working with types where we have to
// override the type of variable
// two ways
// way 1: cast with as

const myArr: unknown[] = [true, -1, "a", null, "b"];

myArr[0]; // Object is of type 'unknown' even though it is rly a boolean

// casting with as
// - str is now string[]
const str = myArr.filter((el) => typeof el === "string") as string[];

// way 2: casting with <> generics
// - str2 is now string[]
const str2 = <string[]>myArr.filter((el) => typeof el === "string");

str[0].toLowerCase();
str2[0].toUpperCase();

// when you set up using vite
// tsconfig.json is where you define how strict ts will be
