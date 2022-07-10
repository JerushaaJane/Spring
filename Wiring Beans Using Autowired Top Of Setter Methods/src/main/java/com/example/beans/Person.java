package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Person {

    public Person(){System.out.println("Person bean created");}
    public String pname;
    public Vehicle veh;

    public String getPname(){return  pname;}
    public void setPname(String pname){this.pname=pname;}

    public Vehicle getVeh(){return veh;}
    @Autowired
    public void setVeh(Vehicle veh){this.veh=veh;}

    @PostConstruct
    public void vnameInitialize(){
        pname="Jerushaa Jane";
    }

}
