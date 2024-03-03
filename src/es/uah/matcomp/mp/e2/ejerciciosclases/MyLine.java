package es.uah.matcomp.mp.e2.ejerciciosclases;
public class MyLine {
    private MyPoint begin;
    private MyPoint end;
    public MyLine(int x1, int x2, int y1, int y2){
        MyPoint j =new MyPoint(x1,y1);
        MyPoint i=new MyPoint(x2,y2);
        begin= j;
        end=i;
    }
    public MyLine(MyPoint beg, MyPoint en){
        begin=beg;
        end=en;
    }

    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }
    public int getEndX(){
        return end.getX();
    }
    public void setEndX(int x){
        end.setX(x);
    }
    public int getEndY(){
        return end.getY();
    }
    public void setEndY(int y){
        end.setY(y);
    }
    public int getBeginX(){
        return begin.getX();
    }
    public void setBeginX(int x){
        begin.setX(x);
    }
    public int getBeginY(){
        return begin.getY();
    }
    public void setBeginY(int y){
        begin.setY(y);
    }
    public int[] getBeginXY(){
        return begin.getXY();
    }
    public void setBeginXY(int x,int y){
        begin.setXY(x,y);
    }
    public int[] getEndXY(){
        return end.getXY();
    }
    public void setEndXY(int x, int y){
        end.setXY(x,y);
    }
    public double getLenght(){
        return end.distance(begin);
    }
    public String toString(){
        return "MyLine[begin=("+begin.getX()+","+begin.getY()+
                "), end=("+end.getX()+","+end.getY()+")]";
    }
}
