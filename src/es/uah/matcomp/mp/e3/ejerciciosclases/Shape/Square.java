package es.uah.matcomp.mp.e3.ejerciciosclases.Shape;

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }


    public Square(String col, boolean fil, double side) {
        super(col, fil, side, side);
    }

    public Square() {
    }

    public double getSide() {
        if (this.getLenght() != this.getWidth()) {
            System.out.println("No es un cuadrado");
        }
        return this.getLenght();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLenght(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLenght(double side) {
        super.setLenght(side);
    }

    @Override
    public String toString() {
        return "Square[Rectangle[Shape[" +
                "color=" + this.getColor() +
                ",filled=" + this.isFilled() +
                "],width=" + this.getWidth() +
                ",length=" + this.getLenght() +
                "]]";
    }
}
