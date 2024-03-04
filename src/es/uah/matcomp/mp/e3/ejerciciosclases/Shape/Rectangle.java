package es.uah.matcomp.mp.e3.ejerciciosclases.Shape;

public class Rectangle extends Shape{
    private double width;
    private double lenght;

    public Rectangle(double wid, double len) {
        width = wid;
        lenght = len;
    }

    public Rectangle(String col, boolean fil, double wid, double len) {
        super(col, fil);
        width = wid;
        lenght = len;
    }
    public Rectangle(){}

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
    public double getArea(){
        return width*lenght;
    }
    public double getPerimeter(){
        return 2*width+2*lenght;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", lenght=" + lenght +
                '}';
    }
}
