package org.example;

public class Income extends Transaction {
    //ArrayList<Income> incomeList = new ArrayList<>();
IncomeStorage ic = new IncomeStorage();
    /*public Income() {
        super(2000, 25);
    }*/
private double amount;
private int date;

private String catTest;

//private String myCategory;




    private EIncomeCategory category;

    public Income(String catTest, double amount) {
        super(catTest, amount);
    }


    /*public Income(String catTest, double amount) {
        super(catTest, amount);
        this.catTest = catTest;
        this.amount = amount;
    }*/


    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }


    @Override
    public String toString() {
        return "Income{" +
                "amount=" + amount +
                ", date=" + date +
                "} " + super.toString();
    }

    public String getCatTest() {
        return catTest;
    }

    public void setCatTest(String catTest) {
        this.catTest = catTest;
    }
}

