import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String str = scanner.next();
            int num = scanner.nextInt();
            System.out.printf("%-15s%03d\n", str, num);
            // Left-justified, width 15 %Zero-padded, width 3
        }
        System.out.println("================================");
    }
}
