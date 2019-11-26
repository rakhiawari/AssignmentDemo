package training.Programs;

import java.util.Scanner;

public class Maximum {

    public static void main(String[] args) {

        int i;

        int[] array = new int[20];

        Scanner scan = new Scanner(System.in);

        System.out.printf("Enter the total no. of element you want to enter in first array: ");

        int total = scan.nextInt();

        int max1 = 0, max2 = 0;

        for ( i = 0; i < total ; i++) {

            array[i] = scan.nextInt();

        }

        for ( i = 0; i < total ; i++) {

            if (max1 < array[i]) {

                max2 = max1;

                max1 = array[i];

            }

        }

        System.out.printf("First Max: %d", max1);

        System.out.printf("\nSecond Max: %d", max2);

    }

}