package com.sofka;

import java.io.PrintStream;
import java.util.ArrayList;

public class Statement {
    static ArrayList<String> statementList = new ArrayList<>();

    public void printTitle(PrintStream printer){
        String title = "|   Date   |Credit |Debit |Balance";
        printer.println(title);
    }

    public static void printLines(PrintStream printer){
        for(int i = statementList.size()-1; i >= 0; i--){
            printer.println(statementList.get(i));
        }
    }

    public ArrayList<String> returnStatementList(){
        return statementList;
    }

    public void addStatementLine(String line){
        statementList.add(line);
    }
}
