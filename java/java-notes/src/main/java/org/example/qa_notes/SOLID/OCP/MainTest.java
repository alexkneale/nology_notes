package org.example.qa_notes.SOLID.OCP;

import java.util.ArrayList;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {

        // Open/Closed Principle
        // software entities classes or methods should be open for extension but closed for modification.
        // This informs us that any code may change in the future due to new requirements. So, while coding to meet these requirements, we must protect all missions, otherwise this will be a major issue for our object.
        // Essentially, any given class or module or function etc, should allow for its functionality to be extended but not allow for modification to its own source code.

        // here we calculate area of diff shapes
        // create class for each shape type
        // all quite slow, and clunky to extend to possible other shape types
        // have to manually create more and more shape type classes (Rombus, trinagle, etc)


        List<Shape> list = new ArrayList<>();
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(15);
        rectangle.setLength(15);
        list.add(rectangle);

        Circle circle = new Circle();
        circle.setRadius(10);
        list.add(circle);

        Rectangle rectangle2 = new Rectangle();
        rectangle2.setHeight(15);
        rectangle2.setLength(5);
        list.add(rectangle2);

        Circle circle2 = new Circle();
        circle2.setRadius(5);
        list.add(circle2);

        // calculate each shape area in loop

        for (Shape sp:list) {
            if(sp instanceof Rectangle) {
                System.out.println("Rectangle's Area = " + sp.CalculateArea());
            } else {
                System.out.println("Circle's Area = " + sp.CalculateArea());
            }
        }

        // Better Method
        // Create "general" shape class, which we can extend many shapes to

        List<AllShape> listShapes = new ArrayList<>();


        AllShape shape = new AllShape();
        shape.setType(ShapeType.Rectangle);
        shape.setHeight(10);
        shape.setLength(15);
        listShapes.add(shape);

        AllShape shape2 = new AllShape();
        shape2.setType(ShapeType.Circle);
        shape2.setRadius(10);
        listShapes.add(shape2);

        AllShape triangle = new AllShape();
        triangle.setType(ShapeType.Triangle);
        triangle.setHeight(10);
        triangle.setLength(15);
        listShapes.add(triangle);

        for(AllShape sp:listShapes) {
            if(sp.getType() == ShapeType.Rectangle) System.out.println("Rectangle's Area = "+ sp.CalculateArea2());
            else if (sp.getType() == ShapeType.Triangle) System.out.println("Triangle's Area = " + sp.CalculateArea2());
            else System.out.println("Circle's Area = " + sp.CalculateArea2());
        }








    }


}
