package training.Patterns;

import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {

        System.out.printf("Enter the total no. of row you want to print: ");
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();

        for (int i = row; i>= 1; i++) {
            System.out.printf("\n");
            for (int j = 0; j < row; j++) {
                System.out.printf("-");
            }
        }
    }
} 