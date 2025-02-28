public class Main { 
    public static void main(String[] args) { 
        double num = "Hello"; 
        System.out.println(num); 
    } 
} 
  //comiplation error occure with
            error: incompatible types: String cannot be converted to double 
        double num = "Hello";
                     double is a Numeric Data Type

In Java, double can only store numeric values (e.g., 3.14, 5.5, -3.2).
"Hello" is a string, not a number.
Java is a Statically Typed Language
Java does not allow assigning a String to a double variable.

//Java enforce data type constraints to Prevents Type Errors at Runtime

//Corrected Code
public class Main { 
    public static void main(String[] args) { 
        double num = 3.14; 
        System.out.println(num); 
    } 
} 


