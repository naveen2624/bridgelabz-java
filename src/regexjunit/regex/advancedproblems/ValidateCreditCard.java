package regexjunit.regex.advancedproblems;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateCreditCard {
    public static final String REGEX_IP="^(4\\d{15}|5\\d{15})$";
    public static boolean isValidIP(String ip){
        return Pattern.matches(REGEX_IP,ip);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Card Number: ");
        String ip = sc.nextLine();
        if (isValidIP(ip)){
            System.out.println("Valid Card");
        }
        else{
            System.out.println("Invalid Card");
        }
    }
}
