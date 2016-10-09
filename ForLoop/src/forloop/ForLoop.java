package forloop;

import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number N and I will give you the sum 1 to N: ");
        int n = sc.nextInt();
        
        int sum = 0;
        
        for(int i = 1; i <= n; i++){
            sum = sum + i; 
        }
        
        System.out.printf("The sum of 1 to %d is: %d%n", n, sum);
    }    
}
