package org.example;

import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App{

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        Laptop lap = context.getBean(Laptop.class);
        Car car = context.getBean("car",Car.class); //default bean name is method name
        System.out.println(car.getFuel().burn());

    }

    /* public static void main( String[] args )    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");//this xml file tell spring which for which class it has to create object
        //all the beans are created as soon as this context(container) is created (to prevent this default behaviour use lazy-init for a bean which only create object when it is used)
        //can have two beans for same class but with different ids
        //a single id has a singleton scope by default but if we want a different object everytime we create an object set scope to prototype

        Alien obj = (Alien) context.getBean("alienAutoWire");//or context.getBean("alienAutoWire", Alien.class);
        System.out.println(obj.getAge());
        System.out.println(obj.getLaptop().code());
    }*/

}
