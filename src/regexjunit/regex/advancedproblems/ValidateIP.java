package regexjunit.regex.advancedproblems;
import java.util.Scanner;
import java.util.regex.Pattern;
public class ValidateIP {
    public static final String REGEX_IP="^((25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\.){3}"
            + "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])$";
    public static boolean isValidIP(String ip){
        return Pattern.matches(REGEX_IP,ip);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the IP Address: ");
        String ip = sc.nextLine();
        if (isValidIP(ip)){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
