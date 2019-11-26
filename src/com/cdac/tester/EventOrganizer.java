package com.cdac.tester;

import com.cdac.core.Faculty;
import com.cdac.core.Person;
import com.cdac.core.Student;

import java.util.Scanner;

public class EventOrganizer {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        //int choice = scan.nextInt();
        int choice;
        Person array[] = new Person[20];
        int i =0;
        boolean flag=true,flag1=true;

        Person obj;
        while(flag) {
            System.out.println("Enter the choice: ");
            switch (choice=scan.nextInt()) {

                case 1:
                    System.out.println("Enter your first name: ");
                    scan.nextLine();
                    String  firstName = scan.nextLine();

                    System.out.println("Enter your last name: ");
                    String  lastName = scan.nextLine();

                    System.out.println("Enter your work domain: ");
                    String workDomain = scan.nextLine();

                    System.out.println("Enter your experience year: ");
                    int expYear = scan.nextInt();

                    obj = new  Faculty(firstName,lastName,workDomain,expYear);
                    for(int j=0;j<i;j++) {
                        if (obj.equals(array[j])) {
                            System.out.println("Already exist");
                            flag1=false;
                            break;
                        }
                    }
                        if(flag1){
                            array[i]=obj;
                            i++;
                    }
                    break;

                case 2:
                    System.out.println("Enter your first name: ");
                    scan.nextLine();
                    firstName = scan.nextLine();

                    System.out.println("Enter your last name: ");
                    lastName = scan.nextLine();

                    System.out.println("Enter your graduation year: ");
                    int gradYear = scan.nextInt();

                    System.out.println("Enter your course name: ");
                    String courseName = scan.nextLine();

                    obj = new  Student(firstName,lastName,gradYear,courseName);
                    for(int j=0;j<i;j++) {
                        if (obj.equals(array[j])) {
                            System.out.println("Already exist");
                            flag1=false;
                            break;
                        }
                    }
                    if(flag1){
                        array[i]=obj;
                        i++;
                    }
                    break;

                case 3:

                    for (int j = 0; j< i ; j++) {
                        System.out.println(array[j]);
                    }
                    break;

                case 4:
                    System.out.println("Enter your seat number:");
                    int seat = scan.nextInt();

                    array[seat].introduce();
                    break;
                case 5:
                    System.out.println("Enter your seat number:");
                    seat = scan.nextInt();

                    if(array[seat] instanceof Faculty) {
                        ((Faculty)array[seat]).evaluate();
                    }
                    else
                        ((Student)array[seat]).feedback();
                case 6:
                    flag=false;
                    break;

                default:
                    System.out.println("Enter Valid choice");
                    break;
            }
        }
    }
}
