package strings.level3;

public class CharFrequencyASCII {

    static int[][] frequency(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++)
            freq[s.charAt(i)]++;

        int count = 0;
        for (int f : freq) if (f > 0) count++;

        int[][] result = new int[count][2];
        int k = 0;

        for (int i = 0; i < 256; i++)
            if (freq[i] > 0) {
                result[k][0] = i;
                result[k][1] = freq[i];
                k++;
            }
        return result;
    }

    public static void main(String[] args) {
        int[][] f = frequency("hello");

        for (int[] r : f)
            System.out.println((char)r[0] + " : " + r[1]);
    }
}
