package es.uah.matcomp.mp.e2.ejerciciosclases;
import java.lang.Math;
public class MyCircle {
    private MyPoint center;
    private int radius;
    public MyCircle(){}
    public MyCircle(int x, int y, int rad){
        MyPoint j=new MyPoint(x,y);
        center =j;
        radius=rad;
    }
    public MyCircle(MyPoint cen, int rad){
        center=cen;
        radius=rad;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getCenterX(){
        return center.getX();
    }
    public void setCenterX(int x){
        MyPoint j=new MyPoint();
        j.setX(x);
    }
    public int getCenterY(){
        return center.getY();
    }
    public void setCenterY(int y){
        MyPoint j=new MyPoint();
        j.setY(y);
    }
    public int[] getCenterXY(){
        return center.getXY();
    }
    public void setCenterXY(int x, int y){
        center.setXY(x,y);
    }
    public String toString(){
        return "MyCircle[radius="+radius+
                ", center=("+center.toString()+")]";
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getCircunference(){
        return Math.PI*2*radius;
    }
    public double distance(MyCircle another){
        return center.distance(another.center);
    }
}
