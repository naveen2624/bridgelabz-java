package controlflows.level2;
import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ageA = sc.nextInt();
        int ageB = sc.nextInt();
        int ageC = sc.nextInt();

        int heightA = sc.nextInt();
        int heightB = sc.nextInt();
        int heightC = sc.nextInt();

        int youngestAge = Math.min(ageA, Math.min(ageB, ageC));
        int tallestHeight = Math.max(heightA, Math.max(heightB, heightC));

        System.out.println("Youngest age: " + youngestAge);
        System.out.println("Tallest height: " + tallestHeight);
    }
}
