package regexjunit.regex.advancedproblems;

public class SSNValidator {

    public static void main(String[] args) {

        String ssn = "123-45-6789";

        String regex = "^\\d{3}-\\d{2}-\\d{4}$";

        if (ssn.matches(regex)) {
            System.out.println("\"" + ssn + "\" is valid");
        } else {
            System.out.println("\"" + ssn + "\" is invalid");
        }
    }
}
