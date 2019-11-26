package training.Patterns;

import java.util.Scanner;

public class Star3 {

    public static void main(String[] args) {

        System.out.printf("Enter the total longest * number you want:");
        Scanner scan = new Scanner(System.in);

        int rows = scan.nextInt();

        for (int i = 1; i <= (rows * 2) - 1; i++) {

            if (i <= rows) {
                for (int j = 1; j >= i; j++) {
                    System.out.printf("*");
                }
            }
           /* else {
                for (int k=rows-1;k>=1;k--) {
                    System.out.printf("*");
                }
            }*/
        }
    }
}

/*
 *
 **
 ***
 ****
 *****
 ****
 ***
 **
 *
 */