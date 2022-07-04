package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        //create a random no within 10
        /*
        int min=0,max=10;
        int a=Math.random()*(max-min+1)+min;
        sop(a);
         */
        Random random = new Random();
        int x=random.nextInt(10);
        System.out.println("Random number with 10: "+x);

        //creating supplier function
        Vehicle obj1=new Vehicle();
        obj1.setName("volks");
        Supplier<Vehicle> volkswagenSupplier = () -> obj1;

        Supplier<Vehicle> audiSupplier = () -> {
            Vehicle obj2=new Vehicle();
            obj2.setName("audi 8");
            return obj2;
        };

        if(x%2==0){
            context.registerBean("volkswagenbean",Vehicle.class,volkswagenSupplier);
        }
        else{
            context.registerBean("audibean",Vehicle.class,audiSupplier);
        }

        Vehicle v1=null;
        Vehicle v2=null;
        try{
             v1 = context.getBean("volkswagenbean",Vehicle.class);
        }
        catch (NoSuchBeanDefinitionException e){
            System.out.println("volkswagenbean is not created since x%2!=0");
        }

        try {
            v2 = context.getBean("audibean", Vehicle.class);
        }
        catch (NoSuchBeanDefinitionException e) {
            System.out.println("audibean is not created since x%2==0");
        }


        if(v1 != null){
            System.out.println("Vehicle name from volkswagen bean: "+v1.getName());
        }
        else{
            System.out.println("Vehicle name from audi bean: "+v2.getName());
        }













    }
}
