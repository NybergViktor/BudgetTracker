package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.Map;

public class IncomeStorage {



    private Map<String, Income> incomeMap;


    private String fileName = "src/main/income.json";
    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public void readFile() throws IOException {
        Type type = new TypeToken<Map<String, Income>>(){}.getType();
        Reader reader = new FileReader(new File(fileName));
        incomeMap = gson.fromJson(reader,type);

        System.out.println("Income List: ");
        for( String name : incomeMap.keySet()){
            System.out.println("ID: " + name);
        }
    }
    public void saveFile() throws IOException {//add income /add expense (skapa ny metod och döp till add)


        FileWriter fw = new FileWriter(new File(fileName));
        gson.toJson(incomeMap, fw);
        fw.close();
        System.out.println("incomes saved!");

        //läs info om put hur man anger key
        //testa ändra user.getUsername till setId för att ändra key (rad 30)
    }
    public void addIncome(Income income) throws IOException{
        incomeMap.put(income.getId(), income);
        System.out.println("income added");
    }
    public void removeIncome(String i){
        incomeMap.remove(i);
        System.out.println("income removed");
    }
    public void searchIncome(String SId){ //SId = SearchId    ,  en Sträng som anges av user input och som används i denna metod för att söka på ett specifikt id inom hashmap
        System.out.println(incomeMap.get(SId));
    }




}
