package strings.level1;

import java.util.Scanner;

public class CharArrayCompare {

    /*
     * Convert string to char array without using toCharArray()
     */
    public static char[] getCharacters(String text) {

        char[] chars = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        return chars;
    }

    /*
     * Compare two character arrays
     */
    public static boolean compareCharArrays(char[] a, char[] b) {

        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.next();

        char[] customArray = getCharacters(text);
        char[] builtInArray = text.toCharArray();

        System.out.println("Arrays match: " +
                compareCharArrays(customArray, builtInArray));

        sc.close();
    }
}
