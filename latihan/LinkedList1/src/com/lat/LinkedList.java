package com.lat;

/**
 * Created by kaqfa on 07/10/14.
 */
public class LinkedList {

    ListElmt first;

    void createEmptyList(){
        this.first = null;
    }

    ListElmt createElm(int data){
        return new ListElmt(data);
    }

    void dealokasi(){

    }

    ListElmt findElementByData(int dataFind){
        return null;
    }

    void insertFirst(ListElmt newElm){
        newElm.next = this.first.next;
        this.first = newElm;
    }

    void insertAfter(ListElmt newElm, ListElmt address){
        if(null == this.first){
            insertFirst(newElm);
        } else {
            newElm.next = address.next;
            address.next = newElm;
        }
    }

    void insertLast(ListElmt newElm){
        if(null == this.first){
            insertFirst(newElm);
        } else {
            ListElmt last = this.first;
            while (last.next != null){
                last = last.next;
            }
            insertAfter(newElm, last);
        }
    }

    void delFirst(){

    }

    void delLast(){

    }

    void delAfter(ListElmt address){

    }

    int nbElement(){
        return 0;
    }

    /* rest of optional functions */
}
