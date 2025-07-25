package org.example.lessons.Classes;

public class Student {
    // properties or 'fields'
    // usually make fields private, and getters and setters (and all other methods) public
    String name;
    int age;
    boolean isInUk = true;

    // constructor
    // name of constructor method must be SAME as that of class
    public Student(String name, int age) {
        // this keyword
        // specifies that we're dealing with property of INSTANCE OBJECT
        // and not PARAMETER of constructor function
        // only need THIS when name of property and parameter of constructor function are the same
        // but often good to include, just ot be clear
        // below, what we're trying to do is Student.name = name, etc
        this.name = name;
        this.age = age;
    }

    // SHORTCUT for creating constructors, getters and setters
    // right click and go to "Generate"

    // here, we don't have to use THIS, but better to do so
    public void printDetails() {
        System.out.printf("My name is %s and I am %d years old", this.name, this.age);
    }

    // GETTERS AND SETTERS
    // encapsulation and abstraction
    //


    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public boolean isInUk() {
        return this.isInUk;
    }

    public void setName(String name) {
        // add condition to check that name is correctly formatted
        if (name.length() > 20) {
            throw new Error("New name is too long");
        } else if(name.contains("@")) {
            throw new Error("No special characters");
        }
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setInUk(boolean inUk) {
        isInUk = inUk;
    }
}
