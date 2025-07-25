package org.example.lessons.ArrayList.Challenge;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringJoiner;

public class Challenge1 {

    public static void main(String[] args) {

        ArrayList<String> arrayTest = new ArrayList<String>(Arrays.asList("Bananas","Bananas","Bananas"));
        arrayTest.add("Apple");
        arrayTest.add("Jenna");
        arrayTest.add("Banana");
        arrayTest.add("Per");
        arrayTest.add("Bananas");




//        System.out.println(findLongestWord(arrayTest));

//        ArrayList<Integer> numbers = new ArrayList<Integer>();
//        numbers.add(5);
//        numbers.add(9);
//        numbers.add(8);
//        numbers.add(6);
//        numbers.add(1);
//        System.out.println(numbers);
//        removeEvenNumbers(numbers);
//        System.out.println(numbers);
        System.out.println(generateGreetings(arrayTest));



    }
    public static String findLongestWord(ArrayList<String> words) {
        int largestIndex = 0;
        for(int i = 0; i < words.size(); i++) {
            if (words.get(i).length() > words.get(largestIndex).length()) {
                largestIndex = i;
            }
        }
        // other method
        // using lambda (arrow) function to sort array by length
        // words.sort((a, b) -> b.length() - a.length());
        // return words.getFirst();


        return words.get(largestIndex);
    }

    public static void removeEvenNumbers(ArrayList<Integer> numbers) {
        numbers.removeIf( n -> n % 2 == 0 );

    }
    public static ArrayList<String> generateGreetings(ArrayList<String> names) {

        ArrayList<String> newNames = (ArrayList) names.clone();


        // remove elements with length < 4
        newNames.removeIf( n -> n.length() < 5 );
        // sort
        newNames.sort(null);
        // remove duplicates
        for (int i = 1; i < newNames.toArray().length; i++) {
            if (newNames.get(i-1).equals(newNames.get(i))) {
                newNames.remove(i);
            }
        }
        // add Hello, ... !

        for (int i = 0; i < newNames.toArray().length; i++) {
            newNames.set(i, "Hello, " + newNames.get(i) + "!");
        }
        return newNames;
    }


}
