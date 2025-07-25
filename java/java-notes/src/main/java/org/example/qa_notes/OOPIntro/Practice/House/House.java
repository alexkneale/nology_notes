package org.example.qa_notes.OOPIntro.Practice.House;

//
public class House {
    // instance fields
    private int numStories;
    private int numWindows;
    private String colour;

    // constructors
    // no arg constructor
    public House() {
        numStories = 1;
        numWindows = 4;
        colour = "gray";

    }
    // parameter constructor
    public House(int numStories, int numWindows, String colour) {
        this.numStories = numStories;
        this.numWindows = numWindows;
        this.colour = colour;
    }


    // methods
    // here we have setters (example of mutators: change instance fields) and getters
    public int getNumStories() {
        return numStories;
    }

    public void setNumStories(int numStories) {
        // include this., to set internal fields to parameter vals
        this.numStories = numStories;
    }
    public int getNumWindows() {
        return numWindows;
    }
    public void setNumWindows(int numWindows) {
        this.numWindows = numWindows;
    }
    public String getColor() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }




}
