package es.uah.matcomp.mp.e4.ejerciciosclases.Shape;

import java.lang.Math;
public class Circle extends Shape {
    protected double radius;
    public Circle(){}
    public Circle(double rad){
        radius=rad;
    }

    public Circle(String col, boolean fill, double rad) {
        super(col, fill);
        radius = rad;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI*radius*2;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
