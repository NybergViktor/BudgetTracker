package org.example;

public class Income extends Transaction { //ärver från transaction och använder amount, month och lägger till
    // eget som hör till income. som ID och category ihop med Enum category

    private EIncomeCategory category;


    public int getNewId() {
        return newId;
    }



    private static int newId;

    public Income(double amount, String month, String category) {
        super(amount, month);

        newId++;

        switch (category) { //ange category (ENUM) från user input
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
    public String toString() {//toString för att kunna printa hashmap med info istället för hashmap
        return super.toString() + " ID: " + getNewId() + ", Category: " + getCategory() +
                '}';
    }

    public EIncomeCategory getCategory() {
        return category;
    }


}

