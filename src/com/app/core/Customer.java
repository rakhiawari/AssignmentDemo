package com.app.core;

import java.util.Objects;

public class Customer {

    private int regAmount;
    private String email;
    private String password;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return regAmount == customer.regAmount &&
                Objects.equals(email, customer.email) &&
                Objects.equals(password, customer.password);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "regAmount=" + regAmount +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Customer(String email, String password, int regAmount) {

        this.email = email;
        this.password = password;
        this.regAmount = regAmount;
    }

    public static void main(String[] args) {

        //
    }


}
