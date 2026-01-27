package strings.level3;

public class FrequencyUnique {

    static char[] unique(String s) {
        char[] temp = new char[s.length()];
        int k = 0;

        for (int i = 0; i < s.length(); i++) {
            boolean found = false;
            for (int j = 0; j < i; j++)
                if (s.charAt(i) == s.charAt(j)) found = true;

            if (!found) temp[k++] = s.charAt(i);
        }

        char[] u = new char[k];
        for (int i = 0; i < k; i++) u[i] = temp[i];
        return u;
    }

    public static void main(String[] args) {
        String s = "banana";
        char[] u = unique(s);

        for (char c : u) {
            int count = 0;
            for (int i = 0; i < s.length(); i++)
                if (c == s.charAt(i)) count++;
            System.out.println(c + " : " + count);
        }
    }
}
