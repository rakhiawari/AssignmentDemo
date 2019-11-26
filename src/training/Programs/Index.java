package training.Programs;

import java.util.Scanner;

public class Index {

    public static void main(String[] args) {

        int[] array = new int[20];

        Scanner scan = new Scanner(System.in);

        System.out.printf("Enter the total  no. of element you want to enter: ");

        int total = scan.nextInt();

        for (int i = 0; i < total; i++) {

            array[i] = scan.nextInt();
        }

        System.out.printf("Enter the no. to find its index: ");

        int number;
        number = scan.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                System.out.println(i);
                break;
            }
        }
    }
} 

 