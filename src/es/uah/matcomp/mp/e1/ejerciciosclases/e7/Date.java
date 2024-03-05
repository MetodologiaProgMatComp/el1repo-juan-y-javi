package es.uah.matcomp.mp.e1.ejerciciosclases.e7;

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
        this.day=myDay;
    }
    public void setMonth(int myMonth){
        this.month=myMonth;
    }
    public void setYear(int myYear){
        this.year=myYear;
    }
    public void setDate(int myDay, int myMonth, int myYear){
        year=myYear;
        month=myMonth;
        day=myDay;
    }
    public String toString(){
        String d=String.format("%02d", day);
        String m=String.format("%02d", month);
        String y=String.format("%04d", year);
        return d+"/"+m+"/"+y;
    }
}
