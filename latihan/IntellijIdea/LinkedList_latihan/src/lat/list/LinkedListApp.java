package lat.list;

public class LinkedListApp {

    public static void main(String[] args) {

        LinkedList LL = new LinkedList();
        LL.createEmpty();

        LL.addFirst(15);
        LL.addFirst(19);
        LL.addFirst(14);
        LL.addFirst(20);
        LL.addFirst(28);
        LL.addFirst(50);

        LL.printAll();

        LL.delFirst();
        LL.delFirst();

        LL.printAll();
    }
}
