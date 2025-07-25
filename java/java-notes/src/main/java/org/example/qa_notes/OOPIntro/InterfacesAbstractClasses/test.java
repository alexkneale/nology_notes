package org.example.qa_notes.OOPIntro.InterfacesAbstractClasses;


public class test {
    public static int[] odds(int numOdds) {
        /**
         * Return an array of the first numOdds odd numbers
         * Arguments
         * numOdds - a positive integer representing the number of odd numbers to store in the array
         * Examples
         * odds(3) returns [1, 3, 5]
         */

        // ====================================
        // Do not change the code before this
        int[] oddArr = new int[numOdds];
        int counter = 1;
        for (int i = 0; i < numOdds; ++i) {
            oddArr[i] = counter;
            counter = counter + 2;

        }
        return oddArr;



        // ====================================
        // Do not change the code after this
    }



    public static void main(String[] args) {
        int[] theOdds = odds(3);
        // Expected output is
        // 1, 3, 5
        System.out.println(theOdds[0] + ", " + theOdds[1] + ", " + theOdds[2]);
    }
}
