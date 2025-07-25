package org.example.qa_notes.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
        // what is an exception?
        // a special type of error
        // occurs while executing the program (ie at runtime)
        // disrupts normal flow of program
        // if don't handle abnormal conditions, execution can be terminated abruptly
        // java good at handling exceptions --> 'robust language'


        // differenc btwn error and exception

        // Error is a critical condition that cannot be handled by the code of the program.
        // caused due to a lack of system resources
        // in java.lang.Error package
        // impossible to recover

        // Exception is an exceptional situation that can be handled by the code of the program.
        // caused because of your code or program.
        // in java.lang.Exception
        // possible to recover with try-catch

        // types of exceptions
        // 1. checked exception --> mandatory to handle, generally caused by faults outisde of code itself, checked at compile time --> eg FileNotFoundException
        // 2. unchecked exception --> checked at runtime. also referred to as reuntime exception. usually caused by misuse of code eg arithmetic exception such as dividing number by 0
        // 3. user-defined exception --> InsufficientFundException in bank account

        // Try-Catch Block
        // try {
        //  code that may throw an exception
        // }
        // catch (ExceptionType object {
        // error handling of exception
        // }

        // can have multiple catch blocks --> to handle particular type of exceptions

        // Finally Block
        // used to execute important code such as closing connection, stream, etc. If an exception occurs in the program, the currently executing method may stop without completing execution. In this situation, some codes, such as closing connections will never get called. Java provides the finally block to deal with these situations.
        // The finally block is always executed whether an exception is handled or not.
        // always follows try catch block

        // try {
        //  code that may throw an exception
        // }
        // catch (ExceptionType object {
        // error handling of exception
        // }
        // finally {
        // statement to be executed
        // }


        // example
        // code will have problem if input user gives is NOT int
        // so place it in try catch
        try {
            int number1 = 0, number2 = 0, result = 0;

            Scanner input = new Scanner(System.in);
            System.out.println("Please enter first int number: ");
            number1 = input.nextInt();

            System.out.println("Please nter the second int number: ");
            number2 = input.nextInt();

            result = number1/number2;
            System.out.println("Result: "+ result);
            input.close();

        // catch input mismatch exception
        } catch (InputMismatchException e) {
            System.out.println("Please enter valid number");
        } catch (ArithmeticException e) {
            // handle execption that second number is 0 (division by 0)
            System.out.println("second number can't be 0");
        } catch(Exception e) {
            // handle all other possible exceptions
            System.out.println("An exception occured");
        } finally {
            // code that we want to run in all cases (whether exception is caught or not
            System.out.println("This statement is always run");
        }

        // here we have example of trying to catch our own custom exception
        try {
            double d;
            d = divide(0.5,0);
        } catch (ArithmeticException e) {
            System.out.println(e);
            // here we print contents of error message
            // as defined below
        }

        // here we work with function with Throws Keyword
        try {
            divide_2();
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        } catch (ArithmeticException e) {
            System.out.println("You cnanot divide number by 0");
        }


        // useful methods of Throwable Class
        // 1. getMessage(): returns String message
        // 2. toString(): returns short description of Throwable
        // 3. printStackTrace(): prints the stack trace info

        // here we work with method for which exception is thrown, but not specified how we handle exception
        double d3;
        try {
            d3 = divide(5,6);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            // Arithmeitc exception occured
            System.out.println(e.toString());
            e.printStackTrace();
            System.out.println(e.getLocalizedMessage());
        }


    }
        // throwing an exception --> throw keyword
        // throw Exception

        public static double divide (double x, double y) {
            if (y == 0 ) {
                throw new ArithmeticException("Divider cannot be 0");
            }
            return x/y;
        }

        /// Throws Keyword
        // use the throws in method declaration
        // if we know which exceptions can be thrown from this method
        // eg
        // method_name() throws Exception1, Exctpioon 2,... {
        // method code
        // }
        // used to declare an exception

        public static void divide_2() throws NumberFormatException, ArithmeticException {
            int a = Integer.parseInt("8b");
            int b = Integer.parseInt("0");
            int c = a / b;
            System.out.println("Result: " + c);

        }

        public static double divide_3(double x, double y) {
            if (y==0)
                throw new ArithmeticException("Arithmetic exception occured");
            return x/y;
    }

}
