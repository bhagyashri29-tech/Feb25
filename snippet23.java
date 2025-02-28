public class Confusion { 
    public static void main(String[] args) { 
        int value = 2; 
        switch(value) { 
            case 1: 
                System.out.println("Value is 1"); 
            case 2: 
                System.out.println("Value is 2"); 
            case 3: 
                System.out.println("Value is 3"); 
            default: 
                System.out.println("Default case"); 
        } 
    } 
} 


//The issue arises because the switch statement in Java does not automatically stop execution after a case unless a break statement is explicitly included. When value is 2, execution starts at case 2 but continues executing the subsequent cases (case 3 and default) since there are no break statements.

//value = 2, so execution jumps to case 2.
"Value is 2" is printed.
Execution continues to case 3 (since there's no break).
"Value is 3" is printed.
Execution continues to default.
"Default case" is printed.

//To overcome this issue adding break statements after each case.

//Corrected Code:
public class Confusion { 
    public static void main(String[] args) { 
        int value = 2; 
        switch(value) { 
            case 1: 
                System.out.println("Value is 1"); 
                 break;
            case 2: 
                System.out.println("Value is 2"); 
                 break;

            case 3: 
                System.out.println("Value is 3"); 
                 break;

            default: 
                System.out.println("Default case"); 
        } 
    } 
} 


