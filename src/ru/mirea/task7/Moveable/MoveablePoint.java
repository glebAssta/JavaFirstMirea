package ru.mirea.task7.Moveable;

public class MoveablePoint implements Moveable {
    private int x, y;
    private int xSpeed;
    private int ySpeed;
    public MoveablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public void moveUp(){

    }
    public void moveDown(){
        this.y--;
    }
    public void moveLeft(){
        this.x--;
    }
    public void moveRight(){
        this.x++;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
