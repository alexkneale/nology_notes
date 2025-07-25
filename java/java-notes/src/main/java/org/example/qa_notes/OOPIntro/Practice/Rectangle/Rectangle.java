package org.example.qa_notes.OOPIntro.Practice.Rectangle;

public class Rectangle {
    // fields
    private double length;
    private double width;
    // static field, so exists even when no instances exist
    // and shared btwn all objects when they do exist
    private static int numRectangles;

    // constructors
    public Rectangle() {
        // set default behaviour to square of length 1 width 1
        // can use .this() as a method call
        // here we're calling argument constructor below
        this(1.0, 1.0);
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        // increase number of rectangles everytime
        numRectangles++;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double area() {
        return length*width;
    }
    public double perimeter() {
        return 2*length + 2*width;
    }
    public static int getNumRectangles() {
        return numRectangles;
    }


}
