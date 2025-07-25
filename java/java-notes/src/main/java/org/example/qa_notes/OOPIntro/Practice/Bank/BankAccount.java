package org.example.qa_notes.OOPIntro.Practice.Bank;

public class BankAccount {
    // fields
    private String owner;
    private int balance;

    // constructor
    public BankAccount(String owner) {
        this.owner = owner;
        this.balance = 0;
    }

    public BankAccount(String owner, int balance) throws Exception {
        this.owner = owner;
        if (balance < 0) {
            throw new IllegalArgumentException("Can't have negative balance");
        }
        this.balance = balance;
    }

    // methods

    public void deposit(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Can't have negative deposit");
        }
        balance += amount;
    }
    public void withdraw(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("can't have negative withdrawal");
        } else if (amount > balance) {
            throw new IllegalArgumentException("u not have enough money");
        }
        balance -= amount;
    }
    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }







    // methods
}
