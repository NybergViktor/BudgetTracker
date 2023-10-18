package org.example;

public class Transaction {

    private double amount; //representerar inkomst/utgift
    private String date; //representerar datum som inkomst/utgift görs



    public Transaction(double amount, String date) {

        this.amount = amount;
        this.date = date;
    }
}
