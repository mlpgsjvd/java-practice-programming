package array;
import java.util.*;

public class ArrEx {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] marks = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }
        for(int i = 0; i < marks.length; i++) {
            System.out.println("Marks[" + (i + 1) + "] = " + marks[i]);
        }
        /* int scores[]=new int[3];
        scores[0] = 10;
        scores[1] = 20;
        scores[2] = 30;
        int age[] = {1, 2, 3};
        int s[] = new int[] {1, 4, 8}; */
        /* Exam ob[] = new Exam[3];
        ob[0] = new Exam(); */
        
        // Uncomment the following lines if you want to create Exam objects
        /*
        Exam ob[] = new Exam[3];
        ob[0] = new Exam();
        ob[1] = new Exam();
        ob[2] = new Exam();
        */
        
        // Closing the Scanner object
        sc.close();
    }
}

class Exam {
    public Exam() {
        System.out.println("Cons called");
    }
}
