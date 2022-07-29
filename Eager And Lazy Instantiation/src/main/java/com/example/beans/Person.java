package com.example.beans;


import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
@Lazy
public class Person {
    public String pname;

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }
    public Person(){
        System.out.println("Person bean started");
    }
    @PostConstruct
    public String pnameInitialize(){
        pname="Lucy";
        return pname;
    }
}
