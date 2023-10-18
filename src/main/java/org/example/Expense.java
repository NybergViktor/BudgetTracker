package org.example;

public class Expense extends Transaction{

    private String id;
private EExpenseCategory category;


    public Expense(double amount, String date, String id) {
        super(amount, date);
        this.id = id;
    }


    public String getId() {
        return id;
    }
}
