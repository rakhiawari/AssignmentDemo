package training.Programs;

import java.util.Scanner;

public class Common {

    public static void main(String[] args) {

        int[] array1 = new int[20];

        int[] array2 = new int[20];

        Scanner scan = new Scanner(System.in);

        int i, j;

        System.out.printf("Enter the total  no. of element you want to enter in first array: ");

        int total1 = scan.nextInt();

        System.out.printf("Enter First Array:\n");

        for ( i = 0; i < total1 ; i++) {

            array1[i] = scan.nextInt();

        }

        System.out.printf("Enter the total  no. of element you want to enter in second array: ");

        int total2 = scan.nextInt();

        System.out.printf("Enter Second Array:\n");

        for ( i = 0; i < total2 ; i++) {

            array2[i] = scan.nextInt();

        }

        System.out.printf("\nFirst Array:\n");

        for ( i = 0; i < total1 ; i++) {

            System.out.printf("%d ",array1[i]);

        }

        System.out.printf("\nSecond Array:\n");

        for ( i = 0; i < total1 ; i++) {

            System.out.printf("%d ",array2[i]);

        }

        System.out.printf("\nCommon elements are:\n");

        for ( i = 0; i < total1 ; i++) {

            for ( j = 0; j < total2 ; j++) {

                if (array1[i] == array2[j]) {

                    System.out.printf("%d ",array1[i]);

                }

            }

        }

    }

}