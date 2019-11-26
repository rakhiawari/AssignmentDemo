package training.Patterns;

import java.util.Scanner;

public class Pattern2 {

    static void display(int row) {

        for (int i = 1; i <= row; i++) {
            for (int j = i; j <= row; j++) {
                System.out.print( j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter total row you want to display:");
        Scanner scan = new Scanner(System.in);

        int row = scan.nextInt();
        display(row);
    }
}

/*
123456
23456
3456
456
56
6
 */

////DONE.