package training.Programs;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        int [] array = new int[20];

        int [] rev = new int[20];

        int i, j;

        Scanner scan = new Scanner(System.in);

        System.out.printf("Enter the total  no. of element you want to enter: ");

        int total = scan.nextInt();

        for (i = 0; i < total ; i++) {

            array[i] = scan.nextInt();

        }

        System.out.printf("Current Array: ");

        for ( i = 0; i < total ; i++) {

            System.out.printf("%d ", array[i]);

        }

        System.out.printf("\nReverse Array: ");

        for ( i = 0; i < total ; i++) { }

        for ( j = 0; i > 0; j++) {

            rev[j] = array[i-1];

            i--;

        }

        for ( i = 0; i < total ; i++) {

            System.out.printf("%d ", rev[i]);

        }

    }

} 