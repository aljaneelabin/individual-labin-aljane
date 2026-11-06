package com.joysistvi.day20.accessmodifiers.activity13.sample;

public class Sample1 {
    //data
    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String email;
    private String password;

    //getter
    public String getFirstName(){
        return firstName;
    }

    public String getMiddleName(){
        return middleName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getAddress(){
        return address;
    }

    public String getEmail(){
        return email;
    }

    public String getPassword(){
        return password;
    }

    //setter
    public void setFirstName (String firstName){
        this.firstName = firstName;
    }

    public void setMiddleName (String middleName){
        this.middleName = middleName;
    }

    public void setLastName (String lastName){
        this.lastName = lastName;
    }
    public void setAddress (String address){
        this.address = address;
    }

    // Email setter validation
    public void setEmail (String email){
        if (email == null || email.isEmpty()) {
            System.out.println("Email cannot be empty.");
        }
        else if (!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {
            System.out.println("Invalid email format.");
        }
        else {
            this.email = email;
            System.out.println("Email successfully saved!");
        }
    }

    // Password Setter with validation
    public boolean setPassword(String password) {

        if (password == null || password.length() < 8) {
            System.out.println("Password must be at least 8 characters.");
            return false;
        } else if (!password.matches(".*[A-Z].*")) {
            System.out.println("Password must contain an uppercase letter.");
            return false;
        } else if (!password.matches(".*[a-z].*")) {
            System.out.println("Password must contain a lowercase letter.");
            return false;
        } else if (!password.matches(".*[0-9].*")) {
            System.out.println("Password must contain a number.");
            return false;
        } else if (!password.matches(".*[^A-Za-z0-9].*")) {
            System.out.println("Password must contain a special character.");
            return false;
        } else if (password.contains(" ")) {
            System.out.println("Password must not contain spaces.");
            return false;
        } else {
            this.password = password;
            System.out.println("Password successfully saved!");
            return true;
        }
    }
}
