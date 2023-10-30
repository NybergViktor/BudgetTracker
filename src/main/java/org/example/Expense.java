package org.example;

public class Expense extends Transaction { //ärver från transaction och använder amount, month och lägger till
    // eget som hör till income. som ID och category ihop med Enum category

    private EExpenseCategory category;


    public int getNewId() {
        return newId;
    }


    private static int newId;

    public Expense(double amount, String month, String category) {
        super(amount, month); //här anger vi amount och month för income och inte transaction. vi ärver och override. polymorfism
        newId++;

        switch (category) {//ange category (ENUM) från user input
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
    public String toString() { //toString för att kunna printa hashmap med info istället för hashmap. overridar också toString (polymorfism)
        return super.toString() + " ID: " + getNewId() + " Category: " + getCategory();
    }


    public EExpenseCategory getCategory() {
        return category;
    }


}
