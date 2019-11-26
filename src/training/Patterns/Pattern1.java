package training.Patterns;

import java.util.Scanner;

public class Pattern1 {

    void display(int row) {

        for (int i = row; i >= 1; i--) {
            for (int j = i; j >=1; j--) {
                System.out.printf("%d", j);
            }
            System.out.printf("\n");
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter total row you want to display:");
        Scanner scan = new Scanner(System.in);

        int row = scan.nextInt();
        Pattern1 obj = new Pattern1();
        obj.display(row);
    }
}

/*
654321
54321
4321
321
21
1
 */

//DONE.