import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int c=0;

            for(int j=0;j<n;j++){
                //Java does not automatically convert a double to an integer
                int e = (int) Math.pow(2,j);
                c= e*b + c;
                System.out.print((a+c)+" ");
            }
            System.out.print("\n");
        }
        in.close();
    }
}
