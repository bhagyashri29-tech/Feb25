public class Main { 
    public static void main(String[] args) { 
        int class = 10; 
        System.out.println(class); 
    } 
} 
 // it will cause compilation error
// error: <identifier> expected
        int class = 10;
// class is a reserved keyword in java and cannot be used as a variable 
  

// corrected code 
public class Main { 
    public static void main(String[] args) { 
        int  myclass = 10; // renamed variable
        System.out.println(myclass); 
    } 
} 
