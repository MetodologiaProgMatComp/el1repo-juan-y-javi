package es.uah.matcomp.mp.e3.ejerciciosclases.Shape;

public class Square extends Rectangle{
    public Square(double side){
        super(side,side);
    }


    public Square(String col, boolean fil, double side) {
        super(col, fil, side, side);
    }
    public Square(){}
    public double getSide(){
        Rectangle j= new Rectangle();
        if (j.getLenght()==j.getWidth()) return j.getLenght();
        else {System.out.println("No es un cuadrado");return j.getLenght();}
    }
    public void setSide(double side){
        Rectangle j= new Rectangle();
        j.setWidth(side);
        j.setLenght(side);
    }

    @Override
    public void setWidth(double side){
        Rectangle j=new Rectangle();
        j.setWidth(side);
    }
    @Override
    public void setLenght(double side){
        Rectangle j=new Rectangle();
        j.setLenght(side);
    }

    @Override
    public String toString() {
        return "Square{}";
    }
}
