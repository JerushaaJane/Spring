Primary Annotation:
===================

If there are multiple beans with same type and object,we will opt by mentioning the bean name in the getBeans() method in main.java
like:
String name = context.getBeans("vehicle1",String.class);

if we dont mention the bean name, then no unique bean exception occur
@Primary makes the program to execute the default bean if we donot mention the bean name
like:
String name = context.getBeans(String.class);

"IF NO BEAN NAME IS MENTIONED DEAULT BEAN WILL BE EXECUTED"

