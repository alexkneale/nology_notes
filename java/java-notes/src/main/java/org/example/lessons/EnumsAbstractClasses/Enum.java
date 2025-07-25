package org.example.lessons.EnumsAbstractClasses;

public class Enum {

    public static void main(String[] args) {

    }
    // enums
    // common to have types with a finite set of values
    // some examples
    // - days of the week - Monday, Tuesday, ...
    // - Month of the year - January, February, ...

    // declared using enum keyword
    // values have implied order
    // similar to a class or interface (class behind the scenes)
    // can compare using equals() and ==
    // static method values() returns an array of values
    // static method valueOf() converts between String and enum value
    // far safer than using number or String constants


    public enum Season {
        Spring, Summer, Autumn, Winter;
    }

    Season season = Season.Spring;

    // enums can have more than just values
    // possible to have instance variables, constructors and methods
    public enum Season2 {

        // instance variables
        Spring("21-March"), Summer("21-June"), Autumn("21-September"), Winter("21-December");
        private String startFrom;
        // constructor
        Season2(String startFrom) {
            this.startFrom = startFrom;
        }


    }



}
