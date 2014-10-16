/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lat.queuedemo;

/**
 *
 * @author kaqfa
 */
public class Queue3 {
    int maxElm;
    int [] antrian;

    int head;
    int tail;

    boolean isEmpty(){
        return (0 == this.head && 0 == this.tail);
    }

    boolean isFull(){
        return (( (this.head-this.tail) == 1) ||
                ( (this.tail == this.maxElm) && (this.head == 1) ));
    }

    int nbElement(){
        if(isEmpty()){
            return 0;
        } else {
            int jumlah;
            if(this.tail > this.head){
                jumlah = this.tail - this.head + 1;
            } else {
                jumlah = (this.maxElm - this.head)+this.tail+1;
            }
            return jumlah;
        }
    }

    void createEmpty(int size){
        this.antrian = new int[size+1];
        if(this.antrian.length > 0){
            this.maxElm = size;
            this.head = 0;
            this.tail = 0;
        } else {
            this.maxElm = 0;
        }
    }

    void deAllocate(){
        this.antrian = null;
        this.maxElm = 0;
    }

    void enqueue(int data){
        if(isFull()){
            System.out.println("Antriannya sudah penuh");
        } else {
            if(isEmpty()){
                this.head = this.tail = 1;
            } else {
                if(this.tail == this.maxElm /* && this.head != 1 */){
                    this.tail = 1;
                } else {
                    this.tail++;
                }
            }
            this.antrian[this.tail] = data;
//            System.out.println("Data: "+data+" berhasil diinputkan pada antrian ke "+(this.tail-this.head+1));
        }
    }

    int dequeue(){
        if(isEmpty()){
            System.out.println("Antriannya sudah kosong");
            return 0;
        } else {
            int data = this.antrian[this.head];
            if(this.head == this.maxElm){
                this.head = 1;
            } else {
                if(nbElement() == 1){
                    this.head = this.tail = 0;
                } else {
                    this.head++;
                }
            }
//            System.out.println("Data "+data+" berhasil dikeluarkan dari antrian");
            return data;
        }
    }
}
