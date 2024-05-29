import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

      // bufferedReader.readLine() reads a line of text from the input.
      // trim() removes any leading and trailing whitespace from the input string.
      // Integer.parseInt() converts the trimmed string to an integer and assigns it to the variable N.
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for(int i=1;i<=10;i++){
            System.out.printf("%d x %d = %d\n",N,i,N*i);
        }

        bufferedReader.close();
    }
}
