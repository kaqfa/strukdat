import java.util.Scanner;
/**
 * Created by chiwink on 9/18/2014.
 */
public class FirstApp {

    public static void main(String [] args){
        System.out.println("Inilah Java. ");
        System.out.println("Tidak terlalu berbeda dengan C bukan?");

        Modul mdl = new Modul();
        Scanner input = new Scanner(System.in);

        System.out.print("Inputkan nama baru:");
        String nama = input.nextLine();
        mdl.setNama(nama);
        mdl.printNama();

        Kalkulator calc = new Kalkulator();
        calc.tambah(15, 20);
        calc.kaliVersi2(20, 30);
    }
}
