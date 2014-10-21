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
public class LinkedList {
    ElementList first;
    
    public LinkedList(){
        createEmpty();
    }

    void createEmpty(){
        this.first = null;
    }

    boolean isEmpty(){
        return (this.first == null);
    }

    void addFirst(int data){
        ElementList newElmt = new ElementList();
        newElmt.data = data;

        if(isEmpty()){
            this.first = newElmt;
        } else {
            newElmt.next = this.first;
            this.first = newElmt;
        }
        System.out.println("data berhasil ditambah: "+first.data);
    }

    void delFirst(){
        ElementList temp;
        temp = this.first;
        this.first = this.first.next;
        clear(temp);

        System.out.println("data berhasil dihapus");
    }

    // contoh traversal
    void printAll(){
        ElementList temp;
        temp = first;

        while(temp != null){
            temp.printInfo();
            temp = temp.next; // berjalan satu langkah
        }
    }

    // tugasnya di fungsi ini
    void addAfter(int cari, int nilBaru){

    }

    void clear(ElementList temp){
        temp.data = 0;
        temp.next = null;
    }
}
