package org.example.lessons.Interfaces.Lesson;

public abstract class Animal {

    private String name;
    private int legs;

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void makeNoise() {
        System.out.println("This animal makes noise");
    }

    public abstract AnimalType getType();



}
