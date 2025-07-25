package org.example.lessons.EnumsAbstractClasses.AbstractClasses;


// what makes abstract classes abstract
// must have at least one abstract method (signature without implementation)
public abstract class Mammal {
    // fields
    String species;

    // constructor
    // all constructors of concrete classes which extend this abstract class will
    // will have to have Species as a parameter

    public Mammal(String species) {
        this.species = species;
    }


    // extending abstract class on non-abstract (concrete) class, there is a contract:
    // - have to implement all methods defined in abstract class
    // - constructors have to include all params in constructor of abstract class

    // NB, classes that extend abstract class will have access to all fields and \
    // concrete methods defined in abstract class
    // can override concrete methods, but don't necessarily have to

    // method signatures (just return type and name, no implementation)
    // what all classes that extend this abstract class must have





    abstract void eat();
    abstract void run();
    abstract void makeNoise();
    void walk() {
        System.out.println("This mammal is walking");
    }

}
