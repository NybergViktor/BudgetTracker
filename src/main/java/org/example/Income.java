package org.example;

public class Income extends Transaction {

    private EIncomeCategory category;


    public int getNewId() {
        return newId;
    }
    public int setNewId() {
        newId += 1;
        this.newId = newId;
        return newId;
    }


    private static int newId;

    public Income(double amount, String month, String category) {
        super(amount, month);

        newId++;

        switch (category) {
            case "salary":
                this.category = EIncomeCategory.SALARY;
                break;
            case "sold item":
                this.category = EIncomeCategory.SOLDITEM;
                break;
            case "second salary":
                this.category = EIncomeCategory.SECONDSALARY;
                break;
            case "other":
                this.category = EIncomeCategory.OTHER;
                break;
        }


    }


    @Override
    public String toString() {
        return super.toString() + " ID: " + getNewId() + ", Category: " + getCategory() +
                '}';
    }

    public EIncomeCategory getCategory() {
        return category;
    }


}

