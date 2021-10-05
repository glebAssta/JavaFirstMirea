package ru.mirea.task7.Moveable;

public class MoveableCircle implements Moveable{
    private int radius;
    private MoveablePoint center;
    public MoveableCircle(int x, int y, int radius, int xSpeed, int ySpeed){
        this.center = new MoveablePoint(x,y,xSpeed, ySpeed);
        this.radius = radius;
    }

    public String toString() {
        return "MoveableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
    public void moveUp(){
        center.moveUp();
    }

    public void moveDown() {
        center.moveDown();
    }

    public void moveLeft() {
      center.moveLeft();
    }

    public void moveRight() {
        center.moveRight();
    }
}
