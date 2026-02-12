package regexjunit.regex.basic;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateUsername {



    private static final String REGEX_USERNAME="^[\\D\\W][\\w]{4,14}$";
    public static boolean isValidUsername(String username) {
        return Pattern.matches(REGEX_USERNAME, username);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = sc.nextLine();

        if (isValidUsername(username)) {
            System.out.println("✅ Valid Username");
        } else {
            System.out.println("❌ Invalid Username");
        }

        sc.close();
    }
}
