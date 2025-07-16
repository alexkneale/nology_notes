import {
    capitalizeString,
    filterFoodByType,
    sortByRating,
} from "./foodUtilities";
import { Food, FoodType } from "./Food";
import foodStock from "./foodData";

const foodData = [...foodStock];

const SORTED_ARRAY = [
    { img: "🍕", name: "pizza", foodType: FoodType.JUNK, rating: 10 },
    {
        img: "🌯",
        name: "burrito",
        foodType: FoodType.HEALTHY,
        rating: 9,
    },
    { img: "🍔", name: "burger", foodType: FoodType.JUNK, rating: 7 },
    { img: "🥙", name: "pita", foodType: FoodType.HEALTHY, rating: 6 },
    { img: "🥗", name: "salad", foodType: FoodType.HEALTHY, rating: 4 },
    { img: "🍟", name: "fries", foodType: FoodType.JUNK, rating: 3 },
    { img: "🌭", name: "hot dog", foodType: FoodType.JUNK, rating: 3 },
    {
        img: "🥪",
        name: "sandwich",
        foodType: FoodType.HEALTHY,
        rating: 2,
    },
    { img: "🥣", name: "soup", foodType: FoodType.HEALTHY, rating: 1 },
];

// test capitalizeString for at least three different scenarios

describe("Testing capitalizeString function", () => {
    test("One word string, should return capitalized", () => {
        expect(capitalizeString("jeffrey")).toBe("Jeffrey");
        expect(capitalizeString("hello")).toBe("Hello");
    });

    test("Long sentence just with words, should capitalize first character of each word", () => {
        expect(capitalizeString("jeffrey shat himself")).toBe(
            "Jeffrey Shat Himself"
        );
    });

    test("Long sentence with words and numbers, should capitalize first character of each word", () => {
        expect(capitalizeString("jeffrey shat himself! 13 times 3ways")).toBe(
            "Jeffrey Shat Himself! 13 Times 3ways"
        );
    });
});

// Test filterFoodByType for at least three different scenarios

describe("Testing filterFoodType", () => {
    test("Should return an array of objects with only HEALTHY FoodType items ", () => {
        expect(filterFoodByType(FoodType.HEALTHY, foodData)).toStrictEqual([
            { img: "🥗", name: "salad", foodType: FoodType.HEALTHY, rating: 4 },
            { img: "🥙", name: "pita", foodType: FoodType.HEALTHY, rating: 6 },
            {
                img: "🥪",
                name: "sandwich",
                foodType: FoodType.HEALTHY,
                rating: 2,
            },
            {
                img: "🌯",
                name: "burrito",
                foodType: FoodType.HEALTHY,
                rating: 9,
            },
            { img: "🥣", name: "soup", foodType: FoodType.HEALTHY, rating: 1 },
        ]);
    });

    test("Should return an array of objects with only JUNK FoodType items", () => {
        expect(filterFoodByType(FoodType.JUNK, foodData)).toStrictEqual([
            { img: "🍕", name: "pizza", foodType: FoodType.JUNK, rating: 10 },
            { img: "🍔", name: "burger", foodType: FoodType.JUNK, rating: 7 },
            { img: "🍟", name: "fries", foodType: FoodType.JUNK, rating: 3 },
            { img: "🌭", name: "hot dog", foodType: FoodType.JUNK, rating: 3 },
        ]);
    });

    test("Should return an array containing the pizza object if filtering by JUNK types ", () => {
        expect(filterFoodByType(FoodType.JUNK, foodData)).toEqual(
            expect.arrayContaining([
                {
                    img: "🍕",
                    name: "pizza",
                    foodType: FoodType.JUNK,
                    rating: 10,
                },
            ])
        );
    });
});

describe("Testing sortByRating function which sorts food by rating in descending order", () => {
    test("Check that length of sorted and unsorted arrays is the same", () => {
        const arrCopy = [...foodData];

        expect(sortByRating(arrCopy).length).toBe(foodData.length);
    });

    test("To check that items sorted correctly by function", () => {
        const arrCopy = [...foodData];

        expect(sortByRating(arrCopy)).toStrictEqual(SORTED_ARRAY);
        // check length is as expected
        expect(sortByRating(arrCopy)).toHaveLength(9);
    });

    test("Empty array test. Check to see if function returns empty array, when inputted empty array.", () => {
        expect(sortByRating([])).toStrictEqual([]);
        expect(sortByRating([])).toHaveLength(0);
    });
});
