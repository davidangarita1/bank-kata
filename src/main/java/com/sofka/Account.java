package com.sofka;

import java.io.PrintStream;
import java.util.ArrayList;

public class Account {
    private Statement statement;
    Transaction transaction = new Transaction();

    public Account(Statement statement) {
        this.statement = statement;
    }

    void deposit(double amount, String date) {
        transaction.credit(amount, date);
    }

    void withdrawal(double amount, String date){
        transaction.debit(amount, date);
    }

    void printStatement(PrintStream printer) {
        statement.printTitle(printer);
        statement.printLines(printer);
    }

    public String date(String dateString){
        return dateString;
    }
}
