package org.example.qa_notes.OOPIntro.Practice.House;

// HouseDemo
// use to keep program entry point (main method)

public class HouseDemo {
    // note main and all methods used in main must be STATIC
    public static void main(String[] args) {
        // create two instances of class
        // with parameter constructor
        House myHouse = new House(2,6,"Shit");
        // and no arg constructor
        House yourHouse = new House();

        yourHouse.setNumStories(3);
        yourHouse.setNumWindows(10);
        yourHouse.setColour("blue");

        printHouseData(myHouse);

        System.out.println("---");

        printHouseData(yourHouse);



    }
    public static void printHouseData(House houseName) {
        System.out.println("House is " + houseName.getColor() +
                " and has " + houseName.getNumStories() + " stories and "
                + houseName.getNumWindows() + " windows.");
    }
}
