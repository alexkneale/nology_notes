package org.example.lessons.challenges;

import java.util.Arrays;

public class ArrayUtils {
//    # Challenge: Increment Items in an Array
//
//### MVP:
//
//            -   Create a class called `ArrayUtils`
//            -   Create a static method that takes in an `int[]`
//            -   ... and returns a new `int[]` where all numbers have been incremented
//-   Input => Output Examples:
//            -   `{ 1, 2, 3 }` => `{ 2, 3, 4 }`
//            -   `{ 45, 23 }` => `{ 46, 24 }`
//            -   `{ }` => `{ }`
//
//            ## Challenge: Reverse Items in an Array
//
//-   Create a static method that takes in `int[]` on your `ArrayUtils` class
//-   ... and returns a new `int[]` where all the items are in the reverse order
//-   Input => Output Examples:
//            -   `{ 1, 2, 3 }` => `{ 3, 2, 1 }`
//            -   `{ 45, 23 }` => `{ 23, 45 }`
//            -   `{ }` => `{ }

    public static void main(String[] args) {

        int[] arrayTest = {1,2,3,4,54};
        System.out.println(Arrays.toString(incrementValues(arrayTest)));
        System.out.println(Arrays.toString(reverseValues(arrayTest)));



    }

    public static int[] incrementValues(int[] inputArray) {
        if(inputArray.length == 0) return inputArray;
        int[] output = new int[inputArray.length];
        for(int i = 0; i < inputArray.length; i++) {
            output[i] = inputArray[i]+1;
        }
        return output;
    }

    public static int[] reverseValues(int[] inputArray) {
        if(inputArray.length == 0) return inputArray;
        int[] output = new int[inputArray.length];
        for(int i = 0; i < inputArray.length; i++) {
            output[i] = inputArray[inputArray.length-1-i];
        }
        return output;
    }
}
