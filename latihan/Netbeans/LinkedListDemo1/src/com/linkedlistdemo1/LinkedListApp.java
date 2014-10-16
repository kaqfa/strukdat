/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linkedlistdemo1;

/**
 *
 * @author kaqfa
 */
public class LinkedListApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList LL = new LinkedList();
        LL.createEmpty();

        LL.addFirst(15);
        LL.addFirst(19);
        LL.addFirst(14);
        LL.addFirst(20);
        LL.addFirst(28);
        LL.addFirst(50);

        LL.printAll();

        LL.delFirst();
        LL.delFirst();

        LL.printAll();
    }
    
}
