package com.example.bank.models;

public class Individual extends Checking {

    static final  Double WITHDRAWAL_LIMIT = 100.00d;

    public Individual(String type, String owner, Double balance) {
        super(type, owner, balance);
    }

    @Override
    public void withdrawal(Double amount) {

        if (amount > WITHDRAWAL_LIMIT) {
            System.out.println("Amount exceeds limit of " + WITHDRAWAL_LIMIT.toString());
            this.balance -= 100.00;
        }
        else {
            this.balance -= amount;
        }
    }
}
