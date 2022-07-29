PROTOTYPE BEAN SCOPE:  
*********************  
-@Scope(BeanDefinition.SCOPE_PROTOTYPE)  
-Opposite to singleton bean scope  
-We need to explicitly declare a bean with prototype scope  
-we cannot have eager and lazy instantion here  
-Every time we request the reference of the bean,   
-an new instance is created for every request on the same bean  
-if we need our bean to be "mutable" based on business logic we can use this scope  
-No race condition occur  
