package strings.level3;
public class FrequencyNested {

    public static void main(String[] args) {
        char[] ch = "hello".toCharArray();
        int[] freq = new int[ch.length];

        for (int i = 0; i < ch.length; i++) {
            freq[i] = 1;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    freq[i]++;
                    ch[j] = '0';
                }
            }
        }

        for (int i = 0; i < ch.length; i++)
            if (ch[i] != '0')
                System.out.println(ch[i] + " : " + freq[i]);
    }
}
