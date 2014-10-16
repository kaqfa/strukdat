/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perkenalan;

/**
 *
 * @author kaqfa
 */
public class FirstApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Inilah Java.");
        System.out.println("Tidak terlalu berbeda dengan C bukan?");

        Modul mdl = new Modul();
        mdl.setNama("Namaku sendiri");
        mdl.printNama();
    }
    
}
