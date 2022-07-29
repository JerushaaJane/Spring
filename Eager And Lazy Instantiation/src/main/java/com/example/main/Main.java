package com.example.main;


import com.example.beans.Person;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);

        System.out.println("Spring started");
        Person p=context.getBean(Person.class);
        System.out.println("spring ended");




    }
}
