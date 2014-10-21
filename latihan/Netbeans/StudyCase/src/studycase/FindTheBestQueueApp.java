package studycase;

import java.util.Scanner;

public class FindTheBestQueueApp {
    
    public static void main(String[] args) {
        Queue q1 = new Queue();
        q1.createEmpty(100);
        Queue q2 = new Queue();
        q2.createEmpty(100);
        Queue q3 = new Queue();
        q3.createEmpty(100);
        
        q1.add("Anto"); q1.add("Rinto"); q1.add("Rahmi"); 
        q2.add("Andi"); q2.add("Rudi"); q2.add("Bondan"); q2.add("Bagus"); q2.add("Dewi");
        q3.add("Santi"); q3.add("Ayu");
        
        Scanner input = new Scanner(System.in);
        String data;
        do{
            System.out.print("Inputkan Antrian: ");
            data = input.nextLine();
            
            // implementasikan logika pencarian antrian terpendek di sini 
            
        }while(!data.equalsIgnoreCase("stop"));
        q1.printAll();
        q2.printAll();
        q3.printAll();
    }
}
