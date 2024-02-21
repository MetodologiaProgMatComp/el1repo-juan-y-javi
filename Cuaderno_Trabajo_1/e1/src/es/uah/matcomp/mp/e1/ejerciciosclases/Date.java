package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Date {
    private int day;
    private int month;
    private int year;
    public Date(int d, int m, int y){
        day=d;
        month=m;
        year=y;
    }
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    public void setDay(int myDay){
        day=myDay;
    }
    public void setMonth(int myMonth){
        month=myMonth;
    }
    public void setYear(int myYear){
        year=myYear;
    }
    public void setDate(int myDay, int myMonth, int myYear){
        year=myYear;
        month=myMonth;
        day=myDay;
    }
    public String toString(){
        return day+"/"+month+"/"+year;
    }
}
