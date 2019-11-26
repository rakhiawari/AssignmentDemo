package training.Programs;

import java.util.Scanner;

public class Duplicate {

    public static void main(String[] args) {

        int [] array = new int[20];

        Scanner scan = new Scanner(System.in);

        int i, j;

        System.out.printf("Enter the total  no. of element you want to enter: ");

        int total = scan.nextInt();

        for ( i = 0; i < total ; i++) {

            array[i] = scan.nextInt();

        }

        System.out.printf("Duplicate elements are: ");

        for (i=0; i < total; i++) {

            for (j=i+1; j < total; j++) {

                if (array[i] == array[j]) {

                    System.out.printf("%d\n", array[j]);

                }

            }

        }

    }

} 