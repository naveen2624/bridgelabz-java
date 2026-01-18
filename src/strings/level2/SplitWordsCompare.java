package strings.level2;

import java.util.Scanner;

public class SplitWordsCompare {

    public static int findLength(String text) {
        int i = 0;
        try {
            while (true) text.charAt(i++);
        } catch (RuntimeException e) {}
        return i;
    }

    /*
     * Split text into words using charAt()
     */
    public static String[] splitWords(String text) {

        int length = findLength(text);
        int wordCount = 1;

        for (int i = 0; i < length; i++)
            if (text.charAt(i) == ' ')
                wordCount++;

        int[] spaceIndex = new int[wordCount + 1];
        int idx = 1;

        for (int i = 0; i < length; i++)
            if (text.charAt(i) == ' ')
                spaceIndex[idx++] = i;

        spaceIndex[wordCount] = length;

        String[] words = new String[wordCount];
        int start = 0;

        for (int i = 0; i < wordCount; i++) {
            String word = "";
            for (int j = start; j < spaceIndex[i + 1]; j++)
                if (text.charAt(j) != ' ')
                    word += text.charAt(j);
            words[i] = word;
            start = spaceIndex[i + 1];
        }
        return words;
    }

    public static boolean compareArrays(String[] a, String[] b) {

        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++)
            if (!a[i].equals(b[i]))
                return false;

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] custom = splitWords(text);
        String[] builtin = text.split(" ");

        System.out.println("Match: " + compareArrays(custom, builtin));
        sc.close();
    }
}
