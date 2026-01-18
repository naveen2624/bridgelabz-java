package strings.level1;

import java.util.Scanner;

public class SubstringCompare {

    /*
     * Create substring using charAt()
     */
    public static String substringUsingCharAt(String text, int start, int end) {

        String result = "";

        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    /*
     * Compare two strings using charAt()
     */
    public static boolean compareStrings(String s1, String s2) {

        if (s1.length() != s2.length())
            return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String customSub = substringUsingCharAt(text, start, end);
        String builtInSub = text.substring(start, end);

        System.out.println("Custom substring: " + customSub);
        System.out.println("Built-in substring: " + builtInSub);

        System.out.println("Results match: " +
                compareStrings(customSub, builtInSub));

        sc.close();
    }
}
