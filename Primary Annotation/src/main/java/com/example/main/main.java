package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh1=context.getBean("vehicle 1",Vehicle.class);
        System.out.println("first vehicle: "+veh1.getName());

        Vehicle veh2=context.getBean("vehicle 2",Vehicle.class);
        System.out.println("second vehicle: "+veh2.getName());

        Vehicle veh3=context.getBean(Vehicle.class);
        System.out.println("third vehicle: "+veh3.getName());

    }
}
