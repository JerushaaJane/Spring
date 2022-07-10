package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Person {
    @Autowired
    public Vehicle vehicle;
    public String pname;

    public Vehicle getVehicle(){return vehicle;}

    public String getPname(){return  pname;}

    public void setVehicle(Vehicle vehicle) {this.vehicle=vehicle;}

    public void setPname(String pname){this.pname=pname;}

    public Person(){
        System.out.println("Person bean created");
    }

    @PostConstruct
    public String pnameInitialize(){
        pname="Jerushaa Jane";
        return pname;
    }

}
