package org.example.lessons.Classes;



//-   Create a new class called Animal
//-   It should have a species property (for the name of the animal, e.g cat, dog)
//-   It should have a name property (for the name of the animal, e.g cat, dog)
//-   It should have a sound property (for the noise is makes, e.g oink)
//-   It should default to a cat that meows
//-   It should have a constructor that sets name and sound based on arguments
//-   In you main function:
//        -   instantiate a dog that woofs
//    -   ... a bear that roars
//    -   print each of their sounds to the consol

public class Animal {

    // properties
    private String species = "cat";
    private String name = "ian";
    private String sound = "meow";

    // constructor
    // here we have example of method overloading
    // methods must have same name, but different params (number and/or type)

    public Animal() {}

    public Animal(String name) {
        this.name = name;
    }
    // below would cause error, as have already defined a method which only
    // takes one string parameter
//    public Animal(String species) {
//        this.species = species;
//    }
    public Animal(String species, String name, String sound) {
        this.species = species;
        this.name = name;
        this.sound = sound;
    }

    // getters
    public String getSpecies() {
        return species;
    }

    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }

    // setters


    public void setSpecies(String species) {
        this.species = species;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
