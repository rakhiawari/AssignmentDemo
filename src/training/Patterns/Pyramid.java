package training.Patterns;

import java.util.Scanner;

public class Pyramid {

    public static void main(String[] args) {

        int row;

        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter number of rows you want to print:");
        row = scan.nextInt();
        int count = row - 1;
        for (int element = 1; element <= row; element++) {
            for (int j = 0; j < count; j++) {
                System.out.printf(" ");
            }
            count--;
            for (int k = 1; k <= element; k++) {
                System.out.print(element + " ");       // System.out.printf("%d ",element);
            }
            System.out.printf("\n");
        }
    }
}
