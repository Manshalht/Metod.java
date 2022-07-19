package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        for (int x = a + 1; x < b; x++) {
           if(x % 5 ==0 && x % 10 !=0 ){
               System.out.print( x + " " );
           }
        }
    }
}
