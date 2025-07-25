package org.example.qa_notes.OOPIntro.Polymorphism;

// superclass shape
public class Shape {


    private int sides = 2;

    // we have method draw in superclass
    // subclasses will override this method
    public void draw() {
        System.out.println("Drawing Shape");
    }

    public int getSides() {
        return sides;
    }

    // if we want to ensure that method cannot be overridden by any subclass methods
    // use "final" keyword
    // final methods may not be overridden
    public final void verifyCredentials(){
        System.out.println("Don't touch");
    }

    // classes may be defined as final (cannot be subclassed)
    // also, method variables and parameters can be defined as final
    final int value = 15;

    public void example(final int exampleParam) {
        //exampleParam = (string) exampleParam would casue error

        System.out.println(exampleParam); // allowed
    }

    // NB
    // final instance fields must be initialised in constructor
    // final method variables can only be set once


}
