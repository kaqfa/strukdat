package com.lat;

public class LinkedListApp {

    public static void main(String[] args) {
        // write your code here
        LinkedList la = new LinkedList();

        la.insertLast(la.createElm(15));
        la.insertLast(la.createElm(12));
        la.insertLast(la.createElm(34));
        la.insertLast(la.createElm(56));
        la.insertLast(la.createElm(42));
        la.insertLast(la.createElm(63));
        la.insertLast(la.createElm(31));
        la.insertLast(la.createElm(44));
        la.insertLast(la.createElm(33));

        la.insertAfter(la.createElm(20), la.findElementByData(42));
        la.delFirst();
        la.delLast();
        la.delAfter(la.findElementByData(12));

        la.printAllElement();
    }
}
