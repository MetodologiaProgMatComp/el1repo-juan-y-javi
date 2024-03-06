package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Time {
    private int hour;
    private int minute;
    private int second;
    public Time (int h, int m, int s){
        hour=h;
        minute=m;
        second=s;
    }
    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    }
    public void setHour(int myHour){
        this.hour=myHour;
    }
    public void setMinute(int myMinute){
        this.minute=myMinute;
    }
    public void setSecond(int mySecond){
        this.second=mySecond;
    }
    public void setTime(int myHour, int myMinute, int mySecond){
        this.hour=myHour;
        this.minute=myMinute;
        this.second=mySecond;
    }
    public String toString(){
        String h=String.format("%02d", hour);
        String m=String.format("%02d", minute);
        String s=String.format("%02d", second);
        return h+":"+m+":"+s;
    }
    public Time nextSecond(){
        setTime(hour, minute, second+1);
        return this;
    }
    public Time previousSecond(){
        setTime(hour,minute,second-1);
        return this;
    }
}
