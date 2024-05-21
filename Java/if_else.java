import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class if_else {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();

        scanner.close();
        if(n % 2 != 0){
            System.out.println("Weird");
        }
        else{
            if(2 <= n && n <=5){
                System.out.println("Not Weird");
            }
            else if(6 <= n && n <=20){
                System.out.println("Weird");
            }
            else{
                System.out.println("Not Weird");
            }
        }
    }
}
