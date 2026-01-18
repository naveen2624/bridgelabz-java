package methods.level1;

import java.util.Scanner;

public class Handshakes {

    /*
     * This method calculates maximum number of handshakes
     * using combination formula:
     * n * (n - 1) / 2
     */
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        // Method call
        int handshakes = calculateHandshakes(students);

        // Output
        System.out.println("Maximum number of handshakes: " + handshakes);

        sc.close();
    }
}
