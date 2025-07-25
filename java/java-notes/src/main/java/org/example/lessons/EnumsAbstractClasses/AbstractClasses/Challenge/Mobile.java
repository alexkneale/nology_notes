package org.example.lessons.EnumsAbstractClasses.AbstractClasses.Challenge;

public class Mobile extends Phone{

    //1. create a class named `Mobile` that inherits from `Phone` and has a method called `text` that
    // takes another `Mobile` as well as a string and logs the number as well as the message


    public Mobile(int phoneNumber) {
        super(phoneNumber);
    }
    public void call(Phone phone) {
        System.out.println(phone.phoneNumber);
    }

    public void text(Mobile otherMobile, String message) {
        System.out.println(otherMobile.phoneNumber + message);
    }
}
