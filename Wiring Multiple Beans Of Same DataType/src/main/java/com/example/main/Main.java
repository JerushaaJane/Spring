package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);

        //Vehicle v = context.getBean(Vehicle.class);
        Person p=context.getBean(Person.class);

        System.out.println("Person name from person bean: "+p.getPname());
        //System.out.println("Vehicle name from vehicle bean: "+v.getVeh());
        System.out.println("Vehicle owned by the person: "+p.getVname());

    }
}
