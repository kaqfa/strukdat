package com.lat;


public class LinkedList {

    ListElmt first;

    void createEmptyList(){
        this.first = null;
    }

    ListElmt createElm(int data){
        return new ListElmt(data);
    }

    ListElmt findElementByData(int dataFind){
        ListElmt current = this.first;

        if(this.first == null){
            return null;
        } else {
            while(current != null){
                if(current.info == dataFind){
                    return current;
                } else {
                    current = current.next;
                }
            }
            return null;
        }
    }

    void insertFirst(ListElmt newElm){
        try {
            newElm.next = this.first;
            this.first = newElm;
        } catch (NullPointerException e){
            e.printStackTrace();
        }

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

    ListElmt delFirst(){
        ListElmt current = this.first;

        if(this.first.next == null){
            this.first = null;
        } else {
            this.first = this.first.next;
        }

        return current;
    }

    ListElmt delLast(){
        ListElmt last = this.first;
        ListElmt prevLast = last;

        if(this.first == null){
            return null;
        } else if(this.first.next == null) {
            this.first = null;
        } else {
            while(last.next != null){
                prevLast = last;
                last = last.next;
            }

            prevLast.next = null;
        }

        return last;
    }

    ListElmt delAfter(ListElmt addressPrev){
        ListElmt current = addressPrev.next;

        addressPrev.next = current.next;
        current.next = null;

        return current;
    }

    void printAllElement(){
        ListElmt current = this.first;

        while(current != null){
            System.out.println("Isi dari linked list adalah: "+current.info);
            current = current.next;
        }
    }

    int nbElement(){
        int count = 0;
        ListElmt current = this.first;
        while(current != null){
            count++;
            current = current.next;
        }

        return count;
    }
}
