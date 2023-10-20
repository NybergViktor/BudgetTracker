package org.example;

import java.io.IOException;

public class User {

    private String firstName;
    private String lastName;
    private String fullName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
    }

    public void setFullName(){
        this.fullName = firstName + " " + lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public void changeFirstName(String newFirstName){
        this.firstName = newFirstName;
        this.fullName = newFirstName + " " + lastName;
    }

    public void changeLastName(String newLastName){
        this.lastName = newLastName;
        this.fullName = firstName + " " + newLastName;
    }

    public void removeUser() throws IOException {
        //ExpenseStorage expS = new ExpenseStorage();
        IncomeStorage incS = new IncomeStorage();
        //expS.removeAllExpenses();
        incS.removeAllIncomes();
        System.out.println("All incomes have been removed!");
        Income defaultIncome = new Income(0,"", "0", "");
        incS.addIncome(defaultIncome);
    }

}
