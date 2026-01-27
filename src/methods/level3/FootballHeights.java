package methods.level3;
import java.util.Random;

public class FootballHeights {
    static int sum(int[] a) {
        int s = 0;
        for (int x : a) s += x;
        return s;
    }

    static int shortest(int[] a) {
        int min = Integer.MAX_VALUE;
        for (int x : a) if (x < min) min = x;
        return min;
    }

    static int tallest(int[] a) {
        int max = Integer.MIN_VALUE;
        for (int x : a) if (x > max) max = x;
        return max;
    }

    public static void main(String[] args) {
        int[] heights = new int[11];
        Random r = new Random();

        for (int i = 0; i < 11; i++)
            heights[i] = 150 + r.nextInt(101);

        System.out.print("Heights: ");
        for (int h : heights) System.out.print(h + " ");

        System.out.println("\nShortest: " + shortest(heights));
        System.out.println("Tallest: " + tallest(heights));
        System.out.println("Mean: " + (sum(heights) / 11.0));
    }
}
