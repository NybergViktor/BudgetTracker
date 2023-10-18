package org.example;

public class Expense extends Transaction{
private EExpenseCategory category;


    public Expense(double amount, String date) {
        super(amount, date);
    }
}
