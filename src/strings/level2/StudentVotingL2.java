package strings.level2;

public class StudentVotingL2 {

    public static int[] generateAges(int n) {

        int[] ages = new int[n];
        for (int i = 0; i < n; i++)
            ages[i] = (int)(Math.random() * 90) + 10;

        return ages;
    }

    public static String[][] canVote(int[] ages) {

        String[][] table = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            table[i][0] = String.valueOf(ages[i]);
            table[i][1] = ages[i] >= 18 ? "true" : "false";
        }
        return table;
    }
}
