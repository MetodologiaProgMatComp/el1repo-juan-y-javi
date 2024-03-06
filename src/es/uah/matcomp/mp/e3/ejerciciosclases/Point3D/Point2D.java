package es.uah.matcomp.mp.e3.ejerciciosclases.Point3D;

public class Point2D {
    private float x;
    private float y;

    public Point2D(float xx, float yy) {
        x = xx;
        y = yy;
    }
    public Point2D(){}

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float MyX, float MyY){
        this.x=MyX;
        this.y=MyY;
    }
    public float[] getXY(){
        return new float[]{x,y};
    }

    public String toString() {
        return "Point2D[" +
                "x=" + x +
                ", y=" + y +
                ']';
    }
}
