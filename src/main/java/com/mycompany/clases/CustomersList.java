package com.mycompany.clases;

import java.util.*;

public class CustomersList {
    private ArrayList<Customer> customers;

    public CustomersList() {
        customers = new ArrayList<>();
    }

    public void newCustomer(String name, String lastName, String email, String phoneNumber) {
        Customer newCustomer = new Customer(name, lastName, email, phoneNumber);
        customers.add(newCustomer);
    }

    public Customer searchCustomer(String phoneNumber) {
        for(Customer customer : customers) {
            if (customer.getPhoneNumber().equals(phoneNumber)) {
                return customer;
            }
        }
        return null;
    }

    public void deleteCustomer(String phoneNumber) {
        Customer customer = searchCustomer(phoneNumber);
        if (customer != null) {
            customers.remove(customer);
        }
    }

    public void updateCustomer(String phoneNumber, String newName, String newLastName, String newEmail, String newPhoneNumber) {
        Customer customer = searchCustomer(phoneNumber);
        if (customer != null) {
            customer.setName(newName);
            customer.setLastName(newLastName);
            customer.setEmail(newEmail);
            customer.setPhoneNumber(newPhoneNumber);
        }   
    }

}
