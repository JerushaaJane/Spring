WAYS TO WIRE BEANS:
***********************
1) Using method call
Ex:
@Bean
    Vehicle method1(){
        Vehicle vobj=new Vehicle();
        vobj.setVname("Toyota");
        return vobj;
    }
    @Bean
    Person method2(){
        Person pobj=new Person();
        pobj.setPname("Jeru");
        pobj.setVeh(method1());
        return pobj;
    }
