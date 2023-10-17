package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.Map;

public class IncomeStorage {


    private Map<String, Income> incomeList;
    //private ArrayList<Income> incomeList = new ArrayList<>();

    private String fileName = "src/main/income.json";
    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public IncomeStorage(){
    }


    public void readFile() throws IOException{
        Type type = new TypeToken<Map<String, Income>>(){}.getType();
        Reader reader = new FileReader(fileName);
        incomeList = gson.fromJson(reader,type);

        System.out.println("Income List: ");
        for(String name : incomeList.keySet()){
            System.out.println("Key: " + name);
        }
    }
    public void saveFile(Income income) throws IOException {//add income /add expense (skapa ny metod och döp till add)
        incomeList.put(income.getCatTest(), income);
        FileWriter fw = new FileWriter(new File(fileName));
        gson.toJson(incomeList, fw);
        fw.close();
        System.out.println("Income saved!");

        //läs info om put hur man anger key
        //testa ändra user.getUsername till setId för att ändra key (rad 30)
    }
}
