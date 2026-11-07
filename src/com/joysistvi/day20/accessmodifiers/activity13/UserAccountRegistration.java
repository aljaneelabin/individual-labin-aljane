package com.joysistvi.day20.accessmodifiers.activity13;

public class UserAccountRegistration {

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

        // (^) start of the string
        // (+) one or more occurrences
        // (\\.) Literal dot (.)
        // {2,} At least 2 occurrences - > com
        // ($) End of the string

        else if (!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {
            System.out.println("Invalid email format.");
        }
        else {
            this.email = email;
            System.out.println("Email successfully saved!");
        }
    }

    // Password Setter with validation
    public void setPassword(String password) {

        System.out.println("Checking password...");

        // regex - Regular Expression
        // Character Class
        // Note: .* Dahil gusto nating mahanap ang special character kahit saan nakalagay sa password.
        // w/ (^) Maliban sa mga nasa loob ng brackets
        // w/o (^) Pumili ng kahit isa sa loob ng brackets


        if (password == null || password.length() < 8) {
            System.out.println("Password must be at least 8 characters.");
        }
        else if (!password.matches(".*[A-Z].*")) {
            System.out.println("Password must contain an uppercase letter.");
        }
        else if (!password.matches(".*[a-z].*")) {
            System.out.println("Password must contain a lowercase letter.");
        }
        else if (!password.matches(".*[0-9].*")) {
            System.out.println("Password must contain a number.");
        }
        else if (!password.matches(".*[^A-Za-z0-9].*")) {  // *not a letter or number* to compare input string ; determine if it follows to required format
            System.out.println("Password must contain a special character.");
        }
        else if (password.contains(" ")) {
            System.out.println("Password must not contain spaces.");
        }
        else {
            this.password = password;
            System.out.println("\nPassword successfully saved!");
        }
    }

}
