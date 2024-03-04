package es.uah.matcomp.mp.e3.ejerciciosclases.Person;

import es.uah.matcomp.mp.e3.ejerciciosclases.Person.Person;

public class Staff extends Person {
    private String school;
    private double pay;

    public Staff(String nam, String ad, String sch, double pa) {
        super(nam, ad);
        school = sch;
        pay = pa;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "school='" + school + '\'' +
                ", pay=" + pay +
                '}';
    }
}
