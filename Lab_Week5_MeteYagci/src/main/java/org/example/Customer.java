package org.example;

public class Customer {


    private String name;

    /**
     * Constructer  a new Customer object with the given  customer name
     * @param name
     */
    public Customer(String name) {
        this.name = name;
    }

    /**
     * Returns the name of the customer
     * @return
     */
    public String getName() {
        return name;
    }

}
