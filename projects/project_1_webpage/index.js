// a function to animate typing and deleting of a single text string

function typeWriterSequence(
    element, //  DOM element to type into
    text, // text content to animate
    typingSpeed, // delay between each character typed
    pause, // delay after the full text is typed
    deletingSpeed, // delay between each character deleted
    onComplete // callback to run once typing + deleting is done
) {
    let i = 0; // Current character index
    let isDeleting = false; // are we deleting or typing?

    // Core typing function
    function type() {
        if (!isDeleting) {
            // show one more character, if typting
            element.textContent = text.substring(0, i + 1);
            i++;

            // check to see we've reached full text, then start deleting
            if (i === text.length) {
                isDeleting = true;
                setTimeout(type, pause); // Wait before deleting
                return;
            }
        } else {
            // remove one character, if deleting
            element.textContent = text.substring(0, i - 1);
            i--;

            // Once fully deleted, call the onComplete callback
            if (i === 0) {
                isDeleting = false;
                if (typeof onComplete === "function") {
                    setTimeout(onComplete, 700); // small pause before restarting
                    return;
                }
            }
        }

        // Continue the loop at the appropriate speed
        // loops by self-invoking
        setTimeout(type, isDeleting ? deletingSpeed : typingSpeed);
    }

    // start typing loop
    type();
}

// wait until the page has fully loaded before starting animation
window.addEventListener("DOMContentLoaded", () => {
    const h2 = document.getElementById("animation"); // get <h2> element

    // function that starts the animation, and calls itself again after it's done
    function startSequence() {
        typeWriterSequence(
            h2,
            "Hi, I'm Alex 👋", // text content to animate
            100, // delay between each character typed
            1500, // delay after the full text is typed
            50, // delay between each character deleted
            startSequence // callback to restart the loop
        );
    }

    // begin animation loop
    startSequence();
});
