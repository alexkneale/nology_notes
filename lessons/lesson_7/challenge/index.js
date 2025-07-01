// # Challenge: Sum of `n`

// ### MVP:

// Create a function with a for loop that will add all the numbers up to n

// 1. You should create a variable to set the upper limit of your loop
// 2. Your loop should increment by 1 on each iteration
// 3. Your loop should print the final result

// ```js
// sum(10) => 55
// ```

const sum = (n) => {
    let counter = 0;
    for (i = 1; i <= n; i++) {
        counter += i;
    }
    console.log(counter);
};

sum(10);
// ## Challenge: Capitalizing Odd Positioned Letters

// ### MVP

// -   Create a variable with a string of your choice
// -   Loop through the letters in this string and build a new string
// -   If the current index is odd, capitalize the letter before adding it to the new string

const buildString = (string) => {
    for (let i = 0; i < string.length; i++) {
        let letters = string.spl;
    }
};
// ### Bonus

// -   If the current index is even increment the letter
//     -   E.g: `a becomes b`, `d becomes e`, `t becomes u`
//     -   Final: `z becomes a`

// ---

// ## Challenge: Removing Vowels

// ### MVP

// -   Create a variable with a string of your choice
// -   Loop through the letters in this and build a new string
// -   The new strings should be the same as the input with the vowels missing
// -   E.g: `calum => clm`, `rachel => rchl`, `martyna => mrtyn`

// ### Bonus

// -   Keep vowels in the new strings if they are succeeded by the letters `l`, `m`,
//     or `r`
// -   E.g: `calum => calum`, `rachel => rchel`,
// `martyna => martyn`

const array = ["james", "smith"];
console.log(array[0]);
