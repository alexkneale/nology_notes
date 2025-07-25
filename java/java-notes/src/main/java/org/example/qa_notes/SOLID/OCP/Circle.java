package org.example.qa_notes.SOLID.OCP;

public class Circle implements Shape {
    private int Radius;

    public int getRadius() {
        return Radius;
    }

    public void setRadius(int radius) {
        Radius = radius;
    }
    @Override
    public double CalculateArea() {
        return (22/7)*Radius*Radius;
    }


}
