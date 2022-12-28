import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
       
      NumberFormat cf1 = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
  
       

        NumberFormat cf2 = NumberFormat.getCurrencyInstance(new Locale("sk", "SK"));
     

        NumberFormat cf3 = NumberFormat.getCurrencyInstance(new Locale("zh", "CN"));
      
    NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
   
   
      String france=  cf2.format(payment);

 String india = formatter.format(payment);
        // Write your code here.
        
        System.out.println("US: " + cf1.format(payment));
        System.out.println("India: " + india);
        System.out.println("China: " +cf3.format(payment));
        System.out.println("France: " + france);
    }
}
