package com.sofka;

public class Transaction {
    private double balance = 0;
    LineStatement lineStatement = new LineStatement();

    public double amountOf(double amount) {
        return amount;
    }

    public double credit(double amount, String date) {
        this.balance = this.balance + amount;
        lineStatement.saveCreditLine(date, amount, this.balance);
        return this.balance;
    }

    public double debit(double amount, String date) {
        this.balance = this.balance - amount;
        lineStatement.saveDebitLine(date, amount, this.balance);
        return this.balance;
    }
}
