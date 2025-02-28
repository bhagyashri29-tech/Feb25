public class Main { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 5; 
        int result = a + b * 2; 
        System.out.println(result); 
    } 
} 
 What is the output of this code? How does operator precedence affect the result? 
//The output of this code is 20.
//Java follows BODMAS rules for arithmetic operations.
//Operator Precedence in Java:
* (Multiplication) has higher precedence than + (Addition).
The expression b * 2 is evaluated first.
b * 2 → 5 * 2 = 10
a + 10 → 10 + 10 = 20

Final output: result = 20

