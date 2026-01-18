package strings.level1;

public class NullPointerDemo {

    // Method to generate exception
    public static void generateException() {
        String text = null;
        System.out.println(text.length()); // Exception
    }

    // Method to handle exception
    public static void handleException() {

        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled");
        }
    }

    public static void main(String[] args) {

        // generateException(); // Uncomment to see crash
        handleException();
    }
}
