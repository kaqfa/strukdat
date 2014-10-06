package lat.list;

/**
 * Created by chiwink on 10/7/2014.
 */
public class LinkedList {
    ElementList first;

    void createEmpty(){
        this.first = null;
    }

    boolean isEmpty(){
        return (this.first == null);
    }

    void addFirst(int data){
        ElementList newElmt = new ElementList();
        newElmt.info = data;

        if(isEmpty()){
            this.first = newElmt;
        } else {
            newElmt.next = this.first;
            this.first = newElmt;
        }
        System.out.println("data berhasil ditambah: "+first.info);
    }

    void delFirst(){
        ElementList temp;
        temp = this.first;
        this.first = this.first.next;
        clear(temp);

        System.out.println("data berhasil dihapus");
    }

    // contoh traversal
    void printAll(){
        ElementList temp;
        temp = first;

        while(temp != null){
            temp.printInfo();
            temp = temp.next; // berjalan satu langkah
        }
    }

    void addAfter(int cari, int nilBaru){

    }

    void clear(ElementList temp){
        temp.info = 0;
        temp.next = null;
    }

}
