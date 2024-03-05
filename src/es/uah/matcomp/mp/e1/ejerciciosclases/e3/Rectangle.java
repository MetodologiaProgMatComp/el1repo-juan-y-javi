package es.uah.matcomp.mp.e1.ejerciciosclases.e3;

public class Rectangle {
    private float length;
    private float width;
    public Rectangle(){
        length=1.0f;
        width=1.0f;
    }
    public Rectangle(float l, float w){
        length=l;
        width=w;
    }
    public float getLength(){
        return length;
    }
    public void setLength(float myLength){
        this.length=myLength;
    }
    public float getWidth(){
        return width;
    }
    public void setWidth(float myWidth){
        this.width=myWidth;
    }
    public float getArea(){
        return length*width;
    }
    public float getPerimeter(){
        return 2*length+2*width;
    }
    public String toString() {
        return "Rectangle[length="+length+", width="+width+"]";
    }

}
