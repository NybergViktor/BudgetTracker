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

    public Expense(double amount, String date, String category) {
        super(amount, date);
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
                this.category = EExpenseCategory.OTHERS;
                break;
        }
        /*
        switch (date) {
            case "january":
                //this.month = EMonths.FEBRUARY;
                //eYear.setJan( amount);

                break;
            case "mars":
                //this.month = EMonths.MARS;
                mar += amount;
                break;
            case "april":
                //this.month = EMonths.APRIL;
                apr += amount;
                break;
            case "may":
                //this.month = EMonths.MAY;
                may += amount;
                break;
            case "june":
                //this.month = EMonths.JUNE;
                jun += amount;
                break;
            case "july":
                //this.month = EMonths.JULY;
                jul += amount;
                break;
            case "august":
                //this.month = EMonths.AUGUST;
                aug += amount;
                break;
            case "september":
                //this.month = EMonths.SEPTEMBER;
                sep += amount;
                break;
            case "october":
                //this.month = EMonths.OKTOBER;
                oct += amount;
                break;
            case "november":
                //this.month = EMonths.NOVEMBER;
                now += amount;
                break;
            case "december":
                //this.month = EMonths.DECEMBER;
                dec += amount;
                break;
            case "year":

                break;
        }

         */
    }

    @Override
    public String toString() {
        return super.toString() + " ID: " + getNewId() + " Category: " + getCategory();
    }


    public EExpenseCategory getCategory() {
        return category;
    }


}
