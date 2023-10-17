package org.example;

public class Expense extends Transaction{
private EExpenseCategory category;

    public Expense(String catTest, double amount) {
        super(catTest, amount);
        this.category = category;
    }
}
