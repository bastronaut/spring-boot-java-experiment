package com.bastronaut.springbootjavaexperiment.pojos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Customer {

    final Person person;

    @Autowired
    public Customer(Person person) {
        this.person = person;
    }

    public String getName() {
        return person.getName();
    }
}
