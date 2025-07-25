package org.example.lessons.EnumsAbstractClasses.AbstractClasses.Challenge;

public abstract class Phone {
    int phoneNumber;

    public Phone(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public abstract void call(Phone phone);


    //1. Create an abstract class named `Phone`
//  1. the `Phone` class should have a phone number property
//1. the `Phone` class should have a method named `call` that takes a single parameter of another phone object and logs that phones number
}
