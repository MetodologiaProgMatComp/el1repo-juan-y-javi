package es.uah.matcomp.mp.e3.ejerciciosclases.Shape;

public class Shape {
    private String color;
    private boolean filled;
    public Shape(){}
    public Shape(String col, boolean fil){
        color=col;
        filled=fil;
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

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
