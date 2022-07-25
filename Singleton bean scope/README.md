SINGLETON BEAN SCOPE:  
*********************  
Default scope followed by spring IOC container  

Spring IoC container creates only one instance of the object defined by that bean definition  

Only one instance will be created for a single bean (pojo class) and that same object will be shared for each request made for that bean.  
(if 2 variables refer to same bean context)  

Irrespective of how many time we refer to the bean with the same datatype & with different variable name;  
IOC container creates only one object for that bean;  

@Scope(BeanDefinition.SCOPE_SINGLETON)  



      Vehicle v=context.getBean(Vehicle.class);  

        Vehicle v1=context.getBean(Vehicle.class);  

        System.out.println("Hashcode of v: "+v.hashCode());  
        System.out.println("Hashcode of v1: "+v1.hashCode());  

        if(v.hashCode()==v1.hashCode()){  
            System.out.println("Vehicle bean is a singleton scope bean");  
        }  
        else{  
            System.out.println("Vehicle bean is not a  singleton scope bean");  
        }  
