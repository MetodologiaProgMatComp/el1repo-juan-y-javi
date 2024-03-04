package es.uah.matcomp.mp.e3.ejerciciosclases.MovablePoint;

import es.uah.matcomp.mp.e3.ejerciciosclases.Point3D.Point2D;

public class MovablePoint extends Point2D {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint(float xx, float yy, float xSpe, float ySpe) {
        super(xx, yy);
        xSpeed = xSpe;
        ySpeed = ySpe;
    }

    public MovablePoint(float xSpe, float ySpe) {
        xSpeed = xSpe;
        ySpeed = ySpe;
    }
    public MovablePoint(){}

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        setySpeed(ySpeed);
        setxSpeed(xSpeed);
    }
    public float[] getSpeed(){
        return new float[]{xSpeed,ySpeed};
    }

    public String toString() {
        return "MovablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
    public MovablePoint move(){
        Point2D j=new Point2D();
        j.setX(j.getX()+xSpeed);
        j.setY(j.getY()+ySpeed);
        return this;
    }
}
