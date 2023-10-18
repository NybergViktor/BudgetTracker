package org.example;

import java.io.IOException;
import java.util.Scanner;

public class BudgetTracker {


//to do
    //read a list of all incomes
    //search income

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        IncomeStorage incomeStorage = new IncomeStorage();
        incomeStorage.readFile();
        //ExpenseStorage expenseStorage = new ExpenseStorage();
        User user = new User("viktor", "nyberg");

        Income income1 = new Income(5000, "25/10-23", "nothing");
        incomeStorage.addIncome(income1);
        Income income2 = new Income(50000, "25/6-23", "nyberg");
        incomeStorage.addIncome(income2);
        incomeStorage.saveFile();

        System.out.println("search income");
        incomeStorage.readFile();
        String stId = scanner.nextLine();
        incomeStorage.searchIncome(stId);

        /*
        System.out.println("Hello and Welcome!");
        while (true) {
            try {
                System.out.println("What is your first name?");
                String fName = scanner.nextLine();
                System.out.println("What is your last name?");
                String lName = scanner.nextLine();
                User user = new User(fName, lName);
                break;
            } catch (Exception e) {
                System.out.println("Name should only contain letters, no numbers!");
            }
        }
        while (true) {
            System.out.println("[1] See monthly incomes:\n" +
                    "[2] See monthly expenses\n" +
                    "[3] Add new income\n" +
                    "[4] Add new expense\n" +
                    "[5] Remove income\n" +
                    "[6] Remove expense\n" +
                    "[7] --\n" +
                    "[8] --\n" +
                    "[0] Exit\n" +
                    " ");

            int userAlt = scanner.nextInt();
            switch (userAlt) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                default:
                    System.out.println("Error, please choose an existing alternative!");

            }


        }*/

    }


}
