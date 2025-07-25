package org.example.qa_notes.OOPIntro.Practice.Rectangle;

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5,10);
        // can call get num rectangle off class name (not particular object) as its a static field
        System.out.println(Rectangle.getNumRectangles());
        //2
        Rectangle r3;
        System.out.println("After r3 declared " + Rectangle.getNumRectangles() );
        // still 2
        // as we;ve only created address for new rectangle r3
        // but haven't instantiated it yet
        r3 = new Rectangle(2.5,4);
        System.out.println("After r3 instantiated " + Rectangle.getNumRectangles() );

        System.out.println(r1.area());

    }

}
