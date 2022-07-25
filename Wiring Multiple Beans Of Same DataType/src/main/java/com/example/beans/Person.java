package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Person {

    @Autowired
    public Person(@Qualifier("vehicle4") Vehicle myveh) {
        System.out.println("Person bean created");
        this.vname = myveh;
    }
    public String pname;
    /*@Autowired
    @Qualifier("vehicle3")*/
    public  final Vehicle vname;
    public String getPname(){return pname;}

    public void setPname(String pname){this.pname=pname;}

    public Vehicle getVname(){return vname;}

    //public void setVname(Vehicle vname){this.vname=vname;}

    @PostConstruct
    public void pnameInitialize(){
        pname="Jerushaa";
    }
}
