package org.example.qa_notes.OOPIntro.Polymorphism;

public class Demo {
    public static void main(String[] args) {

        Shape shapes[] = new Shape[4];
        // this is allowed, as all are subclasses of Shape
        // called UPCASTING (assigning subclasses to superclass object references)
        shapes[0] = new Circle();
        shapes[1] = new Square();
        shapes[2] = new Line();
        shapes[3] = new Shape();
        // calling Shape.draw(), but will actually invoke Circle.draw(), ... etc
        for (int a = 0; a < shapes.length; a++) {
            shapes[a].draw();
        }

        // some extra notes on upcasting
        // if an object reference is to a superclass type
        Shape newShape = new Circle(); // implicit upcast
        // then we can't access methods of subclass
        // newShape.getRadius() -> ERROR
        // must DOWNCAST to a subclass type
        Circle newCircle = (Circle) newShape; // explicit cast is necessary
        // but if newShape were initialized as Line, explicit cast would fail at runtime
        // Shape newShape = new Line();
        // Circle circle = (Circle) shape; --> FAIL
        // NB, DOWNCASTING can only partially be checked by the compiler
        // good to add your own checks
        // instanceof operator tests type of object referenced (not the declared tyep of the reference itself)
        // very useful


    }
}
