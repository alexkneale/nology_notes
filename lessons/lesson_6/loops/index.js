// Loops

// for loops
// syntax:
// [for keyword] (loop params: start; finish condition; iteration) {
// loop code block to execute
// }

for (let i = 0; i < 3; i++) {
    console.log(`The number is ${i}`);
}

const myString = "This is my string";

// logging every char in string to console
for (let i = 0; i < myString.length; i++) {
    console.log(myString.charAt(i));

    // can also access characters with square brackets
    console.log(myString[i]);
}

// while loops
// for of (for in)
