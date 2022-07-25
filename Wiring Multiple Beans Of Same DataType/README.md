AUTOWIRING IN MULTIPLE BEANS OF SAME RETURN DATATYPE:  
*****************************************************  
Spring follows certain steps one by one till it finds the correct bean to autowire first  

STEP 1: Spring will try to autowire the bean with the same exact parameter name we have defined with the bean in the IOC container.  

STEP 2: If the paramter name that we defined for a bean doesnot match with any bean in spring context;  
        Spring will autowire the bean with the bean that is declared as primary.  

STEP 3:If the paramter names doesnot match also the primary bean doesnot exist;  
       Spring will look for the name inside the @Qualifier annotation and wire them  
       This is recommended bcoz of readability to new user  
