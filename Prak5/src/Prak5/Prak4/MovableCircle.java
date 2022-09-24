package Prak5.Prak4;

public class MovableCircle implements Movable{

    private int radius;
    private MovablePoint center;
    public MovableCircle(int X, int Y, int xSpeed, int ySpeed, int Radius)
    {
        center = new MovablePoint(X,Y,xSpeed,ySpeed);
        radius = Radius;
    }
    @Override
    public void moveUp()
    {
        center.moveUp();
    }

    @Override
    public void moveDown()
    {
        center.moveDown();
    }

    @Override
    public void moveLeft()
    {
        center.moveLeft();
    }

    @Override
    public void moveRight()
    {
        center.moveRight();
    }
}
