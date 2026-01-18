package methods.level2;

import java.util.Scanner;

public class FriendsComparison {

    public static int findYoungest(int[] ages) {
        return Math.min(ages[0], Math.min(ages[1], ages[2]));
    }

    public static int findTallest(int[] heights) {
        return Math.max(heights[0], Math.max(heights[1], heights[2]));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] ages = new int[3];
        int[] heights = new int[3];

        String[] names = {"Amar", "Akbar", "Anthony"};

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();

            System.out.print("Enter height of " + names[i] + ": ");
            heights[i] = sc.nextInt();
        }

        System.out.println("Youngest Age: " + findYoungest(ages));
        System.out.println("Tallest Height: " + findTallest(heights));

        sc.close();
    }
}
