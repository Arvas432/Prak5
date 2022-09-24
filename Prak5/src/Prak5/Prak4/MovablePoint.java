package Prak5.Prak4;

public class MovablePoint implements Movable
{

    private int x;
    private int y;
    private int xspeed;
    private int yspeed;
    public MovablePoint(int X, int Y, int xSpeed, int ySpeed)
    {
        x = X;
        y = Y;
        yspeed = ySpeed;
        xspeed = xSpeed;
    }
    @Override
    public void moveUp()
    {
        y += yspeed;
    }

    @Override
    public void moveDown()
    {
        y -= yspeed;

    }

    @Override
    public void moveLeft()
    {
        x -= xspeed;
    }

    @Override
    public void moveRight()
    {
        x += xspeed;
    }
}
