@Autowired on the top of constructors  

@Autowired  
    public Person(Vehicle veh){  
        System.out.println("Person bean created");  
        this.veh=veh;  
    }
    
This is the most recommended method,  
Here we can declare attributes final in our bean(if ur project has security requirements use this approach)
