public class Main { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 5; 
        int result = a ** b; 
        System.out.println(result); 
    } 
} 
 What compilation error occurs? Why is the ** operator not valid in Java?

//1 comilation error occur
e  error: illegal start of expression
        int result = a ** b;
                        ^
// ** operator is not valid in java . java does not support ** operator
Java only supports these arithmetic operators:
+ (Addition)
- (Subtraction)
* (Multiplication)
/ (Division)
% (Modulus)
//we can use * instead of ** 

//Corrected Code:
public class Main { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 5; 
        int result = a * b; 
        System.out.println(result); 
    } 
} 


