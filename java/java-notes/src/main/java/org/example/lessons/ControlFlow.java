package org.example.lessons;

import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {


        String letters = "aaxbbbxbCCCa";
        for(int i = 0; i < letters.length(); ++i) {
            System.out.println(letters.charAt(i) == 'x' ? "1" : "0");
        }

//        ## Challenge: Positive or Negative?
//
//                - Scan user input and print:
//        - `"n is positive"` if `n` (the number that was scanned) is positive
//        - `"n is negative"` if `n` is negative
//

        Scanner ourScanner = new Scanner(System.in);
//        System.out.println("Enter positive or negative number");
//        int userInt = ourScanner.nextInt();
//        System.out.println(userInt < 0 ? userInt + " is negative" : userInt + " is positive");







//
//        ## Challenge: Find the Largest Input
//
//                - Get **3 numbers** from the user
//                - Print:
//          `"n is the largest"` — where `n` is the largest of the 3 inputs
//
//        System.out.println("Enter number");
//        int userInt1 = ourScanner.nextInt();
//        System.out.println("Enter number");
//        int userInt2 = ourScanner.nextInt();
//        System.out.println("Enter number");
//        int userInt3 = ourScanner.nextInt();
//
//        if (userInt1 >= userInt2 && userInt1 >= userInt3) {
//            System.out.println(userInt1 + " is the largest");
//        } else if (userInt2 >= userInt1 && userInt2 >= userInt3) {
//            System.out.println(userInt2 + " is the largest");
//        } else {
//            System.out.println(userInt3 + " is the largest");
//        }

//
//        ## Challenge: Rounding Floats
//
//                - Request **2 float inputs** from the user
//                        - Round both to **3 decimal places**
//                - Compare the rounded values:
//                - If they are the same:
//            `"Both numbers are n after rounding"`
//                - Else:
//            `"n1 and n2 are different numbers"` — `n1` and `n2` being the rounded values
        System.out.println("Enter float");
        Float userFloat1 = ourScanner.nextFloat();
        System.out.println("Enter float");
        Float userFloat2 = ourScanner.nextFloat();

        float rounded1 = (float) (Math.round(userFloat1*1000.0)/1000.0);
        float rounded2 = (float) (Math.round(userFloat2*1000.0)/1000.0);

        System.out.println(rounded1 == rounded2 ? "Both numbers are " + rounded1 + " after rounding": rounded1 + " and " + rounded2 + " are different numbers");





//        ## Challenge: What's the Number of x in y?
//
//                    - Scan user input **twice**
//                    - Allowed inputs:
//            - `"s"` → seconds
//                    - `"m"` → minutes
//                    - `"h"` → hours
//                    - `"D"` → days
//                    - `"M"` → months
//                    - `"Y"` → years

//        ### Input → Output Examples:
//
//                - 1st: `"M"`, 2nd: `"D"` → `"There are 30 days in a month"`
//                - 1st: `"M"`, 2nd: `"h"` → `"There are 720 hours in a month"`
//                - 1st: `"h"`, 2nd: `"s"` → `"There are 3600 seconds in an hour"`
//                - 1st: `"M"`, 2nd: `"Y"` → `"There are no years in a month"`
//                - 1st: `"s"`, 2nd: `"h"` → `"There are no hours in a second"`
//
//        ### Assumptions:
//
//                - There are **30 days in a month*
//        System.out.println("Enter a char");
//        char userChar1 = ourScanner.next().charAt(0);
//        System.out.println("Enter a char");
//        char userChar2 = ourScanner.next().charAt(0);
//
//        switch(userChar1) {
//            case 'Y' :
//                switch(userChar2) {
//                    case 'Y' :
//                        System.out.println("There is 1 year in a year");
//                        break;
//
//                    case 'M' :
//                        System.out.println("There are 12 months in a year");
//                        break;
//
//                    case 'D' :
//                        System.out.println("There are 365 days in a year");
//                        break;
//
//                    case 'h' :
//                        System.out.println("There are 8760 hours in a year");
//                        break;
//
//                    case 'm' :
//                        System.out.println("There are 525600 minutes in a year");
//                        break;
//                    default : break;
//                }
//                break;
//
//            case 'M' :
//                switch(userChar2) {
//                    case 'Y' :
//                        System.out.println("There are no years in a month");
//                        break;
//
//                    case 'M' :
//                        System.out.println("There is 1 month in a month");
//                        break;
//
//                    case 'D' :
//                        System.out.println("There are 30 days in a month");
//                        break;
//
//                    case 'h' :
//                        System.out.println("There are 720 hours in a month");
//                        break;
//
//                    case 'm' :
//                        System.out.println("There are 43200 minutes in a month");
//                        break;
//                    default: break;
//                }
//                break;
//
//
//            case 'D' :
//                switch(userChar2) {
//                    case 'Y' :
//                        System.out.println("There are no years in a day");
//                        break;
//
//                    case 'M' :
//                        System.out.println("There are no months in a day");
//                        break;
//
//                    case 'D' :
//                        System.out.println("There is 1 day in a day");
//                        break;
//
//                    case 'h' :
//                        System.out.println("There are 24 hours in a day");
//                        break;
//
//                    case 'm' :
//                        System.out.println("There are 1440 minutes in a day");
//                        break;
//                    default: break;
//                }
//                break;
//
//
//            case 'h' :
//                switch(userChar2) {
//                    case 'Y' :
//                        System.out.println("There are no years in an hour");
//                        break;
//
//                    case 'M' :
//                        System.out.println("There are no months in an hour");
//                        break;
//
//                    case 'D' :
//                        System.out.println("There are no day in an hour");
//                        break;
//
//                    case 'h' :
//                        System.out.println("There is 1 hour in an hour");
//                        break;
//
//                    case 'm' :
//                        System.out.println("There are 60 minutes in an hour");
//                        break;
//                    default: break;
//                }
//                break;
//
//
//            case 'm' :
//                switch(userChar2) {
//                    case 'Y' :
//                        System.out.println("There are no years in a minute");
//                        break;
//
//                    case 'M' :
//                        System.out.println("There are no months in a minute");
//                        break;
//
//                    case 'D' :
//                        System.out.println("There are no day in a minute");
//                        break;
//
//                    case 'h' :
//                        System.out.println("There are no hours in a minute");
//                        break;
//
//                    case 'm' :
//                        System.out.println("There is 1 minute in a minute");
//                        break;
//                    default: break;
//                }
//                break;
//            default:
//                System.out.println("Invalid inputs");
//                break;
//
//
//
//
//
//        }




    }

}
