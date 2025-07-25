package org.example.lessons.Inheritence.Challenge;

public class Student extends Person {
    private String cohort;

    public Student(String name, String cohort) {
        super(name);
        this.cohort = cohort;
    }

    public String getCohort() {
        return cohort;
    }

    public void setCohort(String cohort) {
        this.cohort = cohort;
    }

    @Override
    public void sayYourName() {
        System.out.println("Hi my name is "+ this.getName() + " and my cohort is "+this.cohort);
    }

    //-   Create a child class called student that inherits from person
//-   Create a child class called teacher that inherits from person
//-   students have a property called cohort, which is a string
//-   When a student says their name, they should also mention which cohort they are in
//-
}
