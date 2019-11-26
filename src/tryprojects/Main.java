package tryprojects;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int choice;

        do {
            System.out.println("1.Add Data\n2.View Data\n3.Update Data\n4.remove Data\n4.View removed data\n0.EXIT!!!");
            System.out.println("Enter your choice:");
            choice=scanner.nextInt();

            switch (choice) {
                case 1:

                    break;
                default:
                    System.out.println("Enter valid ");
            }
        }while(choice!=0);

    }
}
