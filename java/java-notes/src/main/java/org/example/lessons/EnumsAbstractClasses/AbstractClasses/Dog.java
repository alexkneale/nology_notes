package org.example.lessons.EnumsAbstractClasses.AbstractClasses;

public class Dog extends Mammal {
    String name;
    String breed;
    float weight;

    public Dog(String species, String name, String breed, float weight) {
        // calling superclass (in this case abstract class) to implement its constructor
        super(species);
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }

    public void eat() {
        System.out.println("Dog is eating");
    }

    public void makeNoise() {
        System.out.println("Woof");
    }

    public void run() {
        System.out.println("Dog is running after a cat");
    }

    public void fetches() {
        System.out.println("Dog fetches stick");
    }

    // overriding concrete method defined in abstract class
    @Override
    void walk() {
        System.out.println("THis dog is walking");
    }
}

