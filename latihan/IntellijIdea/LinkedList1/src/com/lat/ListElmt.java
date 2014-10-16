package com.lat;

/**
 * Created by kaqfa on 07/10/14.
 */
public class ListElmt {
    int info;
    ListElmt next;

    ListElmt(int data){
        this.info = data;
        this.next = null;
    }

    void printInfo(){
        System.out.println("isi dari info adalah: "+this.info);
    }
}
