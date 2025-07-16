import "./style.scss";

// complex data --> arrays of objects, objects containing other objects
// how to navigate all this?

// recall main array methods

// ones that mutate original array
// .pop()
// .push()
// .splice()
// .shift()
// .unshift

// ones that DONT mutate original array
// .filter()
// .map()
// .every()
// .some()
// .forEach()
// .reduce()

// CAN APPLY THESE TO ARRAY OF OBJECTS

// for in loop

type Dog = {
    breed: string;
    age: number;
};

const Snoopy: Dog = {
    breed: "dachs",
    age: 23,
};
for (const key in Snoopy) {
    console.log(`Key: ${key}`);
    console.log(`Value: ${Snoopy[key as keyof Dog]}`);
}

// here we create cat, without giving specific properties
// just layout of what the types of keys and values are
type Cat = {
    [key: string]: string | number;
};

const myCat: Cat = {
    name: "Fluffy",
    age: 7,
    breed: "orange",
};

// built in methods for objects --> method applied on OBJECT itself

// Object.values(myObject)
// returns array of all values
const values = Object.values(myCat);
console.log(values);

// Object.keys(myObject)
// returns array of all keys
const keys = Object.keys(myCat);
console.log(keys);

// Object.entries(myObject)
// returns 2d/nested arrray of all key value pairs
// [[key1, value1], [key2, value2],...]
const entries = Object.entries(myCat);
console.log(entries);

/// useful for many tasks like translation

const morse = {
    a: "--..",
    b: "...",
    c: "-.-",
};

// if we want to reverse object
const morseEntries = Object.entries(morse);
const reverseObject = morseEntries.reduce((acc: any, [key, value]) => {
    // below we set initial value of acc as empty object
    acc[value] = key;
    return acc;
}, {});

console.log(reverseObject);

// check that object contains key
const checkKey = myCat.hasOwnProperty("name");
console.log(checkKey);
// true

// Array of Objects

// object, which has complex key value pairs (other objects or arrays of objects)
const myHouse = {
    // rooms is array of objects
    rooms: [
        { name: "Front Hall", hasFirePlace: false },
        { name: "Kitchen", hasFirePlace: true },
        { name: "Best Bedroom", hasFirePlace: true },
        { name: "Pantry", hasFirePlace: false },
    ],
    // address is object
    address: {
        houseName: "Bag End",
        street: "Bagshot",
        town: "Hobuton",
        region: "The Shire",
    },
};

// Having type safety for complex data structures
// have to create type for larger container object (myHouse), and entries (rooms and address)

type House = {
    rooms: Room[];
    address: Address;
};
type Room = {
    name: string;
};

//// UNIT TESTING

// E2E --> end to end --> tests application's workflow from
// beginning to end, to make sure everything functions as expected

// Integration tests --> ensure than an entire integrated system meets a
// set of requirements (eg speed, latency performance). it is performed
// in an integrated hardware and software environment ot ensure that the entire
// system functions properly (VERY EXPENSIVE)

// Unit Tests --> checking small pieces of code to ensure that the inidividual parts
// of the program work properly on their own, speeding up testing strategies and
// reducing wasted tests
