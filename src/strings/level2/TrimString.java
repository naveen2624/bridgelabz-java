package strings.level2;
public class TrimString {

    public static int[] findTrimIndexes(String text) {

        int start = 0, end = text.length() - 1;

        while (text.charAt(start) == ' ') start++;
        while (text.charAt(end) == ' ') end--;

        return new int[]{start, end + 1};
    }

    public static String substringUsingCharAt(String text, int s, int e) {
        String result = "";
        for (int i = s; i < e; i++)
            result += text.charAt(i);
        return result;
    }
}
