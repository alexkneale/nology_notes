// Function Scopes

// Global Scope - accessible anywhere (including local scopes) - like public library
// Local Scope - variables defined within blocks of code -- only available locally within that code block
// if if else etc have local scope
// Functions have their own local scope

const circleArea = (radius) => {
    const area = radius ** 2 * Math.PI;
    return area;
};

console.log(circleArea(10));
// below would cause error
// console.log(area);

// screaming snake cases - for variables that should never be touched, like api addresses etc

const MY_CONSTANT = "THIS IS A CONSTANT, DO NOT CHANGE IT";

const myFunc1 = () => {
    const firstName = "John";
    return firstName;
};

const myFunc2 = () => {
    const lastName = "Smith";
    // this would cause error
    // return firstName + lastName

    // this wouldn't
    return myFunc1() + " " + lastName;
};

console.log(myFunc2());

// here we have more complicated example
// here we have nested functions
// in scope1, we can access myGlobal, scope1Arg, myNumber
// in scope2, we can access all above + scope2Arg +  myValue
// in scope3, we can access all above + scope3Arg + myScope3Var

const myGlobal = "Global string";

const scope1 = (scope1Arg) => {
    const myNumber = 123;

    console.log(scope1Arg, myNumber, myGlobal);

    const scope2 = (scope2Arg) => {
        const myValue = true;
        console.log(scope2Arg, myValue, scope1Arg, myNumber, myGlobal);

        const scope3 = (scope3Arg) => {
            const myScope3Var = "Calum";
            console.log(
                scope3Arg,
                myScope3Var,
                scope2Arg,
                myValue,
                scope1Arg,
                myNumber,
                myGlobal
            );
        };

        scope3("In Scope 3");
    };
    scope2("In Scope 2");
};

console.log(scope1("In scope 1"));

// what if we try to change global variable within local variable ?

const myVar = "Something";

const doesSomething = (myVar) => {
    return myVar.toUpperCase();
};

// this would cause error,
// as function does not assume argument is not global variable (even if they have same name)
//console.log(doesSomething());

// this would not
console.log(doesSomething(myVar));

const doesSomethingElse = (string) => {
    // this would not cause error
    // we can define variable in local scope with same name as that in global scope
    // however, generally discouraged to use same names in local vs global scopes

    const myVar = string + "hello";
    return myVar.toUpperCase();
};

console.log(doesSomethingElse("yes "));

const doesAnotherThing = () => {
    // this would not cause error
    // as global variable is accessible in local scope
    return myVar.toUpperCase();
};

console.log(doesAnotherThing());

// generally, globals lead to unintended bugs

let myVal = "123";
const add = (n) => {
    if (typeof n !== "number") {
        throw new Error(`${n} is not  number`);
    }
    return n + myVal;
};

console.log(add(3));
// prints 3123, and not 126, as myVal is string
// problem is we're not checking type of global variable myVal is number
// so leading to results we didn't want
