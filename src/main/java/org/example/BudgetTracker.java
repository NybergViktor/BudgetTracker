package org.example;

import java.io.IOException;
import java.util.Scanner;

public class BudgetTracker {


//to do

    //spara incomes i månader  -- doing
    //läsa incomes för månader
    //ta bort incomes i månader
    // -//- samma för expenses


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        IncomeStorage incomeStorage = new IncomeStorage();
        ExpenseStorage expenseStorage = new ExpenseStorage();
        incomeStorage.readFile();
        expenseStorage.readFile();

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
            System.out.println("[1] See monthly incomes: (not active)\n" +
                    "[2] See monthly expenses: (not active)\n" +
                    "[3] Add new income\n" +//klar
                    "[4] Add new expense\n" +//klar
                    "[5] Remove income\n" +//klar
                    "[6] Remove expense\n" +//klar
                    "[7] Search income\n" +//klar
                    "[8] Search expense\n" +//klar
                    "[9] New User\n" +//klar
                    "[10] See yearly incomes\n" +
                    "[11] See yearly expenses\n" +
                    "[12] See monthly incomes minus expenses\n" +
                    "[0] Exit\n" +//klar
                    " ");

            String userAlt = scanner.nextLine();

            switch (userAlt) {
                case "1"://see monthly incomes

                case "2"://see monthly expenses
                case "3"://add new income

                    System.out.println("What category?");
                    //lista av alla enum
                    System.out.println("salary \n" +
                            "sold item \n" +
                            "second salary \n" +
                            "other ");


                    String chCat = scanner.nextLine();

                    switch (chCat) {
                        case "salary":
                            chCat = "salary";
                            break;

                        case "sold item":
                            chCat = "sold item";
                            break;

                        case "second salary":
                            chCat = "second salary";
                            break;

                        case "other":
                            chCat = "other";
                            break;

                        default:
                            System.out.println("Wrong input, try again");
                            return;


                    }
                    System.out.println("scanner " + chCat);


                    System.out.println("Amount?");
                    double amountI = scanner.nextDouble();
                    System.out.println("amount: " + amountI);

                    System.out.println("Date? Answer with month or year, ex: 'january' or 'year'");
                    String dateI = scanner.next();
                    switch (dateI) {
                        case "january":
                            dateI = "january";
                            break;

                        case "february":
                            dateI = "february";
                            break;
                        case "mars":
                            dateI = "mars";
                            break;
                        case "april":
                            dateI = "january";
                            break;
                        case "may":
                            dateI = "january";
                            break;
                        case "june":
                            dateI = "january";
                            break;
                        case "july":
                            dateI = "january";
                            break;
                        case "august":
                            dateI = "january";
                            break;
                        case "september":
                            dateI = "january";
                            break;
                        case "october":
                            dateI = "january";
                            break;
                        case "nowember":
                            dateI = "january";
                            break;
                        case "december":
                            dateI = "january";
                            break;
                        case "year":
                            dateI = "year";
                            break;
                        default:
                            System.out.println("Wrong input, try again");
                            dateI = scanner.next();
                    }
                            Income newIncome = new Income(amountI, dateI, chCat); // fixa auto-id
                    incomeStorage.addIncome(newIncome);
                    incomeStorage.saveFile();
                    break;
                case "4"://add new expense
                    System.out.println("What category?");
                    //lista av alla enum
                    System.out.println("electricity \n" +
                            "sold item\n" +
                            "food\n" +
                            "other ");

                    String exCat;
                    exCat = scanner.nextLine();

                    switch (exCat) {
                        case "electricity":
                            exCat = "electricity";
                            break;

                        case "sold item":
                            exCat = "sold item";
                            break;

                        case "food":
                            exCat = "food";
                            break;

                        case "other":
                            exCat = "other";
                            break;

                        default:
                            System.out.println("Wrong input, try again");
                            exCat = scanner.next();


                    }

                    System.out.println("Amount? (With dot, ex: 100.0");
                    double amountE = scanner.nextDouble();
                    System.out.println("Date? Answer with month or year, ex: 'january' or 'year'");
                    String dateE = scanner.nextLine();

                    switch (dateE) {
                        case "january":
                            dateE = "january";
                            break;

                        case "february":
                            dateE = "february";
                            break;
                        case "mars":
                            dateE = "mars";
                            break;
                        case "april":
                            dateE = "january";
                            break;
                        case "may":
                            dateE = "january";
                            break;
                        case "june":
                            dateE = "january";
                            break;
                        case "july":
                            dateE = "january";
                            break;
                        case "august":
                            dateE = "january";
                            break;
                        case "september":
                            dateE = "january";
                            break;
                        case "october":
                            dateE = "january";
                            break;
                        case "nowember":
                            dateE = "january";
                            break;
                        case "december":
                            dateE = "january";
                            break;
                        case "year":
                            dateE = "year";
                            break;
                        default:
                            System.out.println("Wrong input, try again");
                            dateE = scanner.next();


                    }
                    Expense newExpense = new Expense(amountE, dateE, exCat);
                    expenseStorage.addExpense(newExpense);
                    expenseStorage.saveFile();
                    break;

                case "5"://remove income
                    System.out.println("What income do you want to remove? choose by ID");
                    incomeStorage.listOfIncome();
                    int rId = scanner.nextInt();

                    incomeStorage.removeIncome(rId);

                case "6"://remove expense
                    System.out.println("What expense do you want to remove? choose by ID");
                    expenseStorage.listOfExpense();
                    int rEd = scanner.nextInt();
                    incomeStorage.removeIncome(rEd);

                case "7"://search income
                    System.out.println("Search income");
                    int stIId = scanner.nextInt(); //stIID = stringIncomeID
                    incomeStorage.searchIncome(stIId);

                case "8"://search expense
                    System.out.println("Search expense");
                    int stEId = scanner.nextInt(); //stEId = stringExpenseID
                    expenseStorage.searchExpense(stEId);

                case "9"://new user
                    System.out.println("Creating a new user will delete current user, incomes & expenses.");
                    //sout "this will delete your already existing user"
                    System.out.println("What is your first name?");
                    String fName = scanner.nextLine();
                    System.out.println("What is your last name?");
                    String lName = scanner.nextLine();
                    User newUser = new User(fName, lName);
                    newUser.removeUser();

                case "0"://exit programme
                    break;

                default:
                    System.out.println("Error, please choose an existing alternative!");

            }


        }

    }


}