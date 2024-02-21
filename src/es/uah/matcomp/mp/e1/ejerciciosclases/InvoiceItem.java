package es.uah.matcomp.mp.e1.ejerciciosclases;

public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;
    public InvoiceItem (String i, String d, int q, double uP){
        id=i;
        desc=d;
        qty=q;
        unitPrice=uP;
    }
    public String getId (){
        return id;
    }
    public String getDesc(){
        return desc;
    }
    public int getQty(){
        return qty;
    }
    public void setQty(int myQty){
        this.qty=myQty;
    }
    public double getUnitPrice(){
        return unitPrice;
    }
    public void setUnitPrice(double myUnitPrice){
        this.unitPrice=myUnitPrice;
    }
    public double getTotal(){
        return qty*unitPrice;
    }
    public String toString(){
        return "InvoiceItem[id="+id+", desc="+desc+", qty"+qty+", unitPrice"+unitPrice+"]";
    }
}
