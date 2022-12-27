import java.util.*;
import java.io.*;



class Solution{
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                // short Range -32768 to 32767
                
                if(x>=-32768 && x<=32767)
                System.out.println("* short");
                
                //int Range -2147483648 to 2147483647
                if(x>=-2147483648 && x<=2147483647)
                System.out.println("* int");
                
                // long range -9223372036854775808 to       9223372036854775807
                
                if(x>=-9223372036854775808l && x<=9223372036854775807l)
                System.out.println("* long");
                
                //out of range
                if(x<=-9223372036854775808l && x>=9223372036854775807l)
                System.out.println(x+" can't be fitted anywhere.");
                
                //Complete the code
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}

