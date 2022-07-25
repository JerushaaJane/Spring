package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.example.beans")
public class ProjectConfig {

    @Bean
    Vehicle vehicle1(){
        Vehicle veh1=new Vehicle();
        veh1.setVeh("Audi 8");
        return veh1;
    }
    @Bean
    Vehicle vehicle2(){
        Vehicle veh2=new Vehicle();
        veh2.setVeh("Lamborghini");
        return veh2;
    }
    @Bean

    Vehicle vehicle3(){
        Vehicle veh3=new Vehicle();
        veh3.setVeh("Tata Nexus");
        return veh3;
    }
    @Bean
    Vehicle vehicle4(){
        Vehicle veh4=new Vehicle();
        veh4.setVeh("Duster");
        return veh4;
    }
}
