public class Main { 
    public static void main(String[] args) { 
        String str = null; 
        System.out.println(str.length()); 
    } 
} 
// What exception is thrown? Why does it occur? 

//Exception in thread "main" java.lang.NullPointerException
        at Main.main(Main.java:4)

//This exception occur because of variable str is Assigned null and Calling str.length() on a null Reference
//We can fix this issue by initializing str with some value

//Corrected code:

public class Main { 
    public static void main(String[] args) { 
        String str = "Welcome"; 
        System.out.println(str.length()); 
    } 
} 

