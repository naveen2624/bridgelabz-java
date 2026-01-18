package strings.level2;

import java.util.Scanner;

public class VowelConsonantCount {

    public static String checkChar(char ch) {

        if (ch >= 'A' && ch <= 'Z')
            ch = (char)(ch + 32);

        if (ch >= 'a' && ch <= 'z') {
            if ("aeiou".indexOf(ch) != -1)
                return "Vowel";
            return "Consonant";
        }
        return "Not a Letter";
    }

    public static int[] countVC(String text) {

        int v = 0, c = 0;

        for (int i = 0; i < text.length(); i++) {
            String result = checkChar(text.charAt(i));
            if (result.equals("Vowel")) v++;
            else if (result.equals("Consonant")) c++;
        }
        return new int[]{v, c};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        int[] result = countVC(text);

        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);

        sc.close();
    }
}
