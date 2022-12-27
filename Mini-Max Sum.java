/*

Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers.
Then print the respective minimum and maximum values as a single line of two space-separated long integers.

explanation 
1,2,3,4,5
1+2+3+4=10
2+3+4+5=14


*/






import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
static long min,max;
    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    Collections.sort(arr); 
    for(int i=0; i<arr.size()-1; i++){
        min=min+arr.get(i);
      
    }
     
    for(int j=1; j<5; j++){
        
        
        max=max+arr.get(j);
      
    }
    
    System.out.print(min+" "+max);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
