package methods.level3;

public class NumberChecker1 {

    static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    static int[] digits(int n) {
        int[] d = new int[countDigits(n)];
        for (int i = d.length - 1; i >= 0; i--) {
            d[i] = n % 10;
            n /= 10;
        }
        return d;
    }

    static boolean isDuck(int[] d) {
        for (int x : d) if (x != 0) return true;
        return false;
    }

    static boolean isArmstrong(int n, int[] d) {
        int p = d.length, sum = 0;
        for (int x : d) sum += Math.pow(x, p);
        return sum == n;
    }

    public static void main(String[] args) {
        int number = 153;
        int[] d = digits(number);

        System.out.println("Digits Count: " + countDigits(number));
        System.out.println("Duck Number: " + isDuck(d));
        System.out.println("Armstrong: " + isArmstrong(number, d));
    }
}
