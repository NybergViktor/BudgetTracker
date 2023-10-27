package org.example;

public class Transaction {

    public double getAmount() {
        return amount;
    }

    private double amount; //representerar inkomst/utgift
    private String date; //representerar datum som inkomst/utgift görs



    public Transaction(double amount, String date) {

        this.amount = amount;
        this.date = date;

    }


    @Override
    public String toString() {
        return "{" +
                "amount=" + amount +
                ", date='" + date + '\'' +
                '}';
    }
}
