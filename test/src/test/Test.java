package test;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        for(int x = 1; x < n; x++) {
            for(int y = 1; y <= (n-x); y++){
                System.out.print(" ");
            }
            for(int z = 0; z < (x + (x-1)); z++) {
                System.out.print("*");
            }
          
            System.out.println();
        }
        System.out.println("     " + " * ");
        System.out.println("     " + "***");
    }    
}
