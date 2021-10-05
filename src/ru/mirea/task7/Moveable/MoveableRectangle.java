package ru.mirea.task7.Moveable;

public class MoveableRectangle implements Moveable{
    private MoveablePoint topLeft;
    private MoveablePoint bottomRight;

    public MoveableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed)
    {
        this.topLeft = new MoveablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MoveablePoint(x2, y2, xSpeed, ySpeed);
    }

    public String toString()
    {
        return "Top left point: " + topLeft + ". Bottom right point: " + bottomRight;
    }

    public void moveUp()
    {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    public void moveDown()
    {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    public void moveLeft()
    {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    public void moveRight()
    {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

}
