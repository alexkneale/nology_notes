package org.example.qa_notes.OOPIntro.Polymorphism;

// here we have subclass (Circle) which extends from superclass (Shape)
public class Circle extends Shape{
    // overriden method must have same signature as in superclass
    public void draw() {
        System.out.println("Drawing circle");
    }

    // sometimes, an overriding method in a subclass may wish to call
    // the overridden method from the superclass
    // use "super" keyword

    private int circleRatio = 2;
    public int getSides() {
        // here, super.getSides() is og method in superclass
        return super.getSides()*circleRatio;
    }
}
