package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
// @Scope("prototype") //for component scan method define scope here
public class Car {

    @Value("16")
    private int mileage;
    @Autowired // automatically get the fuel object and assign to this variable (field
               // injection)
    @Qualifier("laptop") // qualifier autowires to a particular bean (name can be assigned as
                         // @Component("name")) or use primary
    private Fuel fuel;

    public Car() {
        System.out.println("Car Object Created");
    }

    public Car(int age, Fuel fuel) {
        this.mileage = age;
        this.fuel = fuel;
        System.out.println("Car object created using parameterized constructor");
    }

    public String run() {
        return "Car running";
    }

    public int getMileage() {
        return mileage;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public void setMileage(int mileage) {
        System.out.println("setMileage called");
        this.mileage = mileage;
    }
}
