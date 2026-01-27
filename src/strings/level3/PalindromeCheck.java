package strings.level3;

public class PalindromeCheck {

    static boolean method1(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j)
            if (s.charAt(i++) != s.charAt(j--)) return false;
        return true;
    }

    static boolean method2(String s, int i, int j) {
        if (i >= j) return true;
        if (s.charAt(i) != s.charAt(j)) return false;
        return method2(s, i+1, j-1);
    }

    static boolean method3(String s) {
        char[] a = s.toCharArray();
        char[] r = new char[a.length];
        for (int i = 0; i < a.length; i++)
            r[i] = a[a.length-1-i];

        for (int i = 0; i < a.length; i++)
            if (a[i] != r[i]) return false;
        return true;
    }

    public static void main(String[] args) {
        String s = "madam";
        System.out.println(method1(s));
        System.out.println(method2(s,0,s.length()-1));
        System.out.println(method3(s));
    }
}
