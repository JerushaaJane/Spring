package com.example.beans;

import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

      AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig.class);
      Vehicle v=context.getBean(Vehicle.class);
      Person p=context.getBean(Person.class);
      System.out.println("Vehicle name from vehicle bean: "+v.getVname());
      System.out.println("Person name from person bean: "+p.getPname());
      System.out.println("Vehicle owned by person from: "+p.getVeh());



    }
}
