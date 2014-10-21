/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studycase;

/**
 *
 * @author kaqfa
 */
public class Stack {
    int maxElm = 10;
    char [] tumpukan = new char[maxElm+1];
    int top;

    void createEmpty(){
        this.top = 0;
    }

    void createEmptyDynamic(int elmSize){
        this.top = 0;
        this.maxElm = elmSize;
        this.tumpukan = new char[maxElm+1];
    }

    boolean isEmpty(){
        if(this.top == 0){
            return true;
        } else {
            return false;
        }
    }

    boolean isFull(){
        if(this.top == this.maxElm){
            return true;
        } else {
            return false;
        }
    }

    void push(char data){
        if(isFull()){
            System.out.println("Tumpukan sudah penuh");
        } else {
            this.top++;
            this.tumpukan[this.top] = data;
            System.out.println("Data "+data+" berhasil diinputkan pada tumpukan index ke "+this.top);
        }
    }

    char pop(){
        if(isEmpty()){
            System.out.println("Tumpukan sudah kosong");
            return ' ';
        } else {
            char data = this.tumpukan[this.top];
            this.tumpukan[this.top] = 0;
            this.top--;

            System.out.println("Data dari tumpukan ke "+(this.top+1)+" berisi nilai: "+data
                    +" sudah diambil dan dihapus");
            return data;
        }
    }
}
