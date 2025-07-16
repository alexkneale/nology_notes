//// Objects?
// way of storing related info in a single variable
// allow you to represent entities (not just one aspect, but whole entity)

// we use object literal notation to create own basic objects
// - comma separated
// - key: value pairs to store properties

let person = {
    // keys and values
    name: "John",
    age: 20,
};

// a value can be any data type (including another object)

// mostly use dot notation, but there are special use cases for square bracket notation

console.log(person.name); // John
console.log(person["name"]); // John
