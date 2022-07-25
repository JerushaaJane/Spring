package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component("personbean")
public class Person {

    public String pname;
    public final Vehicle v;

    @Autowired
    public Person(@Qualifier("vehiclebean") Vehicle myvehicle){
        this.v=myvehicle;
    }

    public String getPname() {return pname;}

    public void setPname(String pname) {this.pname = pname;}

    public Vehicle getV() {return v;}

    @PostConstruct
    public String pnameInitialize(){
        pname="Jerushaa Jane K H S";
        return pname;
    }
}
