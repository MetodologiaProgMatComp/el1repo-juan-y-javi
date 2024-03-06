package es.uah.matcomp.mp.e3.ejerciciosclases.Point3D;

public class Point3D extends Point2D{
    private float z;

    public Point3D(float xx, float yy, float zz) {
        super(xx, yy);
        z = zz;
    }

    public Point3D() {}

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        setXY(x,y);
        this.z=z;
    }
    public float[] getXYZ(){
        return new float[]{getX(),getY(),z};
    }

    @Override
    public String toString() {
        return "Point3D[" +
                "z=" + z +
                ']';
    }
}
