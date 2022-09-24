package Prak5.Prak4;

public class Square extends Rectangle
{
    public Square()
    {

    }
    public Square(double Side)
    {
        length = Side;
        width = Side;
    }
    public Square(double Side, String Color, boolean Filled)
    {
        length = Side;
        width = Side;
        color = Color;
        filled = Filled;
    }
    public double getSide()
    {
        return length;
    }
    public void setSide(double Side)
    {
        length = Side;
        width = Side;
    }

    @Override
    public void setLength(double Side)
    {
        length = Side;
        width = Side;
    }

    @Override
    public void setWidth(double Side)
    {
        length = Side;
        width = Side;
    }
}
