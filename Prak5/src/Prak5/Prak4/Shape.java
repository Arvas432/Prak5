package Prak5.Prak4;

public abstract class Shape {
    protected String color;
    protected boolean filled;
    public Shape()
    {

    }
    public Shape(String Color, boolean Filled)
    {

    }
    public String getColor()
    {
        return color;
    }
    public void setColor(String Color)
    {
        color = Color;
    }
    public boolean isFilled()
    {
        return filled;
    }
    public void setFilled(boolean Filled)
    {
        filled = Filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();


}
