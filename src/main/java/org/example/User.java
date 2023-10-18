package org.example;

public class User {

    private String firstName;
    private String lastName;
    private String fullName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void setFullName(){
        this.fullName = firstName + " " + lastName;
    }


    public String getFullName() {
        return fullName;
    }

}
