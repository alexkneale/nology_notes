package org.example.lessons.Inheritence.Challenge;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void sayYourName() {
        System.out.println("Hi my name is "+ this.name);
    }
}
