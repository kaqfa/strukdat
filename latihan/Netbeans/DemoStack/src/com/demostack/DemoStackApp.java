/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demostack;

import java.util.Scanner;

/**
 *
 * @author kaqfa
 */
public class DemoStackApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack tumpuk = new Stack();

        // tumpuk.createEmpty();
        Scanner input = new Scanner(System.in);
        System.out.print("inputkan ukuran stack: ");
        int size = input.nextInt();

        tumpuk.createEmptyDynamic(size);

        tumpuk.push(12);
        tumpuk.push(40);
        tumpuk.push(3);
        tumpuk.push(23);
        tumpuk.push(45);
        tumpuk.push(33);
        tumpuk.push(7);
        tumpuk.push(88);
        tumpuk.push(56);
        tumpuk.push(44);
        tumpuk.push(34);
        tumpuk.push(90);

        tumpuk.pop();
        int dataPop = tumpuk.pop();
        int hasil = 19 + dataPop;
        System.out.println("Data pop yang ditambahkan 19 adalah: "+hasil);
        tumpuk.pop();
        tumpuk.pop();
        tumpuk.pop();
        tumpuk.pop();
        tumpuk.pop();
        tumpuk.pop();
        tumpuk.pop();
        tumpuk.pop();
        tumpuk.pop();
        tumpuk.pop();
        tumpuk.pop();
        tumpuk.pop();
    }
    
}
