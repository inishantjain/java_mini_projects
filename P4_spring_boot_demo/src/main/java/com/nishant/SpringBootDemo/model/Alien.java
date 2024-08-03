package com.nishant.SpringBootDemo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component //using this annotation spring is able to create it a bean
public class Alien {
    private Computer computer;
    @Value("21")
    private int age;

    public Computer getComputer() {
        return computer;
    }

    @Autowired
    @Qualifier("laptop")
    public void setComputer(Computer computer) {
        this.computer = computer;
    }



    public void code(){
        computer.compile();
    }
}
