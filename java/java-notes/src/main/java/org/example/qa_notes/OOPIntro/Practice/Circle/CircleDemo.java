package org.example.qa_notes.OOPIntro.Practice.Circle;

public class CircleDemo {
    public static void main(String[] args) {

        Circle baseCircle = new Circle();
        System.out.println(baseCircle.getRadius());
        System.out.println(baseCircle.area());
        System.out.println(baseCircle.circumference());
        baseCircle.setRadius(3.0);
        System.out.println(baseCircle.area());
        System.out.println(baseCircle.circumference());
    }
}
