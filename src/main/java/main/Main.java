package main;

import practice.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BankAcct acct1 = new BankAcct();

        acct1.open();
        acct1.printBalance();

        acct1.deposit();
        acct1.printBalance();

        acct1.deposit();

        InputOps.close();

    }
}