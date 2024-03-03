package es.uah.matcomp.mp.e2.ejerciciosclases;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        MyPoint i=new MyPoint(x1,y1);
        MyPoint j=new MyPoint(x2,y2);
        MyPoint k=new MyPoint(x3,y3);
        v1=i;
        v2=j;
        v3=k;
    }
    public MyTriangle(MyPoint vv1, MyPoint vv2, MyPoint vv3){
        v1=vv1;
        v2=vv2;
        v3=vv3;
    }

    public String toString() {
        return "MyTriangle[v1=("+v1.getX()+","+v1.getY()+
                "v2=("+v2.getX()+","+v2.getY()+
                "v3=("+v3.getX()+","+v3.getY();
    }
    public double getPerimeter(){
        return v1.distance(v2)+v2.distance(v3)+v3.distance(v1);
    }
    public String getType(){
        if (v1.distance(v2)== v2.distance(v3) &&
                v1.distance(v2)==v3.distance(v1)) return "Equlateral";
        else if (v1.distance(v2)== v2.distance(v3) ||
                v1.distance(v2)==v3.distance(v1)) return "Isosceles";
        else return "Scalene";
    }
}
