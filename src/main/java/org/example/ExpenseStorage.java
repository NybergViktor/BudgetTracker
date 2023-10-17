package org.example;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ExpenseStorage {
    public ExpenseStorage() throws IOException {
        Gson gson = new Gson();
        String fileName = "src/main/expense.json";
        FileWriter fw = new FileWriter(fileName);

        //skapar arraylist med inkomster från user
        ArrayList<Income> expenseList = new ArrayList<>();
        //expenseList.add()

    }
}
