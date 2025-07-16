import "./style.scss";

// object example
const myObject = {
    name: "Remi",
    age: 36,
};
console.log(myObject);

const dog = {
    name: "Rex",
    legs: 4,
    color: "Tan",
    breed: "Shiba inu",
};

console.log(dog);
// breed: "Shiba inu"
// color :  "Tan"
// legs: 4
// name: "Rex"

console.log(dog.breed);
// "Shiba inu"

// modifying objects

dog.breed = "Akita Inu";
console.log(dog.breed);
// "Akita Inu"

// cannot add key-value pair directly to object
// error
// dog.age = 6;

// also have to respect type of original object instance

// error, as legs had number type originally
// dog.legs = "hello"

// Type Aliases
// way of defining template for objects

type Dog = {
    name: string;
    breed: string;
    legs: number;
    color: string;
    age: number;
    // optional key
    smells?: boolean;
};

// now can create object of type Dog
const newDog: Dog = {
    name: "Rex",
    legs: 4,
    color: "Tan",
    breed: "Shiba inu",
    age: 5,
};
// now that we have type or (template) for any dog
// we can create functions (as we know what each dog should have)

const printDogInfo = (dog: Dog) => {
    console.log(`${dog.name} is a ${dog.breed}`);
};

printDogInfo(newDog);

//// Copying objects
// again, using = binds two objects together so discouraged
// called 'shallow-copy'. Just extra reference to same content

// const myDog = newDog;

// use spread operator for deep copy
const deepCopyDog = { ...newDog };
deepCopyDog.name = "jeff";

//// Object Destructuring
// when you grab key value pairs from object and leave the rest
// leaves original object untouched

const { name, breed } = deepCopyDog;
console.log(name, breed);

// what we effectively do is create globally accessible
//  variables taken from one object
