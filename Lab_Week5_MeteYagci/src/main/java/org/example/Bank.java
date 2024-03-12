package org.example;
import java.util.ArrayList;
import java.util.List;


/**
 * @author  Mete Yagci 18070006041
 */
public class Bank {
    private List<Account> accounts;

    /**
     *  Creates a ArrayList
     */
    public Bank() {
        this.accounts = new ArrayList<>();
    }

    /**
     * @param customer       . Creates customer
     * @param initialDeposit . Creates customer's intial deposit
     * @return . added  new account
     */
    public Account createAccount(String customer, double initialDeposit) {
        Account account = new Account(customer, initialDeposit);
        accounts.add(account);
        return account;
    }



    /**
     *
     * @param customer
     * @return . retrieves account associated with the specified customer, or null if no such account exists
     */
    public Account retrieveAccount(Customer customer) {
        for (Account account : accounts) {
            if (account.getCustomer().equals(customer.getName())) {
                return account;
            }
        }
        return null;
    }
}
