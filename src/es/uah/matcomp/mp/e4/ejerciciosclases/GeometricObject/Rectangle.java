package es.uah.matcomp.mp.e4.ejerciciosclases.GeometricObject;

public class Rectangle implements GeometricObject{
    private double width;
    private double length;
    public Rectangle(double wid,double len){
        width=wid;
        length=len;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return width*2+length*2;
    }
}
