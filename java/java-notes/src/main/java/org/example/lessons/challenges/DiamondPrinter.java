package org.example.lessons.challenges;

import java.util.List;
import java.util.ArrayList;

class DiamondPrinter {

    static List<String> printToList(char a) {
        int numLetters = a - 'A';
        int numDims = 1 + 2 * numLetters;

        List<String> myList = new ArrayList<>(numDims);

        // Fill list with empty placeholders first
        for (int i = 0; i < numDims; i++) {
            myList.add("");  // You can also use null
        }

        char currentLetter = 'A';

        // Top and bottom row
        myList.set(0, " ".repeat(numLetters) + "A" + " ".repeat(numLetters));
        myList.set(numDims - 1, " ".repeat(numLetters) + "A" + " ".repeat(numLetters));

        for (int divider = 1; divider <= numLetters - 1; divider++) {
            currentLetter = (char) ('A' + divider);
            String currentString = " ".repeat(numLetters - divider)
                    + currentLetter
                    + " ".repeat(2 * divider - 1)
                    + currentLetter
                    + " ".repeat(numLetters - divider);

            myList.set(divider, currentString);               // upper half
            myList.set(numDims - 1 - divider, currentString); // lower half
        }
        myList.set(numLetters, a+" ".repeat(numDims - 2)+a);


        return myList;


}

    public static void main(String[] args) {



        List<String> diamondArr = printToList('D');
        System.out.println(diamondArr);
    }

}

