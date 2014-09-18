package com.company;

import java.util.Scanner;

public class StackDemoApp {

    public static void main(String[] args) {
	    Stack tumpuk = new Stack();

        Scanner input = new Scanner(System.in);
        System.out.print("inputkan ukuran stack: ");
        int ukuran = input.nextInt();

        tumpuk.createEmptyDynamic(ukuran);

        tumpuk.push(5);
        tumpuk.push(8);
        tumpuk.push(16);
        tumpuk.push(20);
        tumpuk.push(2);
        tumpuk.push(50);
        tumpuk.push(14);
        tumpuk.push(98);
        tumpuk.push(24);
        tumpuk.push(78);
        tumpuk.push(5);
        tumpuk.push(8);

        int hasilTambah = 19 + tumpuk.pop();
        System.out.println("Hasil penambahan 19 dengan data pop adalah "+hasilTambah);
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
        tumpuk.pop();

    }
}
