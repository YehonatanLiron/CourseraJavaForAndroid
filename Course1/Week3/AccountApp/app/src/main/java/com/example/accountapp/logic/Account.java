package com.example.accountapp.logic;

import com.example.accountapp.ui.OutputInterface;

/**
 * This file defines the Account class.  It provides the basis for a
 * series of improvements you'll need to make as you progress through
 * the lessons in Module 6.
 */
public class Account {
    /**
     * This is the variable that stores our OutputInterface instance.
     * <p/>
     * This is how we will interact with the User Interface
     * [MainActivity.java].
     * </p>
     * This was renamed to 'mOut' from 'out', as it is in the video
     * lessons, to better match Android/Java naming guidelines.
     */
    final OutputInterface mOut;

    /**
     * Name of the account holder.
     */
    private String name;

    /**
     * Number of the account.
     */
    private int number;

    /**
     * Current balance in the account.
     */
    private double balance;

    /* Getter Methods */
    public  String getName()
    {
        return name;
    }

    public int getNumber()
    {
        return number;
    }

    public double getBalance()
    {
        return balance;
    }

    /* Setter Methods */

    public void setNumber(int number)
    {
        this.number = number;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Constructor initializes the field
     */
    public Account(OutputInterface out)
    {
        mOut = out;
    }

    public Account(OutputInterface out, String name, int number)
    {
        this(out);
        this.name = name;
        this.number = number;
    }

    public Account(OutputInterface out, String name, int number, double balance)
    {
        this(out, name, number);
        this.balance = balance;
    }

    /**
     * Deposit @a amount into the account.
     */
    public void deposit(double amount) {
        balance += amount;
    }

    /**
     * Withdraw @a amount from the account.  Prints "Insufficient
     * Funds" if there's not enough money in the account.
     */
    public boolean withdrawal(double amount)
    {
        boolean retVal;
        if (balance > amount) {
            balance -= amount;
            retVal = true;
        }
        else
            retVal = false;
        return retVal;
    }

    /**
     * Display the current @a amount in the account.
     */
    public void displayBalance() {
        mOut.println("The balance on account " 
                     + number
                     + " is " 
                     + balance);
    }

    @Override
    public boolean equals(Object other)
    {
        if (other instanceof Account)
        {
            Account other_account = (Account) other;
            return this.number == other_account.number;
        }
        else
        {
            return false;
        }
    }
}
