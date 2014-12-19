/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kaqfa
 */
class TimeList {
    int jam, menit, detik;    
    TimeList prev;
    TimeList next;
    
    public TimeList(){ }
    
    public TimeList(int jam, int menit, int detik){
        this.jam = jam;
        this.menit = menit;
        this.detik = detik;
    }
    
    public int toSecond(){
        return TimeList.timeToSecond(this.jam, this.menit, this.detik);
    }
    
    public static int timeToSecond(int jam, int menit, int detik){
        int seconds = jam*3600;
        seconds += menit*60;
        seconds += detik;
        
        return seconds;
    }
    
    public void secondToTime(int second){
        this.jam = second/3600;
        this.menit = (second % 3600)/60;
        this.detik = ((second % 3600) % 60);
    }
    
    public void printTime(){
        System.out.println(this.jam+":"+this.menit+":"+this.detik);
    }
}
