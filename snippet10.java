public class Main { 
    public void display() { 
        System.out.println("No parameters"); 
    } 
    public void display(int num) { 
        System.out.println("With parameter: " + num); 
    } 
    public static void main(String[] args) { 
        display(); 
        display(5); 
    } 
} 
 compilation error will occure 
 // error: non-static method display() cannot be referenced from a static context
        display();
        ^
Main.java:10: error: non-static method display(int) cannot be referenced from a static context
        display(5);

 //Yes, method overloading is allowed in Java.

Method overloading means defining multiple methods with the same name but different parameters in the same class. 


// Corrected Code

public class Main { 
    public static void display() { 
        System.out.println("No parameters"); 
    } 
    public static void display(int num) { 
        System.out.println("With parameter: " + num); 
    } 
    public static void main(String[] args) { 
        display();  // Now works because display() is static
        display(5); // Calls overloaded static method
    } 
}
       