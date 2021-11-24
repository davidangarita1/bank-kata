package com.sofka;

public class StartApp {
    public static void main(String[] args) {
        Account account = new Account(new Statement());
        Transaction transaction = new Transaction();
        Filter filter = new Filter();

        account.deposit(transaction.amountOf(1000), account.date("10/01/2021"));

        account.deposit(transaction.amountOf(2000), account.date("13/01/2021"));
        account.withdrawal(transaction.amountOf(500), account.date("14/01/2021"));

        account.sendMoney(transaction.amountOf(500), account.date("15/01/2021"));

        account.printStatement(System.out, "todo");
        filter.printOnlyCredit(System.out);
        filter.printOnlyDebit(System.out);
        filter.printByDate(System.out, "15/01/2021");
    }
}
