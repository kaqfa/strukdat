/**
 *
 * @author kaqfa
 */
public class DoublyList {

    private TimeList first;
    private TimeList last;
    private TimeList current;

    public DoublyList() // constructor
    {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void addFirst(int jam, int menit, int detik) {
        TimeList newLink = new TimeList(jam, menit, detik);

        if (isEmpty()) {
            last = newLink;
        } else {
            first.prev = newLink;
        }
        newLink.next = first;
        first = newLink;
    }

    public void addLast(int jam, int menit, int detik) {
        TimeList newLink = new TimeList(jam, menit, detik);
        if (isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;
            newLink.prev = last;
        }
        last = newLink;
    }

    public TimeList deleteFirst() {
        TimeList temp = first;
        if (first.next == null) {
            last = null;
        } else {
            first.next.prev = null;
        }
        first = first.next;
        return temp;
    }

    public TimeList deleteLast() {
        TimeList temp = last;
        if (first.next == null) {
            first = null;
        } else {
            last.prev.next = null;
        }
        last = last.prev;
        return temp;
    }

    public boolean addAfter(int jKey, int mKey, int dKey, int jam, int menit, int detik) {
        TimeList current = first;
        while (current.toSecond() != TimeList.timeToSecond(jKey, mKey, dKey)) {
            current = current.next;
            if (current == null) {
                return false;
            }
        }
        TimeList newLink = new TimeList(jam, menit, detik);

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

    public TimeList deleteTime(int jam, int menit, int detik) {
        this.current = this.first;
        while (current.toSecond() != TimeList.timeToSecond(jam, menit, detik)) {
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
    
    public TimeList getCurrent(){
        return this.current;
    }
    
    public boolean hasNext(){
        return (this.current.next != null);
    }
    
    public boolean hasPrev(){
        return (this.current.prev != null);
    }
    
    public void moveNext(){
        this.current = this.current.next;
    }
    
    public void movePrev(){
        this.current = this.current.prev;
    }
    
    public TimeList moveToFirst(){
        this.current = this.first;
        return this.current;
    }
    
    public TimeList moveToLast(){
        this.current = this.last;
        return this.current;
    }
}
