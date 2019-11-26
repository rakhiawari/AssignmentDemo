package training.Programs;

import java.util.Scanner;

public class MatrixAdd {

    public static void main(String[] args) {

        int[][] array1 = new int[20][20];

        int[][] array2 = new int[20][20];

        int[][] sum = new int[20][20];

        System.out.printf("Enter the total no. of rows and columns you are going to enter:");

        Scanner scan = new Scanner(System.in);

        int row = scan.nextInt();

        int col = scan.nextInt();

        int i, j;

        System.out.printf("\nEnter first matrix: ");

        for (i = 0; i < row; i++) {

            for (j = 0; j < col; j++) {

                array1[i][j] = scan.nextInt();

            }

        }

        System.out.printf("\nEnter second matrix: ");

        for (i = 0; i < row; i++) {

            for (j = 0; j < col; j++) {

                array2[i][j] = scan.nextInt();

            }

        }

        System.out.printf("\nFirst matrix: ");

        for (i = 0; i < row; i++) {

            System.out.printf("\n");

            for (j = 0; j < col; j++) {

                System.out.printf("%02d ", array1[i][j]);

            }

        }

        System.out.printf("\nSecond matrix: ");

        for (i = 0; i < row; i++) {

            System.out.printf("\n");

            for (j = 0; j < col; j++) {

                System.out.printf("%02d ", array2[i][j]);

            }

        }

        for (i = 0; i < row; i++) {

            for (j = 0; j < col; j++) {

                sum[i][j] = array1[i][j] + array2[i][j];

            }

        }

        System.out.printf("\nSum of two Matrix: \n");

        for (i = 0; i < row; i++) {

            System.out.printf("\n");

            for (j = 0; j < col; j++) {

                System.out.printf("%02d ", sum[i][j]);

            }

        }

    }

} 