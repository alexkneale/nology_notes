/* ## Challenge: Sum of `n`

### MVP:

Create a function with a for loop that will add all the numbers up to n

1. You should create a variable to set the upper limit of your loop
2. Your loop should increment by 1 on each iteration
3. Your loop should print the final result

```js
sum(10) => 55
``` 
*/

//Code here
let counter = 0;

const sum = (n) => {
    for (let i = 0; i <= n; i++) {
        counter += i;
    }
    console.log(counter);
};

sum(10);
/*
### MVP

-   Create a variable with a string of your choice
-   Loop through the letters in this string and build a new string
-   If the current index is odd, capitalize the letter before adding it to the new string

### Bonus

-   If the current index is even, increment the letter
    -   E.g: `a becomes b`, `d becomes e`, `t becomes u`
    -   Final: `z becomes a`

---
*/
//CODE HERE

const badger = "small black and white animal.";

const buildNewString = (string) => {
    let newString = "";
    let alphabet = /[a-yA-Y]/;
    for (let i = 0; i < string.length; i++) {
        if (i % 2 === 0) {
            if (alphabet.test(string[i])) {
                newString += String.fromCharCode(string[i].charCodeAt(0) + 1);
            } else if (string[i] === "z") {
                newString += "a";
            } else if (string[i] === "Z") {
                newString += "A";
            } else newString += string[i];
            continue;
        }
        newString += string[i].toUpperCase();
    }
    console.log(newString);
};
buildNewString(badger);

/*
## Challenge: Removing Vowels

### MVP

-   Create a variable with a string of your choice
-   Loop through the letters in this and build a new string
-   The new strings should be the same as the input with the vowels missing
-   E.g: `calum => clm`, `rachel => rchl`, `martyna => mrtyn`

### Bonus

-   Keep vowels in the new strings if they are succeeded by the letters `l`, `m`,
    or `r`
-   E.g: `calum => calum`, `rachel => rchel`, 
`martyna => martyn`

*/

//CODE HERE

const string = "MartynA";
// expect Zorn

const removeVowels = (str) => {
    let newString = "";
    let letters = /[lmr]/i;
    let pattern = /[aeiou]/i; //i makes the case insensitive
    for (let i = 0; i < str.length; i++) {
        if (pattern.test(str[i]) && !letters.test(str[i + 1])) {
            continue;
        }

        newString += str[i];
    }
    console.log(newString);
};

removeVowels(string);

// ## Challenge: Generating Unique Random Numbers

// ### MVP

// -   Using a `while` loop generate a list of 10 random unique numbers
// -   Each number must be between 0 and 15

// ### Tips

// -   You may need to google how to generate, you can use the `Math.random()` API

const numbers = [];

let i = 0;

while (i < 10) {
    randomNumber = Math.ceil(Math.random() * 10);
    numbers.push(randomNumber);
    i++;
}

console.log(numbers);

// ## Challenge: `generateNumbers` function

// ### MVP

// Create a function that returns a list of random whole numbers given a range

// -   Create a function called `generateNumbers`
// -   This function should take in 2 numbers
//     -   `n` being the number of numbers to be generated
//     -   `r` being the max range
//     -   E.g: `n: 10, r: 20:` function will generate 10 random numbers between 0
//         and 20
// -   Function should return `n` numbers in range `0 <= n < r`

// ### Bonus

// -   Add an argument to your function called `isUnique`
// -   If this is set to true, there should be no duplicate numbers in the output

// ### Bonus

// -   Add validation to your function to prevent negative values for `n` and `r`
// -   Add validation to ensure `n < r` when `isUnique` is true

const generateNumbers = (n, r, isUnique) => {
    const numbers = [];

    if (n >= 0 && r >= 0) {
        if (isUnique) {
            if (n < r) {
                counter = 0;
                numbersAdded = [];

                while (counter < n) {
                    randomNumber = Math.ceil(Math.random() * r);

                    if (numbersAdded.includes(randomNumber)) {
                        continue;
                    }
                    numbersAdded.push(randomNumber);
                    numbers.push(randomNumber);
                    counter++;
                }

                return numbers;
            }

            return "Need list size to be smaller than max values";
        }

        for (i = 0; i < n; i++) {
            numbers.push(Math.ceil(Math.random() * r));
        }
        return numbers;
    }
    return "No negative values allowed!";
};

console.log(generateNumbers(8, 13, true));
