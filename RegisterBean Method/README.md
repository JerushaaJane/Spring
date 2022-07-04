We can create bean programatically based on certain conditions using registerBear() method
      -> It has 3 parameters (name of the bean, datatype of the bean, supplier function available inside java)
      ->supplier function will not get any inputs, it only return some content

Supplier Interface / Supplier Function :
==============================
-> It dont take any input/argument, but produces/returns only the output
Example:
=======
    1)  // This function returns a random value.
        Supplier<Double> randomValue = () -> Math.random();
  
        // Print the random value using get()
        System.out.println(randomValue.get());

   2) Vehicle obj1=new Vehicle();
        obj1.setName("Volkswagen");
        Supplier<Vehicle> volkswagensupplier = () -> obj1;

   3)   public class SupplierDemo {
    
        static String product = "Android";
 
         public static void main(String[] args) {
        
        Supplier<Boolean> boolSupplier = () -> product.length() == 10;
        Supplier<Integer> intSupplier = () -> product.length() - 2;
        Supplier<String> supplier = () -> product.toUpperCase();
        
        
        System.out.println(boolSupplier.get());//false
        System.out.println(intSupplier.get());//5
        System.out.println(supplier.get());//ANDROID
        
      }
    }

