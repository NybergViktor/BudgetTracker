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

    public Income(double amount, String date, String category) {
        super(amount, date);

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
        /*
        switch (date){
            case"january":
                //this.month = EMonths.FEBRUARY;

                break;
            case"mars":
                //this.month = EMonths.MARS;

                break;
            case"april":
                //this.month = EMonths.APRIL;

                break;
            case"may":
                //this.month = EMonths.MAY;

                break;
            case"june":
                //this.month = EMonths.JUNE;

                break;
            case"july":
                //this.month = EMonths.JULY;

                break;
            case"august":
                //this.month = EMonths.AUGUST;

                break;
            case"september":
                //this.month = EMonths.SEPTEMBER;

            case"october":
                //this.month = EMonths.OKTOBER;

                break;
            case"november":
                //this.mont

                break;
            case"december":

            case "year":

                break;

        }*/

    }


    @Override
    public String toString() {
        return super.toString() + " ID: " + getNewId() + " Category: " + getCategory();
    }

    public EIncomeCategory getCategory() {
        return category;
    }


}

