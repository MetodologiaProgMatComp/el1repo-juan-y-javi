package es.uah.matcomp.mp.e4.ejerciciosclases.Shape;
import java.lang.Math;
public abstract class Shape {
    protected String color;
    protected boolean filled;
    public Shape (){}

    public Shape(String col, boolean fill) {
        color = col;
        filled = fill;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
