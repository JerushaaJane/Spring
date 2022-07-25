package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle v=context.getBean(Vehicle.class);
        Person p=context.getBean(Person.class);
        v.getVservice().playMusic();
        v.getVservice().moveVehicle();


    }
}
