package methods.level3;

public class PalindromeCheck {

    static boolean isPalindrome(int n) {
        int rev = 0, temp = n;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        return n == rev;
    }

    public static void main(String[] args) {
        int number = 121;
        System.out.println("Palindrome: " + isPalindrome(number));
    }
}
