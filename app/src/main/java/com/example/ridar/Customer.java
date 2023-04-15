package com.example.ridar;

public class Customer {
    private String customerName;
    private String customerAddress;

    public Customer (String customerName) {
        this.customerName = customerName;
        this.customerAddress = "111 Default St., Addresseeville, CITY 00000";
    }

    public Customer (String customerName, String customerAddress) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
    }

    public String getCustomerName () {
        return this.customerName;
    }

    public String getCustomerAddress () {
        return this.customerAddress;
    }

    public void setCustomerName (String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerAddress (String customerAddress) {
        this.customerAddress = customerAddress;
    }
}
