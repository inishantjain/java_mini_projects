package com.nishant.SpringBootDemo;

import com.nishant.SpringBootDemo.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository //same as component 
public class LaptopRepository {
    public void save(Laptop lap){
        System.out.println("Saved in Database");
    }
}
