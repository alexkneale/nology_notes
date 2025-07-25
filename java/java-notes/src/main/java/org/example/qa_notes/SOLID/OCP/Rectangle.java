package org.example.qa_notes.SOLID.OCP;

public class Rectangle implements Shape {

    private int Height;
    private int Length;
    @Override
    public double CalculateArea()
    {
        return Length*Height;
    }

    public int getHeight() {
        return Height;
    }

    public int getLength() {
        return Length;
    }

    public void setHeight(int height) {
        Height = height;
    }

    public void setLength(int length) {
        Length = length;
    }
}
