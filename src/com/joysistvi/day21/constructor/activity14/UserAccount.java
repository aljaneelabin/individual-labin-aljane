package com.joysistvi.day21.constructor.activity14;

public class UserAccount {

    //data
    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String email;
    private String password;


    //parameterized constructor.
    public UserAccount (String firstName, String middleName, String lastName, String address, String email, String password) {

        this.firstName = firstName;
       this.middleName = middleName;
       this.lastName = lastName;
       this.address = address;
       this.email = email;
       this.password = password;
    }

    public static String getEmailError(String email) {
        if (email == null || email.isEmpty()) {
            return "\nEmail cannot be empty.";
        }
        else if (!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {
            return "\nInvalid email format.";
        }

        return null;
    }

    public static String getPasswordError (String password) {
        if (password == null || password.length() < 8) {
           return "\nPassword must be at least 8 characters.";
        }
        else if (!password.matches(".*[A-Z].*")) {
            return "\nPassword must contain an uppercase letter.";
        }
        else if (!password.matches(".*[a-z].*")) {
            return "\nPassword must contain a lowercase letter.";
        }
        else if (!password.matches(".*[0-9].*")) {
            return "\nPassword must contain a number.";
        }
        else if (!password.matches(".*[^A-Za-z0-9].*")) {  // *not a letter or number* to compare input string ; determine if it follows to required format
            return"\nPassword must contain a special character.";
        }
        else if (password.contains(" ")) {
            return "\nPassword must not contain spaces.";

        }
        return null;
    }


    @Override
    public String toString() {
        return "Full Name: " + firstName + " " + middleName + " " + lastName + "\n" +
                "Email: " + email + "\n" +
                "Address: " + address + "\n" ;
    }
}
