package org.example.qa_notes.OOPIntro.Polymorphism;

public class Line extends Shape{
    // here we again override draw method in superclass
    // must have same signature as in superclass
    public void draw() {
        System.out.println("Drawing Line");
    }
}
