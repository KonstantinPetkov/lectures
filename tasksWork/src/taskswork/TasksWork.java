package taskswork;

import java.util.Scanner;

public class TasksWork {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); 
                                
        while (a >= 10) {
            a = a/10;                    
        }
        System.out.println(a);
    }
    
}

