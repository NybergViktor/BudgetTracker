package org.example;

public class Expense extends Transaction {

    private EExpenseCategory category;


    public int getNewId() {
        return newId;
    }
    public int setNewId() {
        newId += 1;
        this.newId = newId;
        return newId;
    }

    private int newId;

    public Expense(double amount, String month, String category) {
        super(amount, month);
        this.newId = setNewId();

        switch (category) {
            case "electricity":
                this.category = EExpenseCategory.ELECTRICITY;
                break;
            case "rent":
                this.category = EExpenseCategory.RENT;
                break;
            case "food":
                this.category = EExpenseCategory.FOOD;
                break;
            case "other":
                this.category = EExpenseCategory.OTHER;
                break;
        }

    }

    @Override
    public String toString() {
        return super.toString() + " ID: " + getNewId() + " Category: " + getCategory();
    }


    public EExpenseCategory getCategory() {
        return category;
    }


}
