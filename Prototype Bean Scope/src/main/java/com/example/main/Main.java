package com.example.main;

import com.example.beans.Student;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        Student s=context.getBean(Student.class);
        Student s2=context.getBean("studentbean",Student.class);
        if(s.hashCode()!=s2.hashCode()){
            System.out.println("Student bean is of Prototype bean scope");
        }
        else{
            System.out.println("Student bean is not of Prototype bean scope");
        }



    }
}
