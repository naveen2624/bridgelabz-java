package methods.level3;

public class NumberChecker2 {

    static int[] digits(int n) {
        int[] d = new int[String.valueOf(n).length()];
        for (int i = d.length - 1; i >= 0; i--) {
            d[i] = n % 10;
            n /= 10;
        }
        return d;
    }

    static int sumDigits(int[] d) {
        int s = 0;
        for (int x : d) s += x;
        return s;
    }

    static boolean isHarshad(int n, int[] d) {
        return n % sumDigits(d) == 0;
    }

    public static void main(String[] args) {
        int number = 21;
        int[] d = digits(number);

        System.out.println("Sum of digits: " + sumDigits(d));
        System.out.println("Harshad Number: " + isHarshad(number, d));
    }
}
