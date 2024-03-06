package es.uah.matcomp.mp.e4.ejerciciosclases.GeometricObject;
import java.lang.Math;
public class Circle implements GeometricObject{
    private double radius;
    public Circle(double rad){
        radius=rad;
    }

    @Override
    public String toString() {
        return "Circle[" +
                "radius=" + radius +
                ']';
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getPerimeter(){
        return Math.PI*radius*2;
    }
}
