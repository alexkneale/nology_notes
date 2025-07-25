package org.example.qa_notes.OOPIntro.Practice.Circle;

public class Circle {

    private double radius;

    Circle() {
        this(1.0);
    }
    Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }
    public double circumference() {
        return 2*Math.PI*radius;
    }

    public double area() {
        return Math.PI*Math.pow(radius,2);
    }


}
