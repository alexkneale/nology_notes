package org.example.lessons.Interfaces.Lesson;

import java.util.ArrayList;

public class Farm {
//
//    add a List of type Animal
//    on creation of Farm object it should create a number of different Animal objects and add to them List of animals.
//    add a method called getAnimals(), which should return a list of all the animals
//    add a method called getAnimalsThatMakeSound(), which should return a list of only those animals that make a sound. Hint: the instance of the list should be CanMakeSound
//    add a method called getAnimalsThatFly(), which should return a list of only those animals that can fly. Hint: the type of list should be CanFly.
//            Extension
//    add a method called getAnimalsThatFlyAndMakeSound(), which should return a list of only those animals that can fly and make a sound. What could the return type be here?

    ArrayList<Animal> ourAnimals;

    public Farm(ArrayList<Animal> ourAnimals) {
        this.ourAnimals = ourAnimals;
    }

    public ArrayList<Animal> getAnimals() {
        return ourAnimals;
    }
    public ArrayList<Animal> getAnimalsThatMakeSound() {
        ArrayList<Animal> noisyAnimals = new ArrayList<Animal>();
        for (Animal animal: ourAnimals) {
            if (animal instanceof CanMakeSound) {
                noisyAnimals.add(animal);
            }
        }

        return noisyAnimals;
    }

    public ArrayList<Animal> getAnimalsThatFly() {
        ArrayList<Animal> flyingAnimals = new ArrayList<Animal>();
        for (Animal animal: ourAnimals) {
            if (animal instanceof CanFly) {
                flyingAnimals.add(animal);
            }
        }
        return flyingAnimals;
    }


    public ArrayList<Animal> getAnimalsThatFlyAndMakeSound() {
        ArrayList<Animal> flyingNoisyAnimals = new ArrayList<Animal>();
        for (Animal animal: ourAnimals) {
            if (animal instanceof CanFly && animal instanceof CanMakeSound) {
                flyingNoisyAnimals.add(animal);
            }
        }
        return flyingNoisyAnimals;
    }




}
