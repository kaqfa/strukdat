package fahri.lat.queue;

/**
 * Created by kaqfa on 01/10/14.
 */
public class Queue1 {

    int maxElm;
    int [] antrian;

    int head;
    int tail;

    boolean isEmpty(){
        return (0 == this.head && 0 == this.tail);
    }

    boolean isFull(){
        return (1 == this.head && this.maxElm == this.tail);
    }

    int nbElement(){
        if(isEmpty()){
            return 0;
        } else {
            return this.tail;
        }
    }

    void createEmpty(int size){
        this.antrian = new int[size+1];
        if(this.antrian.length > 0){
            this.maxElm = size;
            this.head = 0;
            this.tail = 0;
        } else {
            this.maxElm = 0;
        }
    }

    void deAllocate(){
        this.antrian = null;
        this.maxElm = 0;
    }

    void enqueue(int data){
        if(isFull()){
            System.out.println("Antriannya sudah penuh");
        } else {
            if(isEmpty()){
                this.head = this.tail = 1;
            } else {
                this.tail++;
            }
            this.antrian[this.tail] = data;
//            System.out.println("Data: "+data+" berhasil diinputkan pada antrian ke "+this.tail);
        }
    }

    int dequeue(){
        if(isEmpty()){
            System.out.println("Antriannya sudah kosong");
            return 0;
        } else {
            int data = this.antrian[this.head];
            this.tail--;
            if(0 == this.tail){
                this.head = 0;
            } else {
                int i = 1;
                while(i <= this.tail){
                    this.antrian[i] = this.antrian[i+1];
                    this.antrian[i+1] = 0; // opsional untuk menghapus data
                    i++;
                }
            }
//            System.out.println("Data "+data+" berhasil dikeluarkan dari antrian");
            return data;
        }
    }
}
