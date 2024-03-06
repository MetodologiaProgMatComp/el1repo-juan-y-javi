package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;
    public Ball (float xx, float yy, int r, float xD, float yD){
        x=xx;
        y=yy;
        radius=r;
        xDelta=xD;
        yDelta=yD;
    }
    public float getX(){
        return x;
    }
    public void setX(float myX){
        this.x=myX;
    }
    public float getY(){
        return y;
    }
    public void setY(float myY){
        this.y=myY;
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int myRadius){
        this.radius=myRadius;
    }
    public float getXDelta(){
        return xDelta;
    }
    public void setXDelta(float myXDelta){
        this.xDelta=myXDelta;
    }
    public float getYDelta(){
        return yDelta;
    }
    public void setYDelta(float myYDelta){
        this.yDelta=myYDelta;
    }
    public void move(){
        this.x+=xDelta;
        this.y+=yDelta;
    }
    public void reflectHorizontal(){
        this.xDelta=-xDelta;
    }
    public void reflectVertical(){
        this.yDelta=-yDelta;
    }
    public String toString(){
        return"Ball[("+x+","+y+"), speed=("+xDelta+","+yDelta+")]";
    }
}
