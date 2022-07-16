package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if (x >= 1 && x <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (x >= 5 && x <= 8) {
            System.out.println("Средний дом");
        } else if (x >= 9) {
            System.out.println("Большой дом");
        } else if (x <= 0) {
            System.out.println("Неверный ввод");
        }
    }
}
