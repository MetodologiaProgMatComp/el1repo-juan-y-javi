package es.uah.matcomp.mp.e3.ejerciciosclases.Cylinder;
import java.lang.Math;
public class Circle {
    private double radius;
    private String color;
    public Circle (){}
    public Circle(double rad){
        radius=rad;
    }
    public Circle(double rad, String col){
        radius=rad;
        color=col;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public String toString(){
        return"Circle[radius="+radius+", color="+color+"]";
    }
}
