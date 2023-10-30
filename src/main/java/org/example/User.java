package org.example;

import java.io.IOException;

public class User {


    private String firstName;
    private String lastName;
    private String fullName;

    public User(String firstName, String lastName) { //skapar user, samt lägg ihop för och efternamn
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
    }

    //här i user har jag kvar set och get då det finns potential till att utveckla user, samt ha flera olika users samtidigt



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

    public void removeUser() throws IOException { //tar bort samtliga incomes och expenses
        ExpenseStorage expS = new ExpenseStorage();
        IncomeStorage incS = new IncomeStorage();
        expS.removeAllExpenses();
        incS.removeAllIncomes();
        System.out.println("All incomes and expenses have been removed!");
        //lägger till default income och expense som inte har något värde. detta görs för att det måste
        //finnas en default i json
        Income defaultIncome = new Income(0, "","" );
        Expense defaulExpense = new Expense(0, "","");
        incS.addIncome(defaultIncome);
        expS.addExpense(defaulExpense);

    }

}
