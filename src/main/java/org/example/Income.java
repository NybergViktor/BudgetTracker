package org.example;

public class Income extends Transaction {

private String id;

    private EIncomeCategory category;

    public Income(double amount, String date, String id, String category) {
        super(amount, date);
        this.id = id;
        switch (category){
            case"salary":
                this.category = EIncomeCategory.SALARY;
                break;
            case"sold item":
                this.category = EIncomeCategory.SOLDITEM;
                break;
            case"second salary":
                this.category = EIncomeCategory.SECONDSALARY;
                break;
            case"other":
                this.category = EIncomeCategory.OTHER;
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

    public EIncomeCategory getCategory() {
        return category;
    }
}

