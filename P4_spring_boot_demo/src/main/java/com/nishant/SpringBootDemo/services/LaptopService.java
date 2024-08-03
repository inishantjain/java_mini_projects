package com.nishant.SpringBootDemo.services;

import com.nishant.SpringBootDemo.LaptopRepository;
import com.nishant.SpringBootDemo.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //services is similar to component in fact it inherits component
public class LaptopService {

    @Autowired
    private LaptopRepository lapRepo;

    public void addLaptop(Laptop lap){
        lapRepo.save(lap);
    }

    public boolean isGaming(Laptop lap){
        return true;
    }
}
