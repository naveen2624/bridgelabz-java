
package regexjunit.regex.basic;
import java.util.Scanner;
import java.util.regex.Pattern;
public class ValidateHexColor {

    private static final String REGEX_HEX_COLOR="^#[A-Fa-f0-9]{6}";

    public static boolean isValidHexColor(String hexcolor){
        return Pattern.matches(REGEX_HEX_COLOR,hexcolor);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Hex Color: ");
        String hexcolor = sc.nextLine();

        if (isValidHexColor(hexcolor)) {
            System.out.println("✅ Valid Hex Color");
        } else {
            System.out.println("❌ Invalid Hex Color");
        }

        sc.close();
    }
}
