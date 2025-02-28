public class Main { 
    public static int main(String[] args) { 
        System.out.println("Hello, World!"); 
        return 0; 
    } 
 
 
}
// Error: Main method must return void in class Main, defining the main method as:
   public static void main(String[] args)


//Corrected Code :
 
public class Main { 
    public static Void main(String[] args) { 
        System.out.println("Hello, World!"); 
    } 
 
 
}


