//spread operator
// allows iterable, such as array or string, to
// be expanded in places where zero or more
// arguments (for function calls) or elements
// (for array literals) are expected.

oldArr = ["a", "b", "c"];

console.log(...oldArr);
// a b c

// so can use spread to clone
newArr = [...oldArr];

//// array iterator methods
// how can we loop throigh arrays more easily

//for each
// essentially a function
// note don't have to use word element, can be anything
oldArr.forEach((element) => {
    console.log(`array element : ${element}`);
});

// problems with foreach
// can't return anything from it within the foreach func

const test = (arr) => {
    arr.forEach((element) => {
        return element;
    });
};

console.log(test(oldArr));
// returns undefined

// loophole
// have return at end (outside of loop)

const testLoopHole = (arr) => {
    newArr = [];
    arr.forEach((element) => {
        newArr.push(element + "yes");
    });
    return newArr;
};

console.log(testLoopHole(oldArr));
// but we're still returning an array

// for each takes more parameters

const test2 = (arr) => {
    arr.forEach((element, index, targetArr) => {
        targetArr.push(element + "yes");
    });
};

console.log(test2(oldArr));

// but foreach is useful for DOM manipulationo
// when you have array of html elements
// you want to add some attributes/characteristics

//// map()
// we have array of X number of elements, and want
// an array of X number of elements
// with some relationships between individual elements
// in first array to second array

// what .map() does under the hood (simplistic)
// note, map does not modify original array
// simply RETURNS a new array

const map = (arr, func) => {
    const newArr = [];

    for (let i = 0; i < arr.length; ++i) {
        const currentItem = arr[i];
        const newValue = func(currentItem);
        newArr.push(newValue);
    }
    return newArr;
};

numArr = [1, 2, 3, 4];

console.log(numArr.map((n) => n ** 2));
// 1,4,9,16

const increment = (n) => n + 1;
console.log(numArr.map(increment));
// 2,3,4,5

// callback function of .map()  has other params apart from n (elemnt):
// - index
// - array, which .map() was called upon

numArr.map((n, index) => (index % 2 === 0 ? n++ : n--));

//// note on const and let

// if we use let to bind two variables
// not pointing to same place in memory
// just at particular time when = used

let a1 = 9;
let a2 = a1;

a2 += 1;

console.log(a1);
// 9
console.log(a2);
// 10

// filter
// filters elements of array into new array based on a condition
// if cond true --> element is added to new array

// what filter does under the hood
// note it returns new array, DOESNT modify old array

const filer = (arr, func) => {
    const newArr = [];

    for (let i = 0; i < arr.length; i++) {
        const current = arr[i];
        const shouldKeep = func(current);
        if (shouldKeep) {
            newArr.push(current);
        }
    }
    return newArr;
};

// filtering odd numbers
console.log(
    "JS filer ",
    numArr.filter((n) => n % 2)
);
// filtering even numbers
console.log(
    "JS filer ",
    numArr.filter((n) => !(n % 2))
);

//// every
// a filter, but checking that EVERY element in array fits condition
// will return one value: either true or false

console.log(numArr.every((n) => n < 100));
// true
console.log(numArr.every((n) => n % 2));
// false

//// some
// like every, but only checks that AT LEAST 1 element
// in array fits condition
// will return one value: either true or false

console.log(numArr.some((n) => n < 100));
// true
console.log(numArr.some((n) => n % 2));
// true

//// reduce
//

// say we want to sum these scores
// can use for loop, but that's long
const scores = [0, 10, 12, 13, 15, 18];

// reduce is better
// takes params:
// - callback function
// - - with inner params
// - - accumulator (acc) : what scores are being successively added to)
// - - current score (score): what score is at every iteration (individual elements in array)
// - initial value (initialValue): initial value of acc
// if not specified, defaults to first element in array
const sumScores = (scoresArr, initialValue = null) => {
    return scoresArr.reduce((acc, score) => {
        return acc + score;
    }, initialValue);
};

// example of using all params of .reduce()
const toEncrypt = "encrypted";

const encryptString = (toEncrypt) => {
    if (toEncrypt.length > 0) {
        const initial_val = [[], [], []];
        const toEncryptArr = toEncrypt.split("");

        const encrypted = toEncryptArr.reduce(
            (acc, character, current_index) => {
                console.log(current_index % 3);
                console.log(acc[current_index % 3]);
                acc[current_index % 3].push(character);
                return acc;
            },
            initial_val
        );

        return encrypted.flat().join("");
    }
    return "";
};
console.log(encryptString(toEncrypt));

console.log(sumScores(scores));

// join
// every

const arrExperiment = [-1, "disco", "3", 5, "15", 2, 0];

const fizzBuzzArr = arrExperiment.map(Number);
console.log(fizzBuzzArr);

//// .sort()
// NB, it does not return new array, but MODIFIES ORIGINAL
//The default sort order is ascending, built upon converting the elements into strings, then comparing their sequences of UTF-16 code unit values.
const characterArr = ["b", "b", "b", "g", "l", "n", "x", "x"];
console.log(characterArr.sort());

//// .reverse()
// reverse order of elements in an array
const stringOne = "racecar";
const reversed = stringOne.split("").reverse().join("");

//// .flat()
// to flatten nested (multidim) array
const arr1 = [0, 1, 2, [3, 4]];

console.log(arr1.flat());
// expected output: Array [0, 1, 2, 3, 4]
