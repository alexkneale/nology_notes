// break
// in loops might want to break from iteration/ for loop
// without exitting completely from whole process you are running

// continue
// way of continuing process after checking certain condition

const sentence = "This is a sentence. It has two parts.";
const letter = "a";
let counter = 0;

const charCounter = () => {
    const maxLimit = "char limit reached";

    for (let i = 0; i < sentence.length; i++) {
        const char = sentence.charAt(i);
        console.log(`char at index ${i} is ${char}`);
        if (char === letter) {
            // here we don't add to counter
            // in other words, don't execute code outside of this block
            // just go ahead to next i value in for loop
            continue;
        }
        if (char === ".") {
            // here we exit for loop
            break;
        }

        if (counter > 15) {
            return "Char limit reached";
            // return exits function
        }
        counter += 1;
        console.log(counter);
    }
    // BREAK brings you here
    console.log("Outside of for loop");
};

console.log(charCounter());

// while loop
// syntax
// {while keyword} (stop condition) {block of code}

let value = Math.ceil(Math.random() * 10);

while (value !== 7) {
    console.log(value);
    value = Math.ceil(Math.random() * 10);
}

// using while loop as you would a for loop
const randomString = "I am random";

let i = 0;

while (i < randomString.length) {
    // can use continue in a while loop
    if (randomString[i] === "a") {
        i++;
        continue;
    }
    console.log(randomString[i]);
    i++;
}

console.log("After while loop");
