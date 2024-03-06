package es.uah.matcomp.mp.e4.ejerciciosclases.MovablePoint;

public class MovableCircle extends MovablePoint implements Movable{
    private int radius;
    private MovablePoint center;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int rad){
        super(x,y,xSpeed,ySpeed);
        radius=rad;
    }

    public String toString() {
        return "("+x+","+y+") speed("+xSpeed+","+ySpeed+"), radius="+radius;
    }

    @Override
    public void moveDown() {
        y-=ySpeed;
    }

    @Override
    public void moveLeft() {
        x-=xSpeed;
    }

    @Override
    public void moveRight() {
        x+=xSpeed;
    }

    @Override
    public void moveUp() {
        y+=ySpeed;
    }
}
