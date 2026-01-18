package classandobject.level2;

public class PalindromeChecker {

    // Attribute to store text
    String text;

    /*
     * Method to check palindrome
     */
    public boolean isPalindrome() {

        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    /*
     * Method to display result
     */
    public void displayResult() {

        if (isPalindrome())
            System.out.println(text + " is a Palindrome");
        else
            System.out.println(text + " is NOT a Palindrome");
    }

    public static void main(String[] args) {

        PalindromeChecker p = new PalindromeChecker();
        p.text = "madam";

        p.displayResult();
    }
}
