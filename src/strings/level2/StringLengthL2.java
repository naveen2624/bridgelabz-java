package strings.level2;

import java.util.Scanner;

public class StringLengthL2 {

    /*
     * Finds length of string using charAt()
     * Uses infinite loop until exception occurs
     */
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (RuntimeException e) {
            // Exception occurs when index exceeds string length
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        System.out.println("Custom Length: " + findLength(text));
        System.out.println("Built-in Length: " + text.length());

        sc.close();
    }
}
