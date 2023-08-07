package com.example.demo;

import java.util.List;

public class OutputDTO {
    private List<CustomerDTO> customerList;

    public List<CustomerDTO> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<CustomerDTO> customerList) {
        this.customerList = customerList;
    }
}
