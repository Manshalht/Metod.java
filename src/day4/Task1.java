package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int length = scaner.nextInt();
        Random random = new Random();
        int[] array = new int[length];
        for (int x = 0; x < array.length; x++) {
            array[x] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));
        System.out.println(array.length);
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 8)
                count++;
        }
        System.out.println(count);
        int count1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1)
                count1++;
        }
        System.out.println(count1);
        int count2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                count1++;
        }
        System.out.println(count2);
        int count3 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0)
                count1++;
        }
        System.out.println(count3);
        int sum=0;
        for(int i = 0; i< array.length;i++){
            sum=sum + array[i];
        }
        System.out.println(sum);
    }
}
