package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Objects;

public class IncomeStorage {

    private Map<Integer, Income> incomeMap;  //skapar map med integer som key och income som value

    private String fileName = "src/main/income.json"; //här sparas och hämtas json filen
    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public void readFile() throws IOException { //läser in vad som finns på json filen
        Type type = new TypeToken<Map<Integer, Income>>() {
        }.getType();
        Reader reader = new FileReader(new File(fileName));
        incomeMap = gson.fromJson(reader, type);
    }

    public double calcAmount() throws IOException { //hämtar Amount hos samtliga incomes och returnar ett total summa
        return incomeMap.values().stream().mapToDouble(Income::getAmount).sum();
    }

    public void listOfIncome() {
        System.out.println("Income List: ");

        for (int i = 1; i < incomeMap.size(); i++) {//en for-loop som loopar genom alla incomes och printar ut en lista i terminalen.
            System.out.println("Income with ID: " + i);
            System.out.println(incomeMap.get(i));
        }
    }

    public void saveFile() throws IOException { //sparar till json
        FileWriter fw = new FileWriter(new File(fileName));
        gson.toJson(incomeMap, fw);
        fw.close();
        System.out.println("incomes saved!");
    }

    public void addIncome(Income income) throws IOException { //lägger till ny income till incomeMap
        incomeMap.put(income.getNewId(), income); //eftersom id ligger som newId++ så ökar den med +1 för varje ny income
        System.out.println("income added");
    }

    public void removeIncome(Integer k) { // k är user input och är en key från map
        incomeMap.remove(k);
        System.out.println("income removed");
    }

    public void removeAllIncomes() { //for loop som loopar igenom map och raderar alla incomes. i ökar ständingt och tar bort i (i = key)
        for (int i = 1; i < incomeMap.size(); i++) {
            incomeMap.remove(i);
        }
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

    public void addAmountToMonth(String theMonth) {

        double monthSum = 0; //skapar en tillfällig double för att kunna printa

        for (int i = 1; i < incomeMap.size(); i++) { //for loop där vi kollar om theMonth finns som value i map
            //finns den i map så hämtar den amount för theMonth och adderar amount till monthSum

            //tex om en income har månnad may så hämtar den amount på alla incomes på may och samlar amount i en klumpsumma
             if(Objects.equals(incomeMap.get(i).getMonth(), theMonth)) {// de som inte hamnar i denna IF har fel månad

                 double thisMonthAmount = incomeMap.get(i).getAmount();

                 monthSum += thisMonthAmount;

             }
        }
        System.out.println("The total incomes of " + theMonth + " is: " + monthSum);

    }


}
