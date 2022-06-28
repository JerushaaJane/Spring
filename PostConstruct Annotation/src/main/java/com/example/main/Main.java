package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle vname=context.getBean(Vehicle.class);

       // System.out.println("Vehicle name from post construct bean: "+vname.getName());
        System.out.println("Vehicle name from postconstruct: "+vname.vehicleNameInitialize());
        context.close();  //This is used to initiate @predestroy

    }




}
