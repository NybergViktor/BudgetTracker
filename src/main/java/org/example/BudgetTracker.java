package org.example;

import java.io.IOException;
import java.util.Scanner;

public class BudgetTracker {


//to do

    //spara incomes i månader
    //läsa incomes för månader
    //ta bort incomes i månader
    // -//- samma för expenses


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        IncomeStorage incomeStorage = new IncomeStorage();
        ExpenseStorage expenseStorage = new ExpenseStorage();
        incomeStorage.readFile();
        expenseStorage.readFile();

/*
        Income income1 = new Income(5000, "25/10-23", "1", "salary");
        incomeStorage.addIncome(income1);
        Income income2 = new Income(50000, "25/6-23", "2", "other");
        incomeStorage.addIncome(income2);
        Expense expense1 = new Expense(2000, "25/11-23", "1", "rent");
        expenseStorage.addExpense(expense1);
        Expense expense2 = new Expense(52000, "25/3-23", "2", "food");
        expenseStorage.addExpense(expense2);
        incomeStorage.saveFile();
        expenseStorage.saveFile();
*/







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
                    "[8] Search expense" +
                    "[9] New User" +
                    "[0] Exit\n" +
                    " ");

            int userAlt = scanner.nextInt();
            switch (userAlt) {
                case 1://see monthly incomes
                case 2://see monthly expenses
                case 3://add new income
                    System.out.println("What category?");
                    String cateI = scanner.nextLine();
                    System.out.println("Amount?");
                    double amountI = scanner.nextInt();
                    System.out.println("Date? Must be: dd/mm/yy");
                    String dateI = scanner.nextLine();
                    Income newIncome = new Income(amountI, dateI, "1" , cateI); // fixa auto-id
                    incomeStorage.addIncome(newIncome);
                case 4://add new expense
                    System.out.println("What category?");
                    String cateE = scanner.nextLine();
                    System.out.println("Amount?");
                    double amountE = scanner.nextInt();
                    System.out.println("Date? Must be: dd/mm/yy");
                    String dateE = scanner.nextLine();
                    Expense newExpense = new Expense(amountE, dateE, "1" , cateE); // fixa auto-id
                    expenseStorage.addExpense(newExpense);
                case 5://remove income
                    System.out.println("What income do you want to remove? choose by ID");
                    incomeStorage.listOfIncome();
                    String rId = scanner.nextLine();
                    incomeStorage.removeIncome(rId);
                case 6://remove expense
                    System.out.println("What expense do you want to remove? choose by ID");
                    expenseStorage.listOfExpense();
                    String rEd = scanner.nextLine();
                    incomeStorage.removeIncome(rEd);
                case 7://search income
                    System.out.println("Search income");
                    String stIId = scanner.nextLine(); //stIID = stringIncomeID
                    incomeStorage.searchIncome(stIId);
                case 8://search expense
                    System.out.println("Search expense");
                    String stEId = scanner.nextLine(); //stEId = stringExpenseID
                    expenseStorage.searchExpense(stEId);
                case 9://new user
                    System.out.println("Creating a new user will delete current user, incomes & expenses.");
                    //sout "this will delete your already existing user"
                    System.out.println("What is your first name?");
                    String fName = scanner.nextLine();
                    System.out.println("What is your last name?");
                    String lName = scanner.nextLine();
                    User newUser = new User(fName, lName);
                    newUser.removeUser();
                case 0://exit programme
                    break;
                default:
                    System.out.println("Error, please choose an existing alternative!");

            }


        }

    }


}
