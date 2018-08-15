package com.bastronaut.springbootjavaexperiment.controllers;

import com.bastronaut.springbootjavaexperiment.pojos.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class TestController {

    @Autowired
    public Customer customer;

    @GetMapping("/yo")
    public String getYo() {
        System.out.println(" yoyo yo");
        System.out.println(customer.getCustomerName());

        return customer.getCustomerName();
    }
}
