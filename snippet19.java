public class Main { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 0; 
        int result = a / b; 
        System.out.println(result); 
    } 
} 
 What runtime exception is thrown? Why does division by zero cause an issue in Java?

//Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Main.main(Main.java:6)

//Java enforces this rule by throwing an ArithmeticException when an int is divided by zero.
If a / b is performed where b == 0 and both a and b are int, Java throws ArithmeticException at runtime.
//As Division by Zero with double as floating-Point Division (double) Does Not Throw an Exception

//Corrected Code:
public class Main {
    public static void main(String[] args) {
        double a = 10.0;
        double b = 0.0;
        double result = a / b;
        System.out.println(result);
    }
}
//it will give result as Infinity
