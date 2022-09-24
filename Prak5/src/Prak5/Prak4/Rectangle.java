package Prak5.Prak4;

public class Rectangle extends Shape
{
    protected double width;
    protected double length;
    public Rectangle()
    {

    }
    public Rectangle(double Width, double Length)
    {
        width = Width;
        length = Length;
    }
    public Rectangle(double Width, double Length, String Color, boolean Filled)
    {
        width = Width;
        length = Length;
        color = Color;
        filled = Filled;
    }
    public double getWidth()
    {
        return width;
    }
    public double getLength()
    {
        return length;
    }
    public void setWidth(double Width)
    {
        width = Width;
    }
    public void setLength(double Length)
    {
        length = Length;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public double getPerimeter() {
        return 2*length + 2*width;
    }

    @Override
    public String toString() {

        return super.toString();
    }
}
