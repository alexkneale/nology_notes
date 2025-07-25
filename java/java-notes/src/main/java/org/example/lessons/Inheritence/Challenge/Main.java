package org.example.lessons.Inheritence.Challenge;

public class Main {

//    ## Challenge
//-   Create a parent class called person, they have a property called name that is set in their constructor
//-   person has a method called say your name
//-   Create a child class called student that inherits from person
//-   Create a child class called teacher that inherits from person
//-   students have a property called cohort, which is a string
//-   When a student says their name, they should also mention which cohort they are in
//-   Teachers have a method called call meeting, which takes a person and prints both the teacher and the persons name to the console
//-   create a teacher called Aidan and a teacher called Calum
//-   create 3 students
//-   Put all 5 in an array and make them say their name
//-   Make Calum and Aidan have a meeting
//-   Make both teachers have a meeting with a student each
    public static void main(String[] args) {
        Person myPerson = new Person("Jeff");
//        myPerson.sayYourName();
        // students
        Student student1 = new Student("007", "mi5");
        Student student2 = new Student("008", "mi6");
        Student student3 = new Student("009", "mi7");
        // teachers
        Teacher teacher1 = new Teacher("Aidan");
        Teacher teacher2 = new Teacher("Calum");

        // teacher teacher
        teacher2.callMeeting(teacher1);
        // teacher student
//        teacher2.callMeeting(student2);
//        teacher1.callMeeting(student1);

        Person[] ourPeople = {student1, student2, student3, teacher1, teacher2};

        for (Person p:ourPeople) {
            p.sayYourName();
        }

        for (int i = 0; i < 3; ++i) {
            teacher1.callMeeting(ourPeople[i]);
            teacher2.callMeeting(ourPeople[i]);
        }


    }


}
