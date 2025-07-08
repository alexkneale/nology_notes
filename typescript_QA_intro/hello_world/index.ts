// what is typescript?
// a typed superset of js language
// compile to plain js
// static type checking (types are optional or intferrd)
// way to catch common errors in development (rather than things falling apart at runtime)
// valid js in ts produces valid js when compiled
// compilation and ide errors are only visible to the developer
let world: string = `World`;
console.log(`Hello ${world}`);

// to install typescript
// npm i -g typescript

// then create a new file in folder with .ts
// to compile/convert to js do the following
// tsc {filename}
// this will create a .js file with same name
// to run .ts or .js file in terminal
// node {filename}
