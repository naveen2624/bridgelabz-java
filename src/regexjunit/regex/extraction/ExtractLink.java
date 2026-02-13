package regexjunit.regex.extraction;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ExtractLink {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text= sc.nextLine();
        String LinkRegex="https?://[A-Za-z0-9.-]+\\.[A-Za-z]{2,}(/[A-Za-z0-9._%+-]*)*";
        Pattern pattern = Pattern.compile(LinkRegex);
        Matcher matcher = pattern.matcher(text);
        System.out.println("Links Extracted: ");
        boolean found = false;
        while (matcher.find()) {
            System.out.println(matcher.group());
            found = true;
        }

        if (!found) {
            System.out.println("No Links found.");
        }
    }
}
