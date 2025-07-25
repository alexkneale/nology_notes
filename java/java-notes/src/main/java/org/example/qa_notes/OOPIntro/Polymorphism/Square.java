package org.example.qa_notes.OOPIntro.Polymorphism;

// here we have subclass (Square) which extends from superclass (Shape)
public class Square extends Shape{
    // override method draw from superclass
    // must have same signature as in superclass
    public void draw() {
        System.out.println("Drawing Square");
    }
}
