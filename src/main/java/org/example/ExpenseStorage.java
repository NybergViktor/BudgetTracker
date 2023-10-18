package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.Map;

public class ExpenseStorage {
    private Map<String, Expense> expenseMap;


    private String fileName = "src/main/expense.json";
    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public void readFile() throws IOException {
        Type type = new TypeToken<Map<String, Expense>>(){}.getType();
        Reader reader = new FileReader(new File(fileName));
        expenseMap = gson.fromJson(reader,type);

        System.out.println("Expense List: ");
        for( String name : expenseMap.keySet()){
            System.out.println("ID: " + name);
        }
    }
    public void saveFile() throws IOException {//add income /add expense (skapa ny metod och döp till add)


        FileWriter fw = new FileWriter(new File(fileName));
        gson.toJson(expenseMap, fw);
        fw.close();
        System.out.println("expenses saved!");

        //läs info om put hur man anger key
        //testa ändra user.getUsername till setId för att ändra key (rad 30)
    }
    public void addExpense(Expense expense) throws IOException{
        expenseMap.put(expense.getId(), expense);
        System.out.println("expense added");
    }
    public void removeExpense(String i){
        expenseMap.remove(i);
        System.out.println("expense removed");
    }
    public void searchExpense(String SId){ //SId = SearchId    ,  en Sträng som anges av user input och som används i denna metod för att söka på ett specifikt id inom hashmap
        //inte hittat lösningen ännu
    }
}
