package sample.fahri;

public class StackApp {

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.createEmpty();
        for(int e = 1; e <= 10; e++){
            stack.push(e*2);
        }
        int nilaiPop = 0;

        stack.pop(nilaiPop);

        System.out.print(nilaiPop);
    }
}
