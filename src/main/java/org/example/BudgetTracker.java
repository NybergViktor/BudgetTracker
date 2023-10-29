package org.example;

import java.io.IOException;
import java.util.Scanner;

public class BudgetTracker {


    /*
    be user skriva månad
hämta alla som är lika med den månaden
här kanske du få spara ner i ny Map eventuellt
räkna ihop alla värden för amount där månaden är samma tex September



testa containsKey() alla värden har en egen nyckel
     */

//to do

    //spara incomes i månader  -- doing
    //läsa incomes för månader
    //ta bort incomes i månader
    // -//- samma för expenses


    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        IncomeStorage incomeStorage = new IncomeStorage();
        ExpenseStorage expenseStorage = new ExpenseStorage();
        incomeStorage.readFile();
        expenseStorage.readFile();

        boolean running = false;
        boolean intro = true;


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
        while (intro == true) {

            System.out.println("\n" +
                    "[1] See monthly incomes\n" +//klar
                    "[2] See monthly expenses\n" +//klar
                    "[3] Add new income\n" +//klar
                    "[4] Add new expense\n" +//klar
                    "[5] Remove income\n" +//klar
                    "[6] Remove expense\n" +//klar
                    "[7] Search income\n" +//klar
                    "[8] Search expense\n" +//klar
                    "[9] New User\n" +//klar
                    "[10] See monthly incomes minus expenses \n" + //klar
                    "[0] Exit\n" +//klar
                    " ");

            intro = false;
            running = true;

        }
        while (running = true) {

            int userAlt = Integer.parseInt(scanner.nextLine()); //parseInt pga att string scanner inte ska hoppas över, källa: https://www.freecodecamp.org/news/java-scanner-nextline-call-gets-skipped-solved/


            if (userAlt == 0) {
                //exit
                running = false;
                break;
            } else if (userAlt == 1) {
                //see monthly incomes


                System.out.println("What month?\n" +

                        "january\n" +
                        "february\n" +
                        "mars\n" +
                        "april\n" +
                        "may\n" +
                        "june\n" +
                        "july\n" +
                        "august\n" +
                        "september\n" +
                        "october\n" +
                        "november\n" +
                        "december\n" +
                        " ");

                String thisMonth = scanner.nextLine();
                thisMonth.toLowerCase();
                if (thisMonth == "january" || thisMonth == "february" || thisMonth ==  "mars" || thisMonth ==  "april" || thisMonth ==  "may" || thisMonth ==  "june" || thisMonth ==  "july" || thisMonth == "august" || thisMonth ==  "september" || thisMonth ==  "october" || thisMonth ==  "nowember" || thisMonth ==  "december"){


                    incomeStorage.addAmountToMonth(thisMonth);
                } else{
                    System.out.println(thisMonth);
                    System.out.println("Something was spelled wrong..");
                }


            } else if (userAlt == 2) {//see monthly expenses



                System.out.println("What month?\n" +

                        "january\n" +
                        "february\n" +
                        "mars\n" +
                        "april\n" +
                        "may\n" +
                        "june\n" +
                        "july\n" +
                        "august\n" +
                        "september\n" +
                        "october\n" +
                        "november\n" +
                        "december\n" +
                        " ");

                String thisMonth = scanner.nextLine();
                thisMonth.toLowerCase();
                if (thisMonth.equals("january") || thisMonth.equals("february") || thisMonth.equals("mars") || thisMonth.equals("april") ||thisMonth.equals("may") || thisMonth.equals("june") ||thisMonth.equals("july") || thisMonth.equals("august") ||thisMonth.equals("september") || thisMonth.equals("october") ||thisMonth.equals("nowember") || thisMonth.equals("december") ){


                    expenseStorage.addAmountToMonth(thisMonth);
                } else{
                    System.out.println("Something was spelled wrong..");
                }


            } else if (userAlt == 3) {//add new income

                System.out.println("What category?  Choose between 1-4 ");
                //lista av alla enum kategorier
                System.out.println("[1] salary \n" +
                        "[2] sold item \n" +
                        "[3] second salary \n" +
                        "[4] other ");


                int chCat = scanner.nextInt();
                String cate = "";//måste ange ett värde annars bråkar rad 159
                switch (chCat) {
                    case 1:
                        cate = "salary";
                        break;

                    case 2:
                        cate = "sold item";
                        break;

                    case 3:
                        cate = "second salary";
                        break;

                    case 4:
                        cate = "other";
                        break;

                    default:
                        System.out.println("Wrong input, try again");


                }


                System.out.println("Amount?");
                double amountI = scanner.nextDouble();
                System.out.println("amount: " + amountI);

                System.out.println("Date? Answer with month or year, ex: 'january' or 'year'");
                String dateI = scanner.next();

                switch (dateI) {
                    case "january":

                        break;

                    case "february":

                        break;
                    case "mars":

                        break;
                    case "april":

                        break;
                    case "may":

                        break;
                    case "june":

                        break;
                    case "july":

                        break;
                    case "august":

                        break;
                    case "september":

                        break;
                    case "october":

                        break;
                    case "nowember":

                        break;
                    case "december":

                        break;
                    case "year":

                        break;
                    default:
                        System.out.println("Wrong input, try again");
                        dateI = scanner.next();
                }
                Income newIncome = new Income(amountI, dateI, cate); // fixa auto-id
                incomeStorage.addIncome(newIncome);
                incomeStorage.saveFile();

            } else if (userAlt == 4) {//add new expense
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

                System.out.println("Amount?");
                double amountE = scanner.nextDouble();
                System.out.println("Date? Answer with month. If this inomce reapeats all year around, simply type: year   ex: 'january' or 'year'");
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


            } else if (userAlt == 5) {//remove income
                System.out.println("What income do you want to remove? choose by ID");
                incomeStorage.listOfIncome();
                int rId = scanner.nextInt();

                incomeStorage.removeIncome(rId);

            } else if (userAlt == 6) {//remove expense
                System.out.println("What expense do you want to remove? choose by ID");
                expenseStorage.listOfExpense();
                int rEd = scanner.nextInt();
                incomeStorage.removeIncome(rEd);

            } else if (userAlt == 7) {//search income
                System.out.println("Search income by ID");
                incomeStorage.listOfIncome();
                int stIId = scanner.nextInt(); //stIID = stringIncomeID
                incomeStorage.searchIncome(stIId);

            } else if (userAlt == 8) {//search expense
                System.out.println("Search expense");
                int stEId = scanner.nextInt(); //stEId = stringExpenseID
                expenseStorage.searchExpense(stEId);

            } else if (userAlt == 9) {//new user
                System.out.println("Creating a new user will delete current user, incomes & expenses.");
                //sout "this will delete your already existing user"
                System.out.println("What is your first name?");
                String fName = scanner.nextLine();
                System.out.println("What is your last name?");
                String lName = scanner.nextLine();
                User newUser = new User(fName, lName);
                newUser.removeUser();


            } else if (userAlt == 10) {//See monthly incomes minus expenses

                System.out.println("Incomes - Expenses = ");
                System.out.println(incomeStorage.calcAmount() - expenseStorage.calcAmount());
                Thread.sleep(1500); // en 1,5 sek paus för skönare flöde i terminalen

            } else {
                System.out.println("Error, please choose an existing alternative!");

            }
        }

    }


}