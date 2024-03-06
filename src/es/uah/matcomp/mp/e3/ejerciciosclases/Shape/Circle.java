package es.uah.matcomp.mp.e3.ejerciciosclases.Shape;

import java.lang.Math;

public class Circle extends Shape {
    private double radius;
    private String color;
    private Boolean filled;

    public Circle() {
    }

    public Circle(double rad) {
        radius = rad;
    }

    public Circle(String col, boolean fil, double rad) {
        super(col, fil);
        radius = rad;
        this.color = col;
        this.filled = fil;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[Shape[color=" + this.color +
                ",filled=" + this.filled +
                "],radius=" + radius +
                ']';
    }
}
