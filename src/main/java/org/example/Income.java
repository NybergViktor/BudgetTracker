package org.example;

public class Income extends Transaction {

//private String id;

    private EIncomeCategory category;


    public int getNewId() {

        return newId;
    }

    public int setNewId() {
        newId += 1;
        this.newId = newId;
        return newId;
    }

    private int newId = 0;
    private static double jan;
    private static double feb;
    private static double mar;
    private static double apr;
    private static double may;
    private static double jun;
    private static double jul;
    private static double aug;
    private static double sep;
    private static double oct;
    private static double now;
    private static double dec;




    public Income(double amount, String date, String category) {
        super(amount, date);
        this.newId = setNewId();
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
        switch (date){
            case"january":
                //this.month = EMonths.FEBRUARY;
                feb += amount;
                break;
            case"mars":
                //this.month = EMonths.MARS;
                mar += amount;
                break;
            case"april":
                //this.month = EMonths.APRIL;
                apr += amount;
                break;
            case"may":
                //this.month = EMonths.MAY;
                may += amount;
                break;
            case"june":
                //this.month = EMonths.JUNE;
                jun += amount;
                break;
            case"july":
                //this.month = EMonths.JULY;
                jul += amount;
                break;
            case"august":
                //this.month = EMonths.AUGUST;
                aug += amount;
                break;
            case"september":
                //this.month = EMonths.SEPTEMBER;
                sep += amount;
                break;
            case"october":
                //this.month = EMonths.OKTOBER;
                 oct += amount;
                break;
            case"november":
                //this.month = EMonths.NOVEMBER;
                now += amount;
                break;
            case"december":
                //this.month = EMonths.DECEMBER;
                dec += amount;
                break;
            case "year":
                jan += amount;
                feb += amount;
                mar += amount;
                apr += amount;
                may += amount;
                jun += amount;
                jul += amount;
                aug += amount;
                sep += amount;
                oct += amount;
                now += amount;
                dec += amount;
                break;

        }
    }

    /*
    public String getId() {
        return id;
    }
*/
    public double getYearIncome(){
        double year;
        year = jan + feb + mar + apr + may + jun + jul + aug + sep + oct + now + dec;
        return year;
    }


    @Override
    public String toString(){
        return super.toString() + " ID: " + newId + " Category: " + getCategory();
    }

    public EIncomeCategory getCategory() {
        return category;
    }


}

