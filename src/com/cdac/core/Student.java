package com.cdac.core;

public class Student extends Person {

    public Student(String firstname, String lastName, int gradYear, String courseName) {

        this.firstName = firstname;
        this.lastName = lastName;
        this.gradYear = gradYear;
        this.courseName = courseName;
    }

    private int gradYear;
    private String courseName;

    public void introduce() {

        System.out.println("First Name: "+ firstName);
        System.out.println("Grduation Year: "+ lastName);
    }

    public void feedback() {

        System.out.println("Feedback Submitted!");
    }



    @Override
    public String toString() {
        return "Student{" +
                "gradYear=" + gradYear +
                ", courseName='" + courseName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
