package regexjunit.regex.extraction;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCapitalWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text:");
        String text = scanner.nextLine();

        // Email regex pattern
        String emailRegex = "\\b[A-Z][\\w]*\\b";

        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("\nExtracted Capitalized Words:");

        boolean found = false;
        while (matcher.find()) {
            System.out.println(matcher.group());
            found = true;
        }

        if (!found) {
            System.out.println("No Capitalized Words found.");
        }

        scanner.close();
    }
}
