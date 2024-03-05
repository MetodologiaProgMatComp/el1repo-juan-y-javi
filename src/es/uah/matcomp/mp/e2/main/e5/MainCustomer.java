package es.uah.matcomp.mp.e2.main.e5;
import es.uah.matcomp.mp.e2.ejerciciosclases.e5.Customer;
public class MainCustomer {
    public static void main(String[]args){
        Customer yo=new Customer(025,"Tu",'m');
        System.out.println(yo);
        System.out.println("ID= "+yo.getId());
        System.out.println("Nombre= "+yo.getName());
        System.out.println("Genero= "+yo.getGender());
    }
}
