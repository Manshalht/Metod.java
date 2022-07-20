package day3;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int count=0;
        while(count<5){
            double a =scaner.nextDouble();
            double b =scaner.nextDouble();
            count++;
            if(b==0){
                System.out.println("Деление на 0 ");
                continue;
            }
            System.out.println(a / b);
        }
    }
}
