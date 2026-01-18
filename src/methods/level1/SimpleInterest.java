import java.util.Scanner;

public class SimpleInterest {

    /*
     * This method calculates simple interest
     * using the formula:
     * SI = (Principal * Rate * Time) / 100
     */
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Taking inputs from the user
        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time: ");
        double time = sc.nextDouble();

        // Method call
        double interest = calculateSimpleInterest(principal, rate, time);

        // Displaying output
        System.out.println(
                "The Simple Interest is " + interest +
                        " for Principal " + principal +
                        ", Rate of Interest " + rate +
                        " and Time " + time
        );

        sc.close();
    }
}
