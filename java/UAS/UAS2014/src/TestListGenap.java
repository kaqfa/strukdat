public class TestListGenap {
    DoublyList  dl = new DoublyList();
    
    public TestListGenap(){
        this.fillData();
    }
    
    public void fillData(){
        dl.addFirst(15, 12, 14);
        dl.addLast(8, 22, 12);
        dl.addLast(13, 16, 9);
        dl.addLast(12, 9, 40);
        dl.addLast(3, 130, 42);
        dl.addLast(22, 57, 00);
        dl.addLast(14, 32, 6);
        dl.addLast(5, 67, 11);
        dl.addLast(3, 22, 22);
        dl.addLast(10, 43, 11);
        dl.addLast(6, 55, 99);
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
    
    public void findTime(int jam, int menit, int detik){
        if(! dl.isEmpty()){
            dl.moveToFirst();
            while(dl.getCurrent() != null){
                if(dl.getCurrent().toSecond() == TimeList.timeToSecond(jam, menit, detik)){                    
                    System.out.println("Waktu "+jam+":"+menit+":"+detik+" ditemukan");
                }
                dl.moveNext();
            }
        }
        System.out.println("Tidak ditemukan waktu "+jam+":"+menit+":"+detik);
    }
    
    
    /**
     * Fungsi printTimeGap2H merupakan fungsi yang menampilkan (print)
     * semua list waktu yang memiliki gap (lebih dari atau kurang dari)
     * 2 jam dibandingkan waktu pertamanya.
     * */
    public void printTimeGap2H(){
        
    }
    
    
    /**
     * Fungsi invalidToZero merupakan fungsi untuk mengubah semua list
     * waktu yang invalid menjadi 00:00:00.
     * */
    public void invalidToZero(){
        
    }
    
    public static void main(String[] args) {
        TestListGenap demo = new TestListGenap();
        demo.printAll();
        demo.findTime(15, 32, 8);
        demo.printTimeGap2H();
        demo.invalidToZero();
        System.out.println("=== setelah yang invalid diubah menjadi 0 ===");
        demo.printAll();
    }
}
