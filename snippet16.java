public class Main { 
    public static void main(String[] args) { 
        int num = 10; 
        double result = num / 4; 
        System.out.println(result); 
    } 
} 
 What is the result of this operation? Is the output what you expected?
 //The result of above operation is 2.0, but as i expected the output should be 2.5.
//for getting 2.5 output we need to change double result = num / 4; 
 to double result = num / 4.0; because to get a decimal result, at least one operand must be a double

//Corrected Code
public class Main { 
    public static void main(String[] args) { 
        int num = 10; 
        double result = num / 4.0; 
        System.out.println(result); 
    } 
} 

