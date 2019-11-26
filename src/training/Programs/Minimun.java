package training.Programs;

import java.util.Scanner;

public class Minimun {

    public static void main(String[] args) {

        int i;

        int[] array = new int[20];

        Scanner scan = new Scanner(System.in);

        System.out.printf("Enter the total no. of element you want to enter in array: ");

        int total = scan.nextInt();

        int min1 = 9999, min2 = 9999;

        for (i = 0; i < total; i++) {

            array[i] = scan.nextInt();

        }

        for (i = 0; i < total; i++) {
            if (min1 > array[i]) {

                min2 = min1;
                min1 = array[i];

            }
        }

        System.out.printf("First Min: %d", min1);

        System.out.printf("\nSecond Min: %d", min2);

    }

}