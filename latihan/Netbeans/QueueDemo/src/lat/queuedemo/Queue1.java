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
public class Queue1 implements Queue{
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

    int nbElement(){
        if(isEmpty()){
            return 0;
        } else {
            return this.last;
        }
    }
    
    @Override
    public boolean isOneElement(){
        return (this.last == 0);
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
                this.last++;
            }
            this.antrian[this.last] = data;
        }
    }

    @Override
    public int remove(){
        if(isEmpty()){
//            System.out.println("Antriannya sudah kosong");
            return 0;
        } else {
            int data = this.antrian[this.first];
            if(1 == this.last){ // tinggal 1 elemen
                this.first = 0;
            } else {
                int i = 1;
                // menggeser satu persatu
                while(i < this.last){
                    this.antrian[i] = this.antrian[i+1];
                    this.antrian[i+1] = 0; // opsional untuk menghapus data
                    i++;
                }
            }
            this.last--;
//            System.out.println("Data "+data+" berhasil dikeluarkan dari antrian");
            return data;
        }
    }
}
