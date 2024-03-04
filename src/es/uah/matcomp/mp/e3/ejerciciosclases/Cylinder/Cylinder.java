package es.uah.matcomp.mp.e3.ejerciciosclases.Cylinder;

public class Cylinder extends Circle {
    private double height;
    public Cylinder(){}
    public Cylinder(double rad){
        super(rad);
    }
    public Cylinder(double rad, double hei){
        super(rad);
        height=hei;
    }
    public Cylinder(double rad, double hei, String col){
        super(rad, col);
        height=hei;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return super.getArea()*height;
    }
}
