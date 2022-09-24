package Prak5.Prak4;

public class Circle extends Shape
{

    protected double radius;
    public Circle()
    {

    }
    public Circle(double Radius)
    {
        radius = Radius;
    }
    public Circle(double Radius,String Color, boolean Filled)
    {
        radius = Radius;
        color = Color;
        filled = Filled;
    }
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double Radius)
    {
        radius = Radius;
    }
    @Override
    public double getPerimeter() {
        return Math.PI*2*radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        String output = radius + " " + color + filled + " ";
        return output;
    }
}
