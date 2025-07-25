package org.example.lessons.EnumsAbstractClasses.AbstractClasses.Challenge;

public class LandLine extends Phone {
    //1. create a class named `Landline` that inherits from `Phone` and has an `address` property

    private String address;

    public void call(Phone phone) {
        System.out.println(phone.phoneNumber);
    }

    public LandLine(int phoneNumber, String address) {
        super(phoneNumber);
        this.address = address;
    }
}
