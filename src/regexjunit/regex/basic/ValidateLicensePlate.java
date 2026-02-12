package regexjunit.regex.basic;
import java.util.Scanner;
import java.util.regex.Pattern;
public class ValidateLicensePlate {
    private static final String REGEX_LICENSE_PLATE="^[a-zA-z]{2}[\\d]{4}";

    public static boolean isValidLicensePlate(String licenseplate){
        return Pattern.matches(REGEX_LICENSE_PLATE,licenseplate);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter License Plate: ");
        String licenseplate = sc.nextLine();

        if (isValidLicensePlate(licenseplate)) {
            System.out.println("✅ Valid License Plate");
        } else {
            System.out.println("❌ Invalid License Plate");
        }

        sc.close();
    }
}
