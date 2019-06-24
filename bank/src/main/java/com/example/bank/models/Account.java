package com.example.bank.models;

public class Account {
    protected String type;
    protected String owner;
    protected Double balance;

    public Account() {
    }

    public Account(String type, String owner, Double balance) {
        this.type = type;
        this.owner = owner;
        this.balance = balance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "type='" + type + '\'' +
                ", owner='" + owner + '\'' +
                ", balance=" + balance +
                '}';
    }

    public void deposit(Double amount) {
        this.balance += amount;
    }

    public void withdrawal(Double amount) {
        this.balance -= amount;
    }

    public void tranfer(Double amount, Account account) {
        this.balance += amount;
        account.balance -= amount;
    }
}
