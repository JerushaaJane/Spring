package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
    public static void main(String[] args) {

        Vehicle v=new Vehicle();
        v.setName("Tata Nexus");
        System.out.println("Vehicle name from a non spring context: "+v.getName());

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle vname=context.getBean(Vehicle.class);
        System.out.println("Vehicle name from a spring context: "+vname.getName());

        String owner=context.getBean(String.class);
        System.out.println("Owner name from a spring context: "+owner);

        //To overcome NoUniqueBeanException
       // Vehicle v2=context.getBean("vehicle2",Vehicle.class);
       // System.out.println("Vehicle 2 of owner: "+v2.getName());

    }
}
