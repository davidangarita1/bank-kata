package com.sofka;

import java.io.PrintStream;
import java.util.ArrayList;

public class Statement {
    static ArrayList<String> statementList = new ArrayList<>();

    public void printTitle(PrintStream printer){
        String title = "|   Date   | Credit |  Debit  |  Balance  |";
        printer.println(title);
    }

    public static void printLines(PrintStream printer){
        for(String line : statementList){
            printer.println(line);
        }
    }

    public ArrayList<String> returnStatementList(){
        return this.statementList;
    }

    public void addStatementLine(String line){
        statementList.add(line);
    }
}
