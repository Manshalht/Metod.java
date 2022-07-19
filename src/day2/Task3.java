package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int d = a + 1;
        while (d < b) {
            if (d % 5 == 0 && d % 10 != 0) {
                System.out.println(d);
            }
            d = d + 1;
        }
    }
}
