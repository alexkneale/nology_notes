import type { Character } from "./Character";

// total of 826 characters in total in rickn morty
const TOTAL_CHAR_COUNT = 826;
const BASE_URL = "https://rickandmortyapi.com/api/character";

// API

// we want to get all the characters from the Rick n Morty API
// https://rickandmortyapi.com/api

// To start, we will get 5 characters and display their info
// Name, origin, location, img, number of episodes

// in this case, results are shown 20 at a time in "results" object
// there is also an "info" object, which gives url for next page
// there are 42 pages total (each with 20 characters)

// trying to get one character
// with random ID
// there are 826 chraracters total

const randomIdGen = (n: number) => {
    return Math.ceil(Math.random() * n);
};

export const getCharData = async (url: string): Promise<Character> => {
    // fetch url of random character
    const response = await fetch(`${url}/${randomIdGen(TOTAL_CHAR_COUNT)}`);
    // convert response into javascript object
    const data = await response.json();
    const cleanedData = {
        name: data.name,
        origin: data.origin,
        location: data.location.name,
        image: data.image,
        occurences: data.episode.length,
    };
    return cleanedData;
};

console.log(await getCharData(BASE_URL));

//// try ... catch
// try to call func, and catch error if it doesn't run
// same func as above, but with try catch
export const getCharDataTryCatch = async (
    url: string
): Promise<Character | null> => {
    try {
        // fetch url of random character
        const response = await fetch(`${url}/${randomIdGen(TOTAL_CHAR_COUNT)}`);
        // convert response into javascript object
        const data = await response.json();

        if (!response.ok) {
            // thrown error is then CAUGHT in catch below
            // CATCH allows us to do stuff when there is error
            // not just throw error and call it a day
            // eg below in catch we return null
            throw new Error(
                `API error: API request failed with error message: ${response.statusText} and error code ${response.status}`
            );
        }
        const cleanedData = {
            name: data.name,
            origin: data.origin,
            location: data.location.name,
            image: data.image,
            occurences: data.episode.length,
        };
        return cleanedData;
    } catch (error) {
        if (error instanceof Error) {
            console.error(`Fetched failed with error: ${error}`);
        } else {
            console.error(`Unknown error: ${error}`);
        }
        return null;
    }
};

console.log(await getCharDataTryCatch(BASE_URL));
// trying to get more than one character
// all characters on one page
// all characters on all pages

// function to get N character data

export const getNChar = async (n: number): Promise<(Character | null)[]> => {
    const charArr = [];
    for (let i = 0; i < n; i++) {
        charArr.push(await getCharDataTryCatch(BASE_URL));
    }
    return charArr;
};

// getting all characters
export const getAllChars = async (url: string): Promise<Character | null[]> => {
    try {
        // fetch url of random character
        const response = await fetch(url);

        if (!response.ok) {
            throw new Error(
                `API error: API request failed with error message: ${response.statusText} and error code ${response.status}`
            );
        }
        // convert response into javascript object
        const data = await response.json();
        return data.results.map((char: any) => {
            return {
                name: char.name,
                origin: char.origin,
                location: char.location.name,
                image: char.image,
                occurences: char.episode.length,
            };
        });
    } catch (error) {
        if (error instanceof Error) {
            console.error(`Fetched failed with error: ${error}`);
        } else {
            console.error(`Unknown error: ${error}`);
        }
        return [];
    }
};
