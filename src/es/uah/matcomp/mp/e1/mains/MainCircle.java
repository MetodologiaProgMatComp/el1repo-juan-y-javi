package es.uah.matcomp.mp.e1.mains;

import es.uah.matcomp.mp.e1.ejerciciosclases.Circle;
public class MainCircle {
    public static void main(String[] args) {
        // Test Constructors and toString()
        Circle c1 = new Circle(1.1);
        System.out.println(c1); // toString()
        Circle c2 = new Circle(4.5d, "color"); // default constructor
        System.out.println(c2);
        // Test setter and getter
        c1.setRadius(2.2);
        System.out.println(c1); // toString()
        System.out.println("radius is: " + c1.getRadius());
        // Test getArea() and getCircumference()
        System.out.printf("area is: %.2f%n", c1.getArea());
        System.out.printf("circumference is: %.2f%n", c1.getCircumference());
    }

}