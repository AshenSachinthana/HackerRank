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
              
                    if(x>=-32768 && x<=32768)System.out.println("* short");

                //int: By default, the int data type is a 32-bit signed two's complement integer, 
                //which has a minimum value of -2^31 and a maximum value of 2^31-1.
                        if(x>=-2147483648 && x<=2147483647)System.out.println("* int");

                            if(x>=-9.223372e+18 && x<=9.223372e+18)System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}

