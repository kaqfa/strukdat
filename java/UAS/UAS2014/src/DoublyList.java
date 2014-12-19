/**
 *
 * @author kaqfa
 */
public class DoublyList {

    private ElmList first;
    private ElmList last;
    private ElmList current;

    public DoublyList() // constructor
    {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(long dd) {
        ElmList newLink = new ElmList();

        if (isEmpty()) {
            last = newLink;
        } else {
            first.prev = newLink;
        }
        newLink.next = first;
        first = newLink;
    }

    public void insertLast(long dd) {
        ElmList newLink = new ElmList();
        if (isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;
            newLink.prev = last;
        }
        last = newLink;
    }

    public ElmList deleteFirst() {
        ElmList temp = first;
        if (first.next == null) {
            last = null;
        } else {
            first.next.prev = null;
        }
        first = first.next;
        return temp;
    }

    public ElmList deleteLast() {
        ElmList temp = last;
        if (first.next == null) {
            first = null;
        } else {
            last.prev.next = null;
        }
        last = last.prev;
        return temp;
    }

    public boolean insertAfter(long key, long dd) {
        ElmList current = first;
        while (current.jam != key) {
            current = current.next;
            if (current == null) {
                return false;
            }
        }
        ElmList newLink = new ElmList();

        if (current == last) {
            newLink.next = null;
            last = newLink;
        } else {
            newLink.next = current.next;

            current.next.prev = newLink;
        }
        newLink.prev = current;
        current.next = newLink;
        return true;
    }

    public ElmList deleteTime(int jam, int menit, int detik) {
        this.current = this.first;
        while (current.toSecond() != ElmList.timeToSecond(jam, menit, detik)) {
            current = current.next;
            if (current == null) {
                return null;
            }
        }
        if (current == first) {
            first = current.next;
        } else {
            current.prev.next = current.next;
        }

        if (current == last) {
            last = current.prev;
        } else {
            current.next.prev = current.prev;
        }
        return current;
    }
}
