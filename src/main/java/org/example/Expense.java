package org.example;

public class Expense extends Transaction{

    private String id;
private EExpenseCategory category;


    public Expense(double amount, String date, String id, String category) {
        super(amount, date);
        this.id = id;
        switch (category){
            case "electricity bill":
                this.category = EExpenseCategory.ELECTRICITYBILL;
                break;
            case "sold item":
                this.category = EExpenseCategory.RENT;
                break;

            case "second salary":
                this.category = EExpenseCategory.FUEL;
                break;
            case "food":
                this.category = EExpenseCategory.FOOD;
                break;
            case "other":
                this.category = EExpenseCategory.OTHERS;
                break;
        }
    }


    public String getId() {
        return id;
    }
    @Override
    public String toString(){
        return super.toString() + " ID: " + getId() + " Category: " + getCategory();
    }

    public EExpenseCategory getCategory() {
        return category;
    }
}
