package training.Patterns;

import java.util.Scanner;

public class Star2 {

    public static void main(String[] args) {

        System.out.printf("Enter the total number of rows you want:");
        Scanner scan = new Scanner(System.in);

        int rows = scan.nextInt();
        //int count = rows;
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j >= i; j--) {
                System.out.printf("*");
            }
          //  count--;
            System.out.printf("\n");
        }
    }
}

/*
 *****
 ****
 ***
 **
 *
 */