package training.Patterns;

import java.util.Scanner;

public class Star1 {

    public static void main(String[] args) {

        System.out.printf("Enter the total number of rows you want:");
        Scanner scan = new Scanner(System.in);

        int rows = scan.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }

    }
}

/*
 *
 **
 ***
 ****
 *****
 */