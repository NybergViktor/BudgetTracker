package org.example;

public class Transaction {

    private double amount; //representerar inkomst/utgift
    private int date; //representerar datum som inkomst/utgift görs

    private String catTest;

    public Transaction(String catTest, double amount) {
        this.catTest = catTest;
        this.amount = amount;
    }
}
