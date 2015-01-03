/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kaqfa
 */
public class TestList {
    DoublyList  dl = new DoublyList();
    
    public TestList(){
        this.fillData();
    }
    
    public void fillData(){
        dl.addFirst(15, 12, 14);
        dl.addLast(8, 22, 12);
        dl.addLast(13, 16, 9);
        dl.addLast(12, 9, 40);
        dl.addLast(3, 52, 42);
        dl.addLast(22, 57, 00);
        dl.addLast(14, 32, 6);
        dl.addLast(5, 13, 11);
        dl.addLast(3, 22, 22);
        dl.addLast(10, 43, 11);
        dl.addLast(6, 55, 25);
        dl.addLast(7, 00, 13);
        dl.addLast(15, 32, 14);
    }
    
    public void printAll(){        
        if(! dl.isEmpty()){
            dl.moveToFirst();
            while(dl.hasNext()){
                dl.getCurrent().printTime();
                dl.moveNext();
            }
            dl.getCurrent().printTime();
        } else {
            System.out.println("List Kosong");
        }
    }
    
    public boolean findTime(int jam, int menit, int detik){
        if(! dl.isEmpty()){
            dl.moveToFirst();
            while(dl.getCurrent() != null){
                if(dl.getCurrent().toSecond() == TimeList.timeToSecond(jam, menit, detik)){                    
                    return true;
                }
                dl.moveNext();
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        TestList demo = new TestList();
        demo.printAll();
        if(demo.findTime(15, 32, 8) == true){
            System.out.println("Waktu yang dicari ditemukan");
        } else {
            System.out.println("Tidak ditemukan waktu yang dicari");
        }
        
    }
}
