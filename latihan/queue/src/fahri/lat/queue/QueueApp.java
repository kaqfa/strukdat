package fahri.lat.queue;

public class QueueApp {

    public static void main(String[] args) {
        Queue3 antri = new Queue3();

        antri.createEmpty(10);

        antri.enqueue(17);
        antri.enqueue(34);
        antri.enqueue(23);
        antri.enqueue(5);
        antri.enqueue(56);
        antri.enqueue(90);
        antri.enqueue(32);
        antri.enqueue(23);
        antri.enqueue(64);
        antri.enqueue(54);
        antri.enqueue(76);
        antri.enqueue(21);
        antri.enqueue(88);

        antri.dequeue();
        antri.dequeue();
        antri.dequeue();
        antri.dequeue();
        antri.dequeue();
        antri.dequeue();
        antri.dequeue();
        antri.dequeue();
        antri.dequeue();
        antri.dequeue();
        antri.dequeue();
        antri.dequeue();
        antri.dequeue();
        antri.dequeue();
        antri.dequeue();
    }
}
