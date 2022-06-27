package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
    public static void main(String[] args) {


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        String owner=context.getBean(String.class);
        System.out.println("Owner name from a spring context: "+owner);

        //To overcome NoUniqueBeanException
        Vehicle v2=context.getBean("vehicle2",Vehicle.class);   //vehicle2 is the bean name
        System.out.println("Vehicle 2 of owner: "+v2.getName());

        Vehicle v3=context.getBean("vehicle3",Vehicle.class);    //vehicle3 is the bean name
        System.out.println("Vehicle 3 of owner: "+v3.getName());

        Vehicle v=context.getBean("m1",Vehicle.class);   //m1 is the bean name
        System.out.println("Vehicle 1 of owner: "+v.getName());




    }
}
