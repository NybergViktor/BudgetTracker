package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Objects;

public class ExpenseStorage {
    private Map<Integer, Expense> expenseMap;//skapar map med integer som key och income som value

    private String fileName = "src/main/expense.json";//här sparas och hämtas json filen
    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public void readFile() throws IOException { //läser in vad som finns på json filen
        Type type = new TypeToken<Map<Integer, Expense>>() {
        }.getType();
        Reader reader = new FileReader(new File(fileName));
        expenseMap = gson.fromJson(reader, type);

    }

    public void listOfExpense() {//en for-loop som loopar genom alla incomes och printar ut en lista i terminalen.

        System.out.println("Expense List: ");


        for (int i = 1; i < expenseMap.size(); i++) {
            //String a = Integer.toString(i);
            System.out.println("Expense with ID: " + i);
            System.out.println(expenseMap.get(i).toString());
        }

    }

    public void saveFile() throws IOException {//sparar till json
        FileWriter fw = new FileWriter(new File(fileName));
        gson.toJson(expenseMap, fw);
        fw.close();
        System.out.println("expenses saved!");
    }

    public void addExpense(Expense expense) throws IOException {//lägger till ny income till incomeMap
        expenseMap.put(expense.getNewId(), expense); //eftersom id ligger som newId++ så ökar den med +1 för varje ny income
        System.out.println("income added");
    }

    public void removeExpense(Integer i) {// k är user input och är en key från map
        expenseMap.remove(i);
        System.out.println("expense removed");
    }

    public void removeAllExpenses() {//for loop som loopar igenom map och raderar alla incomes. i ökar ständingt och tar bort i (i = key)
        for (int i = 1; i < expenseMap.size(); i++) {
            //String a = Integer.toString(i);
            expenseMap.remove(i);
        }
    }

    public void searchExpense(Integer SId) { //SId = SearchId    ,  en Sträng som anges av user input och som används i denna metod för att söka på ett specifikt id inom hashmap

        if (expenseMap.containsKey(SId)) {
            System.out.println("Expense with ID: " + SId);
            System.out.println(expenseMap.get(SId));
        } else {
            System.out.println("Can't find key: " + SId);
        }
    }

    public double calcAmount() throws IOException {//hämtar Amount hos samtliga incomes och returnar ett total summa
        return expenseMap.values().stream().mapToDouble(Expense::getAmount).sum();
    }

    public void addAmountToMonth(String theMonth) {

        double monthSum = 0;//skapar en tillfällig double för att kunna printa


        for (int i = 1; i < expenseMap.size(); i++) {//for loop där vi kollar om theMonth finns som value i map
            //finns den i map så hämtar den amount för theMonth och adderar amount till monthSum

            //tex om en income har månnad may så hämtar den amount på alla incomes på may och samlar amount i en klumpsumma

            if (Objects.equals(expenseMap.get(i).getMonth(), theMonth)) {// de som inte hamnar i denna IF har fel månad

                double thisMonthAmount = expenseMap.get(i).getAmount();

                monthSum += thisMonthAmount;


            }
        }
        System.out.println("The total expenses of " + theMonth + " is: " + monthSum);

    }
}
