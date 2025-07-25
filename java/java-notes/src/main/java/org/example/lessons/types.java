package org.example.lessons;

public class types {
    public static void main(String[] args) {

        // strings
        // NOT a primitive datatype in Java
        // instantiate from String class
        // technically strings are arrays of char

        String myString = "Hello";
        // can reassign --> not constant referencing to value
        myString += " world";
        System.out.println(myString);

        String str1 = "cats";
        String str2 = "cat";

        // comparing strings
        // use .equals method in String class to check if value of both strings is the same
        System.out.println(str1.equals(str2));
        // false

        // == work differently in java for strings
        // == checks whether both variables reference same object in memory
        // not that values of object in memory they reference is the same
        System.out.println(str1 == str2);
        // false
        str2 += "s";
        System.out.println(str2 == str1);
        // false, even though both now have value "cats"
        System.out.println(str1.equals(str2));
        // true, as values are the same

        // however, if we INITIALIZE two strings with same exact value
        // they will have be considered as the same reference to the same object
        String string1 = "This is a string";
        String string2 = "This is a string";
        System.out.println(string1 == string2);
        // true

        // iterating through strings
        // for loops
        // note .length() is a method in String (not a property), so must include ()
        for(int i = 0; i < string1.length(); i++) {
            // must use .charAt(indexOfElement) in strings
            // [] indexing only valid for arrays
            System.out.println(string1.charAt(i));
        }









    }
}
