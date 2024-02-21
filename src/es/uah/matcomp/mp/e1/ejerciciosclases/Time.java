package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Time {
    private int hour;
    private int minute;
    private int second;
    public Time (int h, int m, int s){
        while (s>59){
            s-=60;
            m+=1;}
        while (s<0){
            s+=60;
        }
        while (m<0){
            m+=60;
        }
        while (h<0){
            h+=24;
        }
        while (m>59){
            m-=60;
            h+=1;
        }
        while (h>23){
            h-=24;
        }
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
        while (mySecond>59){
            mySecond-=60;
            myMinute+=1;}
        while (mySecond<0){
            mySecond+=60;
        }
        while (myHour>23){
            myHour-=24;
        }
        while (myHour<0){
            myHour+=24;
        }
        while (myMinute>59){
            myMinute-=60;
            myHour+=1;
        }
        while (myMinute<0){
            myMinute+=60;
        }

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
