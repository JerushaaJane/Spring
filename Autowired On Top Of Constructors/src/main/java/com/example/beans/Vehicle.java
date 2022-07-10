package com.example.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
@Component
public class Vehicle {
    public Vehicle(){System.out.println("Vehicle bean created");}
    public String vname;

    public String getVname(){return vname;}

    public void setVname(String vname){this.vname=vname;}

    @PostConstruct
    public void vnameInitialize(){
        vname="Lamborghini";
    }
    @Override
    public String toString(){
        return vname;
    }
}
