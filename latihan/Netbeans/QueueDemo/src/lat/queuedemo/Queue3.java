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
public class Queue3 implements Queue{
    int maxElm;
    int [] antrian;

    int first;
    int last;

    @Override
    public boolean isEmpty(){
        return (-1 == this.first && -1 == this.last);
    }

    @Override
    public boolean isFull(){
        return (( (this.first-this.last) == 0) ||
                ( (this.last == this.maxElm) && (this.first == 0) ));
    }
    
    @Override
    public boolean isOneElement(){
        return (this.last == this.first);
    }

//    int nbElement(){
//        if(isEmpty()){
//            return 0;
//        } else {
//            int jumlah;
//            if(this.last > this.first){
//                jumlah = this.last - this.first + 1;
//            } else {
//                jumlah = (this.maxElm - this.first)+this.last+1;
//            }
//            return jumlah;
//        }
//    }

    @Override
    public void createEmpty(int size){
        this.antrian = new int[size];
        if(this.antrian.length > 0){
            this.maxElm = size-1;
            this.first = -1;
            this.last = -1;
        } else {
            this.maxElm = 0;
        }
    }

    void deAllocate(){
        this.antrian = null;
        this.maxElm = 0;
    }

    @Override
    public void add(int data){
        if(isFull()){
            System.out.println("Antriannya sudah penuh");
        } else {
            if(isEmpty()){
                this.first = this.last = 0;
            } else {
                if(this.last == this.maxElm /* && this.head != 1 */){
                    this.last = -1;
                }
                this.last++;
            }
            
            this.antrian[this.last] = data;
//            System.out.println("Data: "+data+" berhasil diinputkan pada antrian ke "+(this.tail-this.head+1));
        }
    }

    @Override
    public int remove(){
        if(isEmpty()){
            System.out.println("Antriannya sudah kosong");
            return 0;
        } else {
            int data = this.antrian[this.first];
            if(this.first == this.maxElm){
                this.first = 0;
            } else {
                if(isOneElement()){
                    this.first = this.last = -1;
                }
                this.first++;
            }
//            System.out.println("Data "+data+" berhasil dikeluarkan dari antrian");
            return data;
        }
    }
}
