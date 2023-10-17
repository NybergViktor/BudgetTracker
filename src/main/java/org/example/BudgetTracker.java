package org.example;

import java.io.IOException;
import java.util.Scanner;

public class BudgetTracker {

    public BudgetTracker(){

    }

    public static void main(String[] args) throws IOException {
        Income income = new Income("Car", 20000);
        //income.setCatTest("Salary");
        //income.setAmount(2001);
        System.out.println("Amount: " + income.getAmount() + " category: " + income.getCatTest());
        Scanner scanner = new Scanner(System.in);
        IncomeStorage incomeStorage = new IncomeStorage();
        ExpenseStorage expenseStorage = new ExpenseStorage();
        incomeStorage.readFile();
        incomeStorage.saveFile(income);


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
