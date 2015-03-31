/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lat.queuedemo;

/**
 *
 * @author kaqfa
 */
public class QueueApp {
    
    public static void performTest(int jmlData){
        int qSize = jmlData/10;
        int inputRound = qSize/2;
        int dataIn = 0;
        Queue q = new Queue3();
        q.createEmpty(jmlData);

        System.out.println("uji coba dimulai");

        // isi hingga queue full
        while(dataIn < qSize){
            q.add((int)(Math.random()*100));
            dataIn++;
//            System.out.println("data ke "+dataIn);
        }
        while(dataIn < jmlData){
            int delCount = 0;
            // hapus setengah
            while (delCount < inputRound){
                q.remove();
                delCount++;
            }
            // tambah lagi setengah
            while (delCount > 0){
                q.add((int)(Math.random()*100));
                dataIn++;
//                System.out.println("data ke "+dataIn);
                delCount--;
            }
        }
        // terakhir masih ada setengah data, dihapus sekalian
        for(int delCount = 0;delCount < inputRound; delCount++){
            q.remove();
        }

        System.out.println("selesai menguji coba sebanyak "+jmlData+" data");
    }

    public static void main(String[] args) {
        performTest(100000000);
    }
    
}
