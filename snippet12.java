public class Main { 
    public static void main(String[] args) { 
        while (true) { 
            System.out.println("Infinite Loop"); 
        } 
    } 
} 

//When I execute the given code, it results in an infinite loop, continuously printing. To overcome this issue I use break statment inside the loop 

// Corrected Code

public class Main { 
    public static void main(String[] args) { 
        
int i = 0;
while (true) {  
    if (i == 3) {  
        break;  
    }
    System.out.println("Infinite Loop");
    i++;
}

