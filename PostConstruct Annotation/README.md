@PostConstruct

->Should be used in the top of menthod of the class with @component annotation
-> We can create the bean but we cant configure the contents inside the bean using @Component
-> We can execute the method in the bean after creating the bean using @PostConstruct on the 
     top of the method we wanna configure and execute in the bean class
->After bean creation completion, the code inside the pojo java class method will be executed
->Using this we can initialize and configure the content inside the bean
-> Use the below dependency for

       <dependency>
            <groupId>javax.annotation</groupId>
            <artifactId>javax.annotation-api</artifactId>
            <version>1.3.2</version>
        </dependency>

@PreDestroy
->Should be used in the top of menthod of the class with @component annotation
->Used if we want to execute some logic just b4 when spring ioc container clears/deletes beans inside them
->Used in scenarios like closing files, closing i/o resources
->Mostly its work is done automatically by spring
->Rarely we may use them 
->In the main method we will use context.close(); to call the @predestroy method
