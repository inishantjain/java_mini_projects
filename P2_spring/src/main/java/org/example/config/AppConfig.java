package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example") // scan the components (having component annotation) so that we don't need to
                              // write a bean definition explicitly in the AppConfig file
public class AppConfig {

    // @Bean(name = "laptop")
    // @Scope("prototype")
    // @Bean
    // public Fuel fuel(){
    // return new Fuel();
    // }
    //
    // @Bean
    // public Car car(){
    // return new Car();
    // }
    // @Bean
    // public Car car2(@Qualifier("fuel") Fuel fuel){//by default spring take one
    // and only fuel to inject there but if there are multiple beans of laptop then
    // we need to mention it using @Qualifier (or we can use @primary on the bean we
    // want)
    // Car obj = new Car();
    // obj.setMileage(15);
    // obj.setFuel(fuel);
    // return obj;
    // }
}
