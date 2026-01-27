package strings.level3;

public class FirstNonRepeating {

    static char find(String s) {
        int[] freq = new int[256];

        for (int i = 0; i < s.length(); i++)
            freq[s.charAt(i)]++;

        for (int i = 0; i < s.length(); i++)
            if (freq[s.charAt(i)] == 1)
                return s.charAt(i);

        return '\0';
    }

    public static void main(String[] args) {
        String text = "swiss";
        System.out.println(find(text));
    }
}

