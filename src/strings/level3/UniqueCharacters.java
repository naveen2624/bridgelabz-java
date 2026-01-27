package strings.level3;

public class UniqueCharacters {

    static int length(String s) {
        int count = 0;
        for (;;) {
            try { s.charAt(count); count++; }
            catch (Exception e) { break; }
        }
        return count;
    }

    static char[] uniqueChars(String s) {
        int len = length(s);
        char[] temp = new char[len];
        int k = 0;

        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            boolean unique = true;

            for (int j = 0; j < i; j++)
                if (c == s.charAt(j)) unique = false;

            if (unique) temp[k++] = c;
        }

        char[] result = new char[k];
        for (int i = 0; i < k; i++) result[i] = temp[i];
        return result;
    }

    public static void main(String[] args) {
        String text = "programming";
        char[] u = uniqueChars(text);

        for (char c : u) System.out.print(c + " ");
    }
}
