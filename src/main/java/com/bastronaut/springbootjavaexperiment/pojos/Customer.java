package com.bastronaut.springbootjavaexperiment.pojos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Customer {

    @Autowired
    private Person person;

    public String getCustomerName() {
        return person.getName();
    }
}
