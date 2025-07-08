// arrays
// use const as we want constant reference to arrays
// even though we can easily change elements of array
// this way we don't risk the reference being reassigned by mistake

const array = ["andy", "jeff", "elbow"];

// indexing works same as in strings

// first element
console.log(array[0]);
// last element
console.log(array[array.length - 1]);

// not all elements of array have to be of same type

const myMixedArr = [1, true, undefined, false, "blue"];

// other way to construct array
// use new keyword and Array constructor
// below, we create array of length 5, filled with 0
const arrayWithCapacity = new Array(5).fill(0);
console.log(arrayWithCapacity);

// 2d array

const twoDArr = [[0], [0], [0]];

console.log(twoDArr);

//// how to modify arrays

// adding values to arrays
// .push() adds value to end of array

myStrings = ["a", "b", "c", "d"];

myStrings.push("e");
console.log(myStrings);

// note , .push returns the length of array,

const new_length = myStrings.push("f");
console.log(new_length);

// inserting element at beginning, use unshift
myStrings.unshift("before_a");
console.log(myStrings);

// inserting element at specific index
// .splice(start_index,delete_count, value_to_add)
// delete_count gives number of elements to delete, starting at start_index
// so if we just want to insert element at index 2, we set delete_count=0
myStrings.splice(2, 0, "before_b");
console.log(myStrings);

// removing value from the end. .pop()
myStrings.pop();
console.log(myStrings);

// note, it optionally returns value of element removed
let lastElement = myStrings.pop();
console.log(lastElement);

// removing from beginning, .shift()
myStrings.shift();
console.log(myStrings);

// note, it optionally returns value of element removed
let firstElement = myStrings.shift();
console.log(firstElement);

// to remove element from index i, use splice
// but don't set a value_to_add

myStrings.splice(2, 0);
console.log(myStrings);

// logic methods on arrays

// checking if values exist in arrays

const students = ["joe", "jane", "smoth"];

console.log(students.indexOf("joe"));
// 0
console.log(students.indexOf("remi"));
// -1 (undefined)

// check to see if array includes a value
console.log(students.includes("joe"));
// true
console.log(students.includes("remi"));
// false
// also has a from_index paramater
// check after certain index
console.log(students.includes("joe", 1));
// false

// cloning arrays
// as arrays are muteable, good to clone, or else can have headaches
const sheeps = ["🐑", "🐑", "🐑"];

// two ways to clone

// Old way
const cloneSheeps = sheeps.slice();

// ES6 way
const cloneSheepsES6 = [...sheeps];

// what if we used = instead
// headaches

const sheeps2 = sheeps;

sheeps2.push("🐺");

console.log(sheeps2);
// [ '🐑', '🐑','🐑', '🐺' ]

// Ahhh 😱 , our original sheeps have changed?!
console.log(sheeps);
// [ '🐑', '🐑','🐑', '🐺' ]
