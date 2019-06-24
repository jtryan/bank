package com.example.bank.models;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AccountTest {

    Individual checking;
    MoneyMarket mm;
    Savings savings;

    List<Account> newAccounts;

    Bank myBank;

    @Before
    public void setUp() {
        checking = new Individual("Individual Checking","Sam", 2000D);
        mm = new MoneyMarket("MoneyMarket","Sam", 50000D);
        savings = new Savings("Savings","Sam", 400D);

        newAccounts = new LinkedList<>();
        newAccounts.add(checking);
        newAccounts.add(mm);
        newAccounts.add(savings);

        myBank = new Bank("Sam", newAccounts);

        assertEquals(2000.0D, checking.getBalance(), 0);
        assertEquals(400.0, savings.getBalance(), 0);
        assertEquals(50000.0, mm.getBalance(), 0);

    }

    @Test
    public void deposit() {
        System.out.println("DEPOSIT----");
        checking.deposit(300.0D);
        assertEquals(2300.0, checking.getBalance(), 0);
    }

    @Test
    public void withdrawal() {
        System.out.println("WITHDRAWAL----");

        checking.withdrawal(200D);
        assertEquals(1900.0, checking.getBalance(), 0 );

        checking.withdrawal(50D);
        assertEquals(1850.0, checking.getBalance(), 0);

        mm.withdrawal(500D);
        assertEquals(49500.0, mm.getBalance(), 0);
    }

    @Test
    public void tranfer() {
        System.out.println("TRANSFER----");
        checking.tranfer(500D, mm);
        assertEquals(2500.0, checking.getBalance(), 0);
        assertEquals(49500, mm.getBalance(), 0);
    }

    @Test
    public void tranfer2() {
        System.out.println("TRANSFER----");
        savings.tranfer(400D, checking);
        assertEquals(1600.0, checking.getBalance(), 0);
        assertEquals(800.0, savings.getBalance(), 0);
    }
}