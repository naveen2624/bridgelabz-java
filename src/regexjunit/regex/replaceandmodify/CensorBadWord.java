package regexjunit.regex.replaceandmodify;

public class CensorBadWord {

    public static void main(String[] args) {

        String input = "This is a damn bad example with some stupid words.";

        // List of bad words
        String[] badWords = {"damn", "stupid","fuck","idiot"};

        // Build regex dynamically
        String regex = "\\b(" + String.join("|", badWords) + ")\\b";

        // Case-insensitive replacement
        String output = input.replaceAll("(?i)" + regex, "****");

        System.out.println("Original: " + input);
        System.out.println("Censored: " + output);
    }
}
