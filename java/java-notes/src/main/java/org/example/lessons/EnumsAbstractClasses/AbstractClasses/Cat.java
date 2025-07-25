package org.example.lessons.EnumsAbstractClasses.AbstractClasses;

public class Cat extends Mammal {
    String name;
    String breed;
    float weight;

    public Cat(String species, String name, String breed, float weight) {
        // calling superclass (in this case abstract class) to implement its constructor
        super(species);
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }

    public void eat() {
        System.out.println("Cat is eating");
    }

    public void makeNoise() {
        System.out.println("Meow");
    }

    public void run() {
        System.out.println("Cat is running from dog");
    }

    public void scratch() {
        System.out.println("Cat scratches walls");
    }
}
