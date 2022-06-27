package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    String vehiclename="MOTO";

    public String getName(){
        return vehiclename;
    }

    public void setName(String vehiclename){
        this.vehiclename=vehiclename;
    }

    public String method1(){
        return "Hello! "+vehiclename;
    }
}
