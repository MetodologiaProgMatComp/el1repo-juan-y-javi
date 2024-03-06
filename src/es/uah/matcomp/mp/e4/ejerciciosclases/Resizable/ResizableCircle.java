package es.uah.matcomp.mp.e4.ejerciciosclases.Resizable;


public class ResizableCircle extends Circle implements Resize{
    public ResizableCircle(double rad){
        super(rad);
    }


    public String toString() {
        return "ResizableCircle[Circle[" +
                "radius=" + radius +
                ']';
    }
    @Override
    public void resize(double percent){
        radius+=radius*percent/100;
    }
}
