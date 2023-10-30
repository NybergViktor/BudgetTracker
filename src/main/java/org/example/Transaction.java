package org.example;

public class Transaction { //parent klass som income och expense ärver från

    public double getAmount() {
        return amount;
    }

    private double amount; //representerar inkomst/utgift

    private String month; //representerar månad som inkomst/utgift görs



    public Transaction(double amount, String month) {

        this.amount = amount;
        this.month = month;

    }


    @Override
    public String toString() {
        return "{" +
                "amount" + ": " +  amount + ", " +
                "month" + ": " + month + ",";
    }

    public String getMonth() {
        return month;
    }
}
