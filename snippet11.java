public class Main { 
    public static void main(String[] args) { 
        int[] arr = {1, 2, 3}; 
        System.out.println(arr[5]); 
    } 
} 

 // It will compile successfully but gives runtime error as Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
        at Main.main(Main.java:4)
//Exception error occure because Array arr is declared with 3 that is int[] arr= {1,2,3} elements and Attempting to Access arr[5] that is System.out.println(arr[5]);


// Corrected Code
public class Main { 
    public static void main(String[] args) { 
        int[] arr = {1, 2, 3}; 
        System.out.println(arr[2]); 
    } 
} 

