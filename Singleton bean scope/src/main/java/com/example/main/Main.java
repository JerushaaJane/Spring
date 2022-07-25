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

        Vehicle v1=context.getBean(Vehicle.class);

        System.out.println("Hashcode of v: "+v.hashCode());
        System.out.println("Hashcode of v1: "+v1.hashCode());

        if(v.hashCode()==v1.hashCode()){
            System.out.println("Vehicle bean is a singleton scope bean");
        }
        else{
            System.out.println("Vehicle bean is not a  singleton scope bean");
        }


    }
}
