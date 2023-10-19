package org.example;

import java.io.IOException;
import java.util.Scanner;

public class BudgetTracker {


//to do


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        IncomeStorage incomeStorage = new IncomeStorage();
        ExpenseStorage expenseStorage = new ExpenseStorage();
        incomeStorage.readFile();
        expenseStorage.readFile();
        //ExpenseStorage expenseStorage = new ExpenseStorage();
        User user = new User("viktor", "nyberg");

        Income income1 = new Income(5000, "25/10-23", "1");
        incomeStorage.addIncome(income1);
        Income income2 = new Income(50000, "25/6-23", "2");
        incomeStorage.addIncome(income2);
        Expense expense1 = new Expense(2000, "25/11-23", "1");
        expenseStorage.addExpense(expense1);
        Expense expense2 = new Expense(52000, "25/3-23", "2");
        expenseStorage.addExpense(expense2);
        incomeStorage.saveFile();
        expenseStorage.saveFile();


        incomeStorage.listOfIncome();






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
                    "[7] Search income" +
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
                case 6:
                case 7:
                    System.out.println("search income");

                    String stId = scanner.nextLine();
                    incomeStorage.searchIncome(stId);
                case 8:
                case 0:
                default:
                    System.out.println("Error, please choose an existing alternative!");

            }


        }*/

    }


}
