// unit test for file calcUtils.ts

// NB dont need {} around addTwoNumbers as we're using default export
import addTwoNumbers from "./calcUtils";

// NB, as we're testing in TS, don't have to test for types
// group tests for same functioon inside describe() block
// describe is a function which takes two params
// - string describing what we're testing
// - callback function
describe("Testing addTwoNumbers", () => {
    //each test() will test for one scenario
    // test is a function which takes two params
    // - string describing what we're testing
    // - callback function
    test("Two positive integers return a number", () => {
        // expect output of function to be 3
        expect(addTwoNumbers(1, 2)).toBe(3);
        // expect output of function to be 5
        expect(addTwoNumbers(2, 3)).toBe(5);
    });

    test("Two floating positive numbers return a number", () => {
        // use toBeCloseTo() to avoid floating point precision errors
        expect(addTwoNumbers(1.2, 2.2)).toBeCloseTo(3.4);
        expect(addTwoNumbers(12.4, 5.7)).toBeCloseTo(18.1);
    });

    test("Two floating negative numbers return a number", () => {
        // use toBeCloseTo() to avoid floating point precision errors
        expect(addTwoNumbers(-1, -4)).toBe(-5);
        expect(addTwoNumbers(-11, -2)).toBe(-13);
    });
});
