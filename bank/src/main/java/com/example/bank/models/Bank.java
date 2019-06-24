package com.example.bank.models;

import java.util.LinkedList;
import java.util.List;

public class Bank {
    private String name;
    private List<Account> accounts = new LinkedList<>();

    public Bank() {
    }

    public Bank(String name) {
        this.name = name;
    }

    public Bank(String name, List<Account> accounts) {
        this.name = name;
        this.accounts = accounts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }


    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", accounts=" + accounts +
                '}';
    }
}
