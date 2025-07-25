package org.example.lessons.Interfaces.Lesson;

public class Dog extends Animal implements CanMakeSound {
    @Override
    public AnimalType getType() {
        return AnimalType.DOG;
    }


    @Override
    public void makeSound() {
        System.out.println("Woof");
    }

}
