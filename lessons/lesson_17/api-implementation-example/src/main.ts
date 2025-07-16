import { getCharDataTryCatch, getNChar, getAllChars } from "./api";
import type { Character } from "./Character";
import "./style.scss";

const BASE_URL = "https://rickandmortyapi.com/api/character";

// DOM manipulation

const container = document.querySelector<HTMLDivElement>("#charList");
if (!container) throw new Error("Container not found");

// want function that let's us create a character card to display
// to display all the character data on the front end

const charCardGenerator = (char: Character | null) => {
    if (char) {
        // create new div which will be card
        const card = document.createElement("div");
        // create paragraph element for character name to put in div card
        const name = document.createElement("p");
        // create paragraph element for origin to put in div card
        const origin = document.createElement("p");
        // create paragraph element for location to put in div card
        const location = document.createElement("p");
        // create img element for image to put in div card
        const image = document.createElement("img");
        // create paragraph element for occurences to put in div card
        const occurences = document.createElement("p");

        // add character values to paragraphs/images
        name.innerText = char.name;
        origin.innerText = char.origin.name;
        location.innerText = `Current Location: ${char.location}`;
        image.src = char.image;
        occurences.innerText = `Appears in ${char.occurences} episodes`;

        // add all paragraphs/images as children of card div

        const children = [name, origin, location, image, occurences];

        children.forEach((e) => {
            card.appendChild(e);
        });

        container.appendChild(card);
    } else {
        const errorMessage = document.createElement("div");
        errorMessage.innerText = "Error Loading Data";
        return errorMessage;
    }
};

// get random char

const randomChar = await getCharDataTryCatch(BASE_URL);

charCardGenerator(randomChar);

// multiple characters

const randomCharacters = await getNChar(10);
console.log(randomCharacters);

// then call card generator on each element of array of characters

randomCharacters.forEach((elem) => charCardGenerator(elem));
