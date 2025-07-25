package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // boolean
        // 1 byte - 4 bits
        boolean myBool = true;

        // type casting
        // changing type of a variable
        // have to be careful about memory when we try to type cast variable to
        // type with fewer bytes
        // casting where we don't have to worry:
        // byte -> short, int, float, double etc
        // short -> int, long, float, double
        // int --> long, float, double
        // long ->

        byte myByte = 127;
        short myShort = 2134;

        byte newByte = 123;
        short newShort = (short) newByte;

        // now if we do this, we might lose data (not in this example)
        // but generally tricky when casting down (less memory)
        newByte = (byte) newShort;

        System.out.println(myByte + myShort);
        // prints out Integer type as short + byte could potentially lead to value
        // too large for short type --> so convert to int to avoid potential errors
        System.out.println(((Object)(myByte + myShort)).getClass().getName());

        // scanning user input
        // all through terminal
        // How to get user input?
        // user Scanner object (from Scanner class)
        // here source for input is System.in
        Scanner s = new Scanner(System.in);
        System.out.println("Input an integer");
        System.out.println(s.nextInt());



        // How to validate user input?

//        Challenge 1: Create a byte, short, integer and double. Use a scanner to get numerical input from the terminal
//
//        1. Produce an integer by dividing your byte by a number input in the terminal
//        2. Produce a long by multiplying your short by a number input in the terminal
//        3. Produce a double by dividing your integer by a number input in the terminal
//        4. Produce a char that is the first character in a string input in the terminal

        byte challengeByte = 5;
        short challengeShort = 1000;
        int challengeInt = 1_000_000;
        double challengeDouble = 1.123456789;

        System.out.println("Input a number");
        int numberInput = s.nextInt();

        System.out.println(challengeByte/numberInput);
        System.out.println(((Object)(challengeByte/numberInput)).getClass().getName());

        System.out.println(challengeShort*numberInput);
        System.out.println(((Object)(challengeShort*numberInput)).getClass().getName());

        System.out.println(challengeInt/numberInput);
        System.out.println(((Object)(challengeInt/numberInput)).getClass().getName());

        String userString = s.nextLine();
        char firstChar = userString.charAt(0);
        System.out.println(firstChar);




    }
}