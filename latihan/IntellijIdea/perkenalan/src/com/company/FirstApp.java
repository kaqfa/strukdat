package com.company;

public class FirstApp {

    public static void main(String[] args) {
        System.out.println("Inilah Java.");
        System.out.println("Tidak terlalu berbeda dengan C bukan?");

        Modul mdl = new Modul();
        mdl.setNama("Namaku sendiri");
        mdl.printNama();
    }
}
