package org.example;

public class Income extends Transaction {

private String id;

    private EIncomeCategory category;

    public Income(double amount, String date, String id) {
        super(amount, date);
        this.id = id;
    }


    public String getId() {
        return id;
    }



}

