import "./style.css";

const btn = document.querySelector<HTMLButtonElement>(".btn");
const container = document.querySelector<HTMLDivElement>("#imgContainer");
const DOG_API = "https://dog.ceo/api";

if (!btn || !container) {
    throw new Error("so saf");
}
// have to add asynchronousity to api call
const getRandomDogImage = async () => {
    const response = await fetch(`${DOG_API}/breeds/image/random`);
    console.log(response);

    // check status is ok
    if (response.status !== 200) {
        throw new Error("Something not right");
    }

    // now extract image from response
    // use .json method, which reads request body and
    // returns it as a promise that resolves with the result
    // of parsing the body text as json
    // data is an object
    const data = await response.json();
    console.log(data);
    // can handle data object normally

    return { imgUrl: data.message };
};

// have to add await below
console.log(await getRandomDogImage());

const handleAdooptClick = async () => {
    const dogImgUrl = await getRandomDogImage();
    const img = document.createElement("img");
    img.src = dogImgUrl.imgUrl;
    container.innerHTML = "";
    container.appendChild(img);
};

btn.addEventListener("click", handleAdooptClick);
