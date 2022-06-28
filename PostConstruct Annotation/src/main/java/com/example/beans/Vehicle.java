package com.example.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Vehicle {

    String vehiclename;

    public String getName(){
        return vehiclename;
    }

    public void setName(String vehiclename){
        this.vehiclename=vehiclename;
    }

    /*@PostConstruct
    public void vehicleNameInitialize(){
        this.vehiclename="TESLA";

    }*/
    @PreDestroy
    public void destroyMethod(){
        System.out.println("The vehicle bean is  destroyed");
    }
    @PostConstruct
    public String vehicleNameInitialize(){
        vehiclename="TESLA";
        return vehiclename;
    }




}
