public class Main { 
    public static void main(String[] args) { 
        static void displayMessage() { 
            System.out.println("Message"); 
        } 
    } 
} 

//Above code throw an error: illegal start of expression
        static void displayMessage() {
        ^
Main.java:8: error: class, interface, or enum expected
}
^
//Method Declarations Cannot Be Inside Other Methods
In Java, methods cannot be nested inside other methods.
Here, displayMessage() is declared inside main(), which is not allowed.


//Corrected code:

public class Main {
 public static void main(String[] args) { 
        displayMessage();
    } 

    static void displayMessage() { 
        System.out.println("Message"); 
    } 

  }
