package sample.fahri;

/**
 * Created by kaqfa on 22/09/14.
 */
public class Stack {

    int maxEl = 10;

    int [] data = new int[maxEl+1];
    int top;

    void createEmpty(){
        this.top = 0;
    }

    void createEmpty(int maxExl){
        this.maxEl = maxExl;
        this.data = new int[maxExl+1];
        this.top = 0;
    }

    void push(int newData){
        this.top++;
        this.data[this.top] = newData;
    }

    int pop(int getData){
        getData = this.data[this.top];
        this.top--;
        return getData;
    }

    boolean isEmpty(){
        if(0 == this.top){
            return true;
        } else {
            return false;
        }
    }

    boolean isFull(){
        if(this.top == this.maxEl)
            return true;
        else
            return false;
    }
}
