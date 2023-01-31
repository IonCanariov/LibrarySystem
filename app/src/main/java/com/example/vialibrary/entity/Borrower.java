package com.example.vialibrary.entity;

public class Borrower {
   private String name, email,role;
    int phoneNumber;

    public Borrower(String name, String email, String role, int phoneNumber) {
        this.name = name;
        this.email = email;
        this.role = role;
        this.phoneNumber = phoneNumber;
    }

    public Borrower() {

    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getRole() {
        return role;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
}
