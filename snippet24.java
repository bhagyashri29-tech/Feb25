public class MissingBreakCase { 
    public static void main(String[] args) { 
        int level = 1; 
        switch(level) { 
            case 1: 
                System.out.println("Level 1"); 
            case 2: 
                System.out.println("Level 2"); 
            case 3: 
                System.out.println("Level 3"); 
            default: 
                System.out.println("Unknown level"); 
        } 
    } 
} 
 Error to Investigate: When level is 1, why does it print "Level 1", "Level 2", "Level 3", and 
"Unknown level"? What is the role of the break statement in this situation?


//When execution starts level = 1, execution enters case 1, but since there is no break; it falls through to the next cases (case 2, case 3, and default). This means all statements after case 1 execute sequentially.

//Execution Flow:
level = 1, so execution enters case 1.
"Level 1" is printed.
No break;, so execution continues to case 2.
"Level 2" is printed.
No break;, so execution continues to case 3.
"Level 3" is printed.
No break;, so execution continues to default.
"Unknown level" is printed.


//The role of break statment is to stops execution from falling through to the next case. Without it, once a matching case is found, all subsequent cases execute until a break is encountered or the switch ends.

// Corrected Code:

public class MissingBreakCase { 
    public static void main(String[] args) { 
        int level = 1; 
        switch(level) { 
            case 1: 
                System.out.println("Level 1"); 
                break;
            case 2: 
                System.out.println("Level 2"); 
                break;
            case 3: 
                System.out.println("Level 3"); 
                break;
            default: 
                System.out.println("Unknown level"); 
        } 
    } 
}




