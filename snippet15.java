public class Main { 
    public static void main(String[] args) { 
        int num1 = 10; 
        double num2 = 5.5; 
        int result = num1 + num2; 
        System.out.println(result); 
    } 
} 

 //when compiling this code it will give 1 compilation error  
     error: incompatible types: possible lossy conversion from double to int
        int result = num1 + num2;
                          ^
// We can handle different data types in operation By Changing int result to double result to match the promoted type 

//Corrected Code:
public class Main { 
    public static void main(String[] args) { 
        int num1 = 10; 
        double num2 = 5.5; 
        double result = num1 + num2; 
        System.out.println(result); 
    } 
} 


