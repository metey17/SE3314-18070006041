package org.example;

public class Account {
    private String customer;
    private double balance;

    /**
     *
     * @param customer       customer for whom account is being created
     * @param initialDeposit  initial deposit amount for the account
     */
    public Account(String customer, double initialDeposit) {
        this.customer = customer;
        this.balance = initialDeposit;

    }

    /**
     * @return customer . Returns to customer
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * Gives Balance of customers
     * @return balance
     */
    public double getBalance() {
        return balance;
    }
}
