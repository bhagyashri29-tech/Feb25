public class Switch { 
    public static void main(String[] args) { 
        int number = 5; 
        switch(number) { 
            case 5: 
                System.out.println("Number is 5"); 
 
 
                break; 
            case 5: 
                System.out.println("This is another case 5"); 
                break; 
            default: 
                System.out.println("This is the default case"); 
        } 
    } 
} 


 Error to Investigate: Why does the compiler complain about duplicate case labels? What 
happens when you have two identical case labels in the same switch block?


//it will give comilation error: duplicate case label
                                 case 5:

//The compiler error occurs because case 5 is duplicated within the same switch statement. Each case label must be unique, and defining multiple cases with the same value is not allowed.

//The compiler will not allow the program to compile.
The error message will indicate "Duplicate case label".
Execution never reaches the second case 5 because the compiler prevents the program from running.

//To prevent this use a different case value 

//Corrected code:
public class Switch { 
    public static void main(String[] args) { 
        int number = 5; 
        switch(number) { 
            case 5: 
                System.out.println("Number is 5"); 
                 break; 
            case 6: 
                System.out.println("This is another case 6"); 
                break; 
            default: 
                System.out.println("This is the default case"); 
        } 
    } 
} 



