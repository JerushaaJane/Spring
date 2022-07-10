package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person p=context.getBean(Person.class);

        Vehicle v=context.getBean(Vehicle.class);

        System.out.println("Vehicle name from vehicle bean: "+v.getVname());
        System.out.println("Person name from person bean: "+p.getPname());
        System.out.println("Vehicle owned by person: "+p.getVehicle());



    }
}
