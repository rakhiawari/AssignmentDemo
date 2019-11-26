package training.Programs;

import java.util.Scanner;

public class Fine {

    void SpeedingFine(int speed, boolean hol) {

        if (hol == false) {

            if (speed == 60) {
                System.out.println("No Fine");
            } else if (speed >= 61 && speed <= 80) {
                System.out.println("Fine: 100 dollars");
            } else {
                System.out.println("Fine: 200 dollars");
            }
        } else {

            if (speed == 65) {
                System.out.println("No Fine");
            } else if (speed >= 66 && speed <= 85) {
                System.out.println("Fine: 100 dollars");
            } else {
                System.out.println("Fine: 200 dollars");
            }

        }

    }
        public static void main(String[] args){

            System.out.println("Enter Speed and if its a holiday:");
            Scanner scan = new Scanner(System.in);
            int speed = scan.nextInt();
            boolean hol = scan.nextBoolean();

            Fine obj = new Fine();
            obj.SpeedingFine(speed, hol);
        }

}
