package fahri.lat.queue;

public class QueueApp {

    public static Queue1 q1 = new Queue1();
    public static Queue2 q2 = new Queue2();
    public static Queue3 q3 = new Queue3();

    public static void performTest(int jmlData){
        int qSize = jmlData/10;
        int inputRound = qSize/2;
        int dataIn = 0;
        q2.createEmpty(qSize);

        System.out.println("uji coba dimulai");

        // isi hingga queue full
        while(dataIn < qSize){
            q2.enqueue((int)(Math.random()*100));
            dataIn++;
            System.out.println("data ke "+dataIn);
        }
        while(dataIn < jmlData){
            int delCount = 0;
            // hapus setengah
            while (delCount < inputRound){
                q2.dequeue();
                delCount++;
            }
            // tambah lagi setengah
            while (delCount > 0){
                q2.enqueue((int)(Math.random()*100));
                dataIn++;
                System.out.println("data ke "+dataIn);
                delCount--;
            }
        }
        // terakhir masih ada setengah data, dihapus sekalian
        for(int delCount = 0;delCount < inputRound; delCount++){
            q2.dequeue();
        }

        System.out.println("selesai menguji coba sebanyak "+jmlData+" data");
    }

    public static void main(String[] args) {

        int[] jmlData = {10}; //, 10000, 100000, 1000000

        performTest(100);
    }
}
