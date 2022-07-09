package com.example.config;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Vehicle method1(){
        Vehicle vobj=new Vehicle();
        vobj.setVname("Toyota");
        return vobj;
    }
    @Bean
    Person method2(){
        Person pobj=new Person();
        pobj.setPname("Jeru");
        pobj.setVeh(method1());
        return pobj;
    }

}
