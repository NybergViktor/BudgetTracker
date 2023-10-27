package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.Map;

public class IncomeStorage {


    private Map<Integer, Income> incomeMap;
    private double sum;
    private String fileName = "src/main/income.json";
    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public void readFile() throws IOException {
        Type type = new TypeToken<Map<Integer, Income>>() {
        }.getType();
        Reader reader = new FileReader(new File(fileName));
        incomeMap = gson.fromJson(reader, type);
    }
    public double calcAmount() throws IOException {
        return incomeMap.values().stream().mapToDouble(Income::getAmount).sum();



    }

    public void listOfIncome() {
        System.out.println("Income List: ");

        for (int i = 1; i < incomeMap.size(); i++) {
            System.out.println("Income with ID: " + i);
            System.out.println(incomeMap.get(i));
        }
    }

    public void saveFile() throws IOException {
        FileWriter fw = new FileWriter(new File(fileName));
        gson.toJson(incomeMap, fw);
        fw.close();
        System.out.println("incomes saved!");
    }

    public void addIncome(Income income) throws IOException {
        incomeMap.put(income.getNewId(), income);
        System.out.println("income added");
    }


    public void removeIncome(Integer i) {
        incomeMap.remove(i);
        System.out.println("income removed");
    }

    public void removeAllIncomes() {
        for (int i = 1; i < incomeMap.size(); i++) {
            //String a = Integer.toString(i);
            incomeMap.remove(i);
        }
    }

    public void sumOfIncomes() {
        double sum = 0;
        for (int i = 1; i < incomeMap.size(); i++) {
            if (incomeMap.containsKey("february")){  //key or value

            } else {

            }

        }




    }

    public int getIncomeMapSize() {
        return incomeMap.size();
    }

    public void searchIncome(Integer SId) { //SId = SearchId
        //En integer som anges av user input och som används i denna metod för att söka på ett specifikt id inom hashmap
        if (incomeMap.containsKey(SId)) {
            System.out.println("Income with ID: " + SId);
            System.out.println(incomeMap.get(SId));
        } else {
            System.out.println("Can't find key: " + SId);
        }
    }


    //skapa temporär map med alla värden från den månad man vill ha

}
