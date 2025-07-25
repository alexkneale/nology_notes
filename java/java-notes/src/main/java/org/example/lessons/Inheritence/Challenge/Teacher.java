package org.example.lessons.Inheritence.Challenge;

public class Teacher extends Person {


    public Teacher(String name) {
        super(name);
    }

    public void callMeeting(Person otherPerson) {
        System.out.println(this.getName()+" is meeting with "+ otherPerson.getName());
    }

//    Create a child class called teacher that inherits from person
//-   students have a property called cohort, which is a string
//-   When a student says their name, they should also mention which cohort they are in
//-   Teachers have a method called call meeting, which takes a person and prints both the teacher and the persons name to the console
//-


}
