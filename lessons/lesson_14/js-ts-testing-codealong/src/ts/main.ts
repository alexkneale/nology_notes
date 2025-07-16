import { FoodType } from "./Food";

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

//// TDD (Test Driven Development)
// write test cases BEFORE you write your code

// Defining expected behaviours
// Defining possible edge cases (possible scenarios that are trickier/may trigger errors)
// Defining what func should do in case of errors (toThrow)

//// E2E (end to end) Testing
// validates an entire user journey works as expected
// Cypress --> popular E2E testing framework, built with JS
//

import "./../style.scss";
import { filterFoodByType, generateFoodHTML } from "./foodUtilities";
import foodStock from "./foodData";
const form = document.querySelector<HTMLFormElement>("#form");

// drop down selector
const select = document.querySelector<HTMLSelectElement>("#sortFood");

// container to add grid of food to
const container = document.querySelector<HTMLDivElement>("#foodContainer");

if (!form || !select || !container)
    throw new Error("One or more leement could not be found!");

// place images
container.innerHTML = generateFoodHTML(foodStock);

const handleSubmitForm = (event: Event) => {
    // as default for a submit event is to refresh page
    event.preventDefault();
    // value of selected dropdown
    const selectedFoodType = select.value;

    let foodToDisplay = foodStock;

    if (
        selectedFoodType === FoodType.HEALTHY ||
        selectedFoodType === FoodType.JUNK
    ) {
        foodToDisplay = filterFoodByType(selectedFoodType, foodToDisplay);
    }
    // check for case that selected = "All" (not a foodtype)
    container.innerHTML = generateFoodHTML(foodToDisplay);
};

// add listener for form being submitted, then call function to filter display based
form.addEventListener("submit", handleSubmitForm);
