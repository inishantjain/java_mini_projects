package org.example;

public class Alien {

    private int age;
    private Laptop laptop;

    public Alien(){
        System.out.println("Alien Object Created");
    }
    public Alien(int age, Laptop laptop){
        this.age = age;
        this.laptop = laptop;
        System.out.println("Alien object created using parameterized constructor");
    }

    public String code(){
        return "Alien Coding";
    }
    public int getAge() {
        return age;
    }
    public Laptop getLaptop() {
        return laptop;
    }
    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
    public void setAge(int age) {
        System.out.println("setAge called");
        this.age = age;
    }
}
