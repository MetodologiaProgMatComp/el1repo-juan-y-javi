package es.uah.matcomp.mp.e4.ejerciciosclases.MovablePoint;

public class MovablePoint implements Movable{
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int xx, int yy, int xS, int yS) {
        x = xx;
        y = yy;
        xSpeed = xS;
        ySpeed = yS;
    }

    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
    public void moveUp(){
        y+=ySpeed;
    }
    public void moveDown(){
        y-=ySpeed;
    }
    public void moveRight(){
        x+=xSpeed;
    }
    public void moveLeft(){
        x-=xSpeed;
    }
    
}
