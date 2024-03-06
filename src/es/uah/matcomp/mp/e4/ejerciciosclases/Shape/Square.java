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
        if (length!=width)System.out.println("No es un cuadrado");
        return length;
    }
    public void setSide(double side){
       length=side;
       width=side;
    }
    @Override
    public void setLength(double side){
        length=side;
    }
    @Override
    public void setWidth(double side){
        width=side;
    }

    @Override
    public String toString() {
        return "Square[Rectangle[Shape[color=" +color+
                ", filled="+filled+"], width="+width+", length="+length+"]]";
    }
}
