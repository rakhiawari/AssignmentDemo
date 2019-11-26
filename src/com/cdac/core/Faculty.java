package com.cdac.core;

public class Faculty extends Person {

    public Faculty(String firstName ,String lastName, String workDomain, int expYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.workDomain = workDomain;
        this.expYear = expYear;
    }

    private int expYear;
    private String workDomain;

    public void introduce() {

        System.out.println("Last Name: " + lastName);
        System.out.println("Experience Year: " + expYear);
    }
    public void evaluate() {
        System.out.println("Students Evaluated!");
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "expYear=" + expYear +
                ", workDomain='" + workDomain + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
