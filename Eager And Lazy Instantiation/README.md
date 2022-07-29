Eager Instatntiation:    
@Eager  
all singleton bean early during the start up of the applications.  
Default instantiation  
sever willnot start if there exists any dependency exception in the application  

Lazy instantiation:  
@Lazy  
we can change the behiour to lazy,so that aplication creates singleton bean only when the application is trying to refer them.  
we can control the way, the bean is created.  
Not default instantiation  
application throws exception incase of any dependency exceptions  
