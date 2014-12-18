/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kaqfa
 */
class ElmList {
    int jam, menit, detik;    
    ElmList prev, next;
    
    public ElmList(){ }
    
    public ElmList(int jam, int menit, int detik){
        this.jam = jam;
        this.menit = menit;
        this.detik = detik;
    }
    
    
    
    public int timeToSecond(){
        int seconds = 0;
        return seconds;
    }
    
    public void secondToTime(int second){
        
    }
    
    public void printTime(){
        System.out.println("1");
    }
}
