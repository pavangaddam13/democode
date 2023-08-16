package com.example.demo;

import java.util.List;
/* */
public class CustomerDTO {
    private String customerName;
    private List<Integer> transactions;
    private Integer calculatedPoints;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<Integer> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Integer> transactions) {
        this.transactions = transactions;
    }

    public Integer getCalculatedPoints() {
        return calculatedPoints;
    }

    public void setCalculatedPoints(Integer calculatedPoints) {
        this.calculatedPoints = calculatedPoints;
    }
}
