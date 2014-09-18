package com.company;

/**
 * Created by chiwink on 9/18/2014.
 */
public class Stack {

    int maxSize = 10;
    int [] tumpukan = new int[maxSize+1];
    int top;

    void createEmpty(){
        this.top = 0;
    }

    void createEmptyDynamic(int size){
        this.maxSize = size;
        this.tumpukan = new int[maxSize+1];
        this.top = 0;
    }

    boolean isEmpty(){
        if(this.top == 0){
            return true;
        } else {
            return false;
        }
    }

    boolean isFull(){
        if(this.top == maxSize){
            return true;
        } else {
            return false;
        }
    }

    void push(int data){
        if(isFull()){
            System.out.println("com.company.Stack sudah penuh");
        } else {
            this.top++;
            tumpukan[top] = data;

            System.out.println("data "+data+" berhasil dimasukkan pada tumpukan ke: "+this.top);
        }
    }

    int pop(){
        if(isEmpty()){
            System.out.println("Tumpukan sudah kosong");
            return 0;
        } else {
            int data = this.tumpukan[top];
            this.tumpukan[top] = 0;
            this.top--;

            // opsional
            System.out.println("data pada tumpukan ke "+(this.top+1)+" yaitu : "+data+" sudah diambil");
            return data;
        }
    }
}
