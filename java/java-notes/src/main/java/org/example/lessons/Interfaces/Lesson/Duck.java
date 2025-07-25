package org.example.lessons.Interfaces.Lesson;

public class Duck extends Animal implements CanMakeSound, CanFly {
    // from abstract class
    @Override
    public AnimalType getType() {
        return AnimalType.DUCK;
    }

    // from interfaces

    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void land() {
        System.out.println("Duck stopped flying");

    }

    @Override
    public void makeSound() {
        System.out.println("Quack!");
    }


}
