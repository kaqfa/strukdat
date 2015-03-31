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
public class Queue2 implements Queue {
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
        return (1 == this.first && this.maxElm == this.last);
    }
    
    @Override
    public boolean isOneElement(){
        return (this.last == this.last);
    }

    int nbElement(){
        if(isEmpty()){
            return 0;
        } else {
            return this.last-this.first+1;
        }
    }

    @Override
    public void createEmpty(int size){
        this.antrian = new int[size+1];
        if(this.antrian.length > 0){
            this.maxElm = size;
            this.first = 0;
            this.last = 0;
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
//            System.out.println("Antriannya sudah penuh");
        } else {
            if(isEmpty()){
                this.first = this.last = 1;
            } else {
                if(this.last == this.maxElm /* && this.head != 1 */){
                    // menggeser queue
                    int i = this.first;
                    int j = 1;
                    while(i <= this.last){
                        this.antrian[j] =  this.antrian[i];
                        i++; j++;
                    }
                    this.first = 1;
                    this.last = j+1;
                } else {
                    this.last++;
                }
            }
            this.antrian[this.last] = data;
//            System.out.println("Data: "+data+" berhasil diinputkan pada antrian ke "+(this.tail-this.head+1));
        }
    }

    @Override
    public int remove(){
        if(isEmpty()){
//            System.out.println("Antriannya sudah kosong");
            return 0;
        } else {
            int data = this.antrian[this.first];
            if(this.first == this.last){
                this.first = this.last = 0;
            } else {
                this.first++;
            }

//            System.out.println("Data "+data+" berhasil dikeluarkan dari antrian");
            return data;
        }
    }
}
