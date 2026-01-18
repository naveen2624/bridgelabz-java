package methods.level1;
import java.util.Scanner;

public class ChocolatesDistribution {

    /*
     * This method calculates chocolates per child
     * and remaining chocolates
     */
    public static int[] findRemainderAndQuotient(int chocolates, int children) {

        int eachGets = chocolates / children;
        int remaining = chocolates % children;

        return new int[]{eachGets, remaining};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of chocolates: ");
        int chocolates = sc.nextInt();

        System.out.print("Enter number of children: ");
        int children = sc.nextInt();

        // Method call
        int[] result = findRemainderAndQuotient(chocolates, children);

        System.out.println("Each child gets: " + result[0]);
        System.out.println("Remaining chocolates: " + result[1]);

        sc.close();
    }
}
