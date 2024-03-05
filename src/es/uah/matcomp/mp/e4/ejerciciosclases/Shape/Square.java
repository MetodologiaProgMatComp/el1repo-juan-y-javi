package es.uah.matcomp.mp.e4.ejerciciosclases.Shape;

public class Square extends Rectangle {
    public Square(){}
    public Square(String col, boolean fill, double side) {
        super(col, fill, side,side);
    }

    public Square(double side){
        super(side,side);
    }
    public double getSide(){
        Rectangle j=new Rectangle();
        if (j.getLength()!=j.getWidth())System.out.println("No es un cuadrado");
        return j.getLength();
    }
    public void setSide(double side){
        Rectangle j= new Rectangle();
        j.setLength(side);
        j.setWidth(side);
    }
    @Override
    public void setLength(double side){
        Rectangle j= new Rectangle();
        j.setLength(side);
    }
    @Override
    public void setWidth(double side){
        Rectangle j= new Rectangle();
        j.setLength(side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
