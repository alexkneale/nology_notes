import { FoodType } from "./../../src/ts/Food";

// func for filtering by junk/healthy
const filterFoodType = (type: FoodType | "All") => {
    // submit button
    const submit = cy.get("button");
    // dropdown list
    const dropdown = cy.get("#sortFood");
    dropdown.select(type);
    submit.click();
};

describe("Testing FoodShop", () => {
    // command to run before each test
    beforeEach(() => {
        // navigate to website
        cy.visit("http://localhost:5173/");
    });

    it("Should have the right heading with right content and should be visible", () => {
        // get h1 heading
        const heading = cy.get("h1");
        // assert that it's visible
        heading.should("contain", "FoodShop").should("be.visible");
    });

    // testing interactivity --> filtering button works alright

    it("Should allow the user to filter out healthy food ", () => {
        // choosing junk food
        filterFoodType(FoodType.JUNK);
        // testing results
        // grid/container with elements
        const container = cy.get("#foodContainer");
        // elements within container
        // there should be 4 of them
        container.children().should("have.length", 4);

        // checking content on page
        // check salad is NOT on page
        const salad = cy.contains("Salad");
        salad.should("not.exist");

        // check pizza does exist
        const pizza = cy.contains("Pizza");
        pizza.should("exist");
    });
});
