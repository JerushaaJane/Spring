package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

public class ProjectConfig {

    @Bean(name="vehicle 1")
    Vehicle m1(){
        Vehicle v=new Vehicle();
        v.setName("Tata");
        return v;

    }

    @Bean(value="vehicle 2")
    Vehicle m2(){
        Vehicle v=new Vehicle();
        v.setName("Honda");
        return v;

    }

    @Primary
    @Bean("vehicle 3")
    Vehicle m3(){
        Vehicle v=new Vehicle();
        v.setName("Maruti");
        return v;

    }

}
