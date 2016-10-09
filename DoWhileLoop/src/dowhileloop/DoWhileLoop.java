package dowhileloop;

import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double a;
        double sum = 0;
        
        do {
            System.out.printf("Current sum is: %.2f. Enter number or 0 to quit: ", sum);
            
            a = sc.nextDouble();
            sum = sum + a;
        } while(a != 0);
        
    }
    
}
