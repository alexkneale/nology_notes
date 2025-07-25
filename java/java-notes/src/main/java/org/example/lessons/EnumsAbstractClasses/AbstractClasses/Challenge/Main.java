package org.example.lessons.EnumsAbstractClasses.AbstractClasses.Challenge;

public class Main {

//    ## Challenge: Phone
//
//1. Create an abstract class named `Phone`
//            1. the `Phone` class should have a phone number property
//1. the `Phone` class should have a method named `call` that takes a single parameter of another phone object and logs that phones number
//1. create a class named `Landline` that inherits from `Phone` and has an `address` property
//1. create a class named `Mobile` that inherits from `Phone` and has a method called `text` that takes another `Mobile` as well as a string and logs the number as well as the message

    public static void main(String[] args) {
        LandLine ourLandline = new LandLine(1,"Street");
        Mobile ourMobile = new Mobile(2);
        Mobile otherMobile = new Mobile(3);


        ourMobile.text(otherMobile, " hi");
        ourLandline.call(ourMobile);
    }
}
