package org.example.qa_notes.SOLID.OCP;

public class AllShape {
    // have fields for potentially many diff types of shape
    private int Length;
    private int Height;
    private int Radius;
    // type is a number
    // 'rule' or dictionary for number type in ShapeType Class
    private int Type;

    public int getLength() {
        return Length;
    }

    public int getHeight() {
        return Height;
    }

    public int getRadius() {
        return Radius;
    }

    public int getType() {
        return Type;
    }

    public void setLength(int length) {
        Length = length;
    }

    public void setHeight(int height) {
        Height = height;
    }

    public void setRadius(int radius) {
        Radius = radius;
    }

    public void setType(int type) {
        Type = type;
    }

    public double CalculateArea2() {
        if (Type == ShapeType.Rectangle) return Length*Height;
        else if(Type == ShapeType.Triangle) return Length*Height/2;
        else return (22/7)*Radius*Radius;
    }

}
