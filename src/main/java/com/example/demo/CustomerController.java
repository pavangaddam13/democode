package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
    @PostMapping(value = "/calculatePoints")
    public OutputDTO calculatePoints(@RequestBody InputDTO input) {
        List<CustomerDTO> customerList = input.getCustomerList();
        calculate(customerList);
        OutputDTO outputDTO = new OutputDTO();
        outputDTO.setCustomerList(customerList);
        return outputDTO;
    }

    private void calculate(List<CustomerDTO> customerList) {
        for(CustomerDTO customerDTO : customerList) {
            Integer calculatedPoints = 0;
            for(Integer transactionAmt : customerDTO.getTransactions()) {
                if(transactionAmt > 50) {
                    if(transactionAmt <= 100) {
                        transactionAmt = transactionAmt - 50;
                        calculatedPoints += transactionAmt;
                    }
                    else {
                        calculatedPoints += 50;
                        calculatedPoints += (transactionAmt - 100) * 2;
                    }
                }
            }
            customerDTO.setCalculatedPoints(calculatedPoints);
        }
    }
}
