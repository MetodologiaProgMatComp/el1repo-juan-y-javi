package es.uah.matcomp.mp.e2.ejerciciosclases;
import java.lang.Math;
public class MyPoint {
    private int x;
    private int y;
    public MyPoint(){}
    public MyPoint(int xx, int yy){
        x=xx;
        y=yy;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int[] getXY(){
       int[] array = {x,y};
        return array;
    }
    public void setXY(int myX, int myY){
        this.x = myX;
        this.y = myY;
    }
    public String toString(){
        return "("+x+","+y+")";
    }
    public double distance(int myX, int myY){
        x-=myX;
        y-=myY;
        return Math.sqrt((x*x)+(y*y));
    }
    public double distance(MyPoint another){
        MyPoint j=new MyPoint();
        j.setXY(another.x-x,another.y-y);
        return Math.sqrt((j.getX()*j.getX())+
                (j.getY()*j.getY()));
    }
    public double distance(){
        return Math.sqrt((x*x)+(y*y));
    }
}