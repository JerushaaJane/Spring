package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Vehicle m1(){
        Vehicle obj=new Vehicle();
        obj.setName("Audi 8");
        return obj;
    }

    @Bean
    String m2(){
        return "Jeurshaa Jane";
    }

    @Bean("vehicle2")
    Vehicle m3(){
        Vehicle obj=new Vehicle();
        obj.setName("Truck");
        return obj;
    }

    @Bean(name="vehicle3")
    Vehicle m4(){
        Vehicle obj=new Vehicle();
        obj.setName("Bus");
        return obj;
    }

}
