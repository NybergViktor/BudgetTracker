package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.Map;

public class ExpenseStorage {
    private Map<Integer, Expense> expenseMap;


    private String fileName = "src/main/expense.json";
    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public void readFile() throws IOException {
        Type type = new TypeToken<Map<Integer, Expense>>(){}.getType();
        Reader reader = new FileReader(new File(fileName));
        expenseMap = gson.fromJson(reader,type);

    }
    public void listOfExpense(){
        System.out.println("Expense List: ");


        for (int i = 1; i < expenseMap.size(); i++){
            String a = Integer.toString(i);
            System.out.println("Expense with ID: " + a);
            System.out.println(expenseMap.get(a).toString());
        }

    }
    public void saveFile() throws IOException {


        FileWriter fw = new FileWriter(new File(fileName));
        gson.toJson(expenseMap, fw);
        fw.close();
        System.out.println("expenses saved!");


    }
    public void addExpense(Expense expense) throws IOException{
        expenseMap.put(expense.getNewId(), expense);
        System.out.println("expense added");
    }
    public void removeExpense(Integer i){
        expenseMap.remove(i);
        System.out.println("expense removed");
    }
    public void removeAllExpenses(){
        for (int i = 1; i < expenseMap.size(); i ++){
            String a = Integer.toString(i);
            expenseMap.remove(a);
        }
    }
    public int getExpenseMapSize(){
        return expenseMap.size();
    }
    public void searchExpense(Integer SId){ //SId = SearchId    ,  en Sträng som anges av user input och som används i denna metod för att söka på ett specifikt id inom hashmap

        if( expenseMap.containsKey(SId)) {
            System.out.println("Expense with ID: " + SId);
            System.out.println(expenseMap.get(SId));
        }else {
            System.out.println("Can't find key: " + SId);
        }
    }
}
