package training.Patterns;

import java.util.Scanner;

public class Pattern3 {

     void display(int row) {

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d", i);

            }
            System.out.printf("\n");
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter total row you want to display:");
        Scanner scan = new Scanner(System.in);

        int row = scan.nextInt();
        Pattern3 obj = new Pattern3();
        obj.display(row);
    }

}

/*
1
22
333
4444
55555
666666
 */

//DONE.