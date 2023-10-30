package org.example;

import java.io.IOException;
import java.util.Scanner;

public class BudgetTracker {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        //vill kunna kalla på metoder i incomestorage och expensestorage
        IncomeStorage incomeStorage = new IncomeStorage();
        ExpenseStorage expenseStorage = new ExpenseStorage();
        //först måste vi read file för att läsa in vad som finns i income.json & expense.json
        incomeStorage.readFile();
        expenseStorage.readFile();

        boolean running = true;//denna loop håller main-programmet igång så länge man inte bryter den


        System.out.println("Hello and Welcome!");

        //intro loop där vi lägger till user för och efternamn, samt skapar user
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

        while (running = true) {

            //meny med samtliga val som finns att välja
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


            try {

                int userAlt = Integer.parseInt(scanner.nextLine()); //parseInt pga att string scanner inte ska hoppas över, källa: https://www.freecodecamp.org/news/java-scanner-nextline-call-gets-skipped-solved/

                if (userAlt == 0) {
                    //exit program
                    System.out.println("Bye Bye!");
                    running = false;
                    break;
                } else if (userAlt == 1) {
                    //see monthly incomes


                    System.out.println("What month?\n" +
                            //för att göra det ännu mer tydligt vad man ska skriva printas samtliga månader i en lista
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
                    thisMonth.toLowerCase(); //om någon trots listan ovan skriver med stor/stora bokstäver så gör vi om till små
                    if (thisMonth.equals("january") || thisMonth.equals("february") || thisMonth.equals("mars") || thisMonth.equals("april") || thisMonth.equals("may") || thisMonth.equals("june") || thisMonth.equals("july") || thisMonth.equals("august") || thisMonth.equals("september") || thisMonth.equals("october") || thisMonth.equals("nowember") || thisMonth.equals("december")) {


                        incomeStorage.addAmountToMonth(thisMonth);

                        System.out.println("Loading Meny!");
                        Thread.sleep(1500); // en 1,5 sek paus för skönare flöde i terminalen


                    } else {
                        //om man skriver något helt galet eller fel hamnar man gär och får en chans till
                        System.out.println(thisMonth);
                        System.out.println("Something was spelled wrong..");

                    }


                } else if (userAlt == 2) {//see monthly expenses

                    //lite mindre kommentarer i detta alternativ då väldigt mycket är samma som i alt 1 men med expenses istället för incomes
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
                    //försöker få med alla månader i en rad för att få mindre rader kod
                    if (thisMonth.equals("january") || thisMonth.equals("february") || thisMonth.equals("mars") || thisMonth.equals("april") || thisMonth.equals("may") || thisMonth.equals("june") || thisMonth.equals("july") || thisMonth.equals("august") || thisMonth.equals("september") || thisMonth.equals("october") || thisMonth.equals("nowember") || thisMonth.equals("december")) {


                        expenseStorage.addAmountToMonth(thisMonth);
                        System.out.println("Loading Meny!");
                        Thread.sleep(1500); // en 1,5 sek paus för skönare flöde i terminalen

                    } else {
                        System.out.println("Something was spelled wrong..");
                    }


                } else if (userAlt == 3) {//add new income

                    //här skapar vi en ny income och då måste vi få lite info om vad det är för sorts income, vi frågar om category, amount, month





                    System.out.println("Date? Answer with month\n" +
                            //här är det viktigt att stava rätt, gör man det så fylls dateI med rätt info annars hamnar man i else och får en chans till

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


                    //försöker få med alla månader i en rad för att få mindre rader kod
                    String whatMonth = scanner.nextLine();
                    whatMonth.toLowerCase();
                    String dateI = "";
                    if (whatMonth.equals("january") || whatMonth.equals("february") || whatMonth.equals("mars") || whatMonth.equals("april") || whatMonth.equals("may") || whatMonth.equals("june") || whatMonth.equals("july") || whatMonth.equals("august") || whatMonth.equals("september") || whatMonth.equals("october") || whatMonth.equals("nowember") || whatMonth.equals("december")) {

                            dateI = whatMonth;

                    } else {
                        System.out.println("Something was spelled wrong..");
                    }


                    System.out.println(dateI);

                    System.out.println("Amount?");
                    double amountI = scanner.nextDouble();
                    System.out.println("amount: " + amountI);

                    System.out.println("What category?  Choose between 1-4 ");
                    //lista av alla enum kategorier
                    System.out.println("[1] salary \n" +
                            "[2] sold item \n" +
                            "[3] second salary \n" +
                            "[4] other ");

                    //för att minimera risken att input blir fel så printas en lista med alternativ 1-4

                    int chCat = scanner.nextInt();//chooseCategory
                    String cate = "";//måste ange ett värde annars bråkar rad 217

                    //här har vi en switch som omvandlar user input (Integer) till string då vi använder string i konstruktorn
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
                            //här hamnar man om man skriver fel och får en chans till

                    }



                    Income newIncome = new Income(amountI, dateI, cate); // här skapar vi en ny income. ID genereras automatiskt
                    incomeStorage.addIncome(newIncome);//add i hashmap
                    incomeStorage.saveFile();//spara i json
                    System.out.println("Loading Meny!");
                    Thread.sleep(1500); // en 1,5 sek paus för skönare flöde i terminalen

                } else if (userAlt == 4) {//add new expense

                    //Expense är likadan som income, här gäller samtliga kommentarer som ovan


                    System.out.println("Date? Answer with month\n" +
                            //här är det viktigt att stava rätt, gör man det så fylls dateI med rätt info annars hamnar man i else och får en chans till

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

//String dateI;
                    //försöker få med alla månader i en rad för att få mindre rader kod
                    String whatMonth = scanner.nextLine();
                    whatMonth.toLowerCase();
                    String dateE = "";
                    if (whatMonth.equals("january") || whatMonth.equals("february") || whatMonth.equals("mars") || whatMonth.equals("april") || whatMonth.equals("may") || whatMonth.equals("june") || whatMonth.equals("july") || whatMonth.equals("august") || whatMonth.equals("september") || whatMonth.equals("october") || whatMonth.equals("nowember") || whatMonth.equals("december")) {

                        dateE = whatMonth;

                    } else {
                        System.out.println("Something was spelled wrong..");
                    }




                    System.out.println("Amount?");
                    double amountE = scanner.nextDouble();
                    System.out.println("amount: " + amountE);

                    System.out.println("What category?  Choose between 1-4 ");
                    //lista av alla enum kategorier
                    System.out.println("[1] salary \n" +
                            "[2] sold item \n" +
                            "[3] second salary \n" +
                            "[4] other ");

                    //för att minimera risken att input blir fel så printas en lista med alternativ 1-4

                    int chCat = scanner.nextInt(); //chooseCategory
                    String cate = "";//måste ange ett värde annars bråkar rad 297

                    //här har vi en switch som omvandlar user input (Integer) till string då vi använder string i konstruktorn
                    switch (chCat) {
                        case 1:
                            cate = "electricity";
                            break;
                        case 2:
                            cate = "rent";
                            break;
                        case 3:
                            cate = "fodd";
                            break;
                        case 4:
                            cate = "other";
                            break;
                        default:
                            System.out.println("Wrong input, try again");
                            //här hamnar man om man skriver fel och får en chans till

                    }

                    Expense newExpense = new Expense(amountE, dateE, cate);
                    expenseStorage.addExpense(newExpense);
                    expenseStorage.saveFile();
                    System.out.println("Loading Meny!");
                    Thread.sleep(1500); // en 1,5 sek paus för skönare flöde i terminalen


                } else if (userAlt == 5) {//remove income
                    System.out.println("What income do you want to remove? choose by ID");
                    incomeStorage.listOfIncome();//user får en lista över alla incomes för att välja vilken man vill ta bort
                    int rId = scanner.nextInt(); //removeId
                    incomeStorage.removeIncome(rId);
                    System.out.println("Loading Meny!");
                    Thread.sleep(1500); // en 1,5 sek paus för skönare flöde i terminalen

                } else if (userAlt == 6) {//remove expense  //samma som incomes
                    System.out.println("What expense do you want to remove? choose by ID");
                    expenseStorage.listOfExpense();
                    int rEd = scanner.nextInt();
                    expenseStorage.removeExpense(rEd);
                    System.out.println("Loading Meny!");
                    Thread.sleep(1500); // en 1,5 sek paus för skönare flöde i terminalen

                } else if (userAlt == 7) {//search income
                    System.out.println("Search income by ID");
                    int stIId = scanner.nextInt(); //stIID = stringIncomeID
                    incomeStorage.searchIncome(stIId); //kallar på metod där man anger ID via stIId
                    System.out.println("Loading Meny!");
                    Thread.sleep(1500); // en 1,5 sek paus för skönare flöde i terminalen

                } else if (userAlt == 8) {//search expense //samma som ovan (income)
                    System.out.println("Search expense");
                    int stEId = scanner.nextInt(); //stEId = stringExpenseID
                    expenseStorage.searchExpense(stEId);
                    System.out.println("Loading Meny!");
                    Thread.sleep(1500); // en 1,5 sek paus för skönare flöde i terminalen

                } else if (userAlt == 9) {//new user
                    System.out.println("Creating a new user will delete current user, incomes & expenses.");
                    System.out.println("What is your first name?");
                    String fName = scanner.nextLine();
                    System.out.println("What is your last name?");
                    String lName = scanner.nextLine();
                    //fyller i vad den nya usern heter
                    User newUser = new User(fName, lName); //skapar ny user med den nya infon
                    newUser.removeUser(); //kallar på metod för att ta bort gamla incomes/expenses
                    System.out.println("Loading Meny!");
                    Thread.sleep(1500); // en 1,5 sek paus för skönare flöde i terminalen

                } else if (userAlt == 10) {//See monthly incomes minus expenses

                    System.out.println("Incomes - Expenses = ");
                    System.out.println(incomeStorage.calcAmount() - expenseStorage.calcAmount()); //räknar ihop incomes och expenses, räknar sedan incomes minus expenses och printar svaret
                    System.out.println("Loading Meny!");
                    Thread.sleep(1500); // en 1,5 sek paus för skönare flöde i terminalen

                } else {
                    System.out.println("Error, please choose an existing alternative!");

                }
            } catch (NumberFormatException nfe) { //catch eftersom vi har Integer.parseint så hamnar man här om man skriver en bokstav
                System.out.println("Wrong input, only numbers allowed!");
                Thread.sleep(1500); // en 1,5 sek paus för skönare flöde i terminalen
            }

        }

    }


}