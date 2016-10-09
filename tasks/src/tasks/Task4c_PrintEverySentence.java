package tasks;

import java.util.Scanner;

public class Task4c_PrintEverySentence {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();

        String [] str2 = str1.split("\\s");
        int i = 0;
        
        for (i = 0; i < str2.length; i++){
            System.out.println(str2[i]);
        }
    }
}