package es.uah.matcomp.mp.e4.ejerciciosclases.Shape;

public class Rectangle extends Shape {
    protected double width;
    protected double length;
    public Rectangle (){}
    public Rectangle(double wid, double len){
        width=wid;
        length=len;
    }

    public Rectangle(String col, boolean fill, double wid, double len) {
        super(col, fill);
        width = wid;
        length = len;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return width*2+length*2;
    }

    @Override
    public String toString() {
        return "Rectangle[Shape[color="+color+", filled="+filled+"], width="+width+", length"+length+"]";
    }
}
