package com.example.beans;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component(value = "studentbean")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class Student {
    public String sname;

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
    @PostConstruct
    public String snameInitialize(){
        sname="D Souza";
        return sname;
    }

}
