/* Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.

It's time to test your knowledge of Static initialization blocks. You can read about it here.

You are given a class Solution with a main method. Complete the given code so that it outputs the area of a parallelogram with breadth  B and height H .
You should read the variables from the standard input.

If B<0 or  H<0 , the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.

*/
import java.io.*;
import java.util.*;

public class Solution {
static int a,b;
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        if(a>0 && b>0){
            System.out.println(a*b);
        } else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    
    }
    static{
        Scanner sc= new Scanner(System.in);
         a= sc.nextInt();
        b =sc.nextInt();
        
    sc.close();
        
    }
}
