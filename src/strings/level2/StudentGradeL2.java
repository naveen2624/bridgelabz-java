package strings.level2;

public class StudentGradeL2 {

    public static int[][] generatePCM(int n) {

        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 3; j++)
                scores[i][j] = (int)(Math.random() * 40) + 60;

        return scores;
    }

    public static double[][] calculateResults(int[][] pcm) {

        double[][] result = new double[pcm.length][3];

        for (int i = 0; i < pcm.length; i++) {
            int total = pcm[i][0] + pcm[i][1] + pcm[i][2];
            double avg = Math.round((total / 3.0) * 100.0) / 100.0;
            double perc = Math.round((total / 300.0 * 100) * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = avg;
            result[i][2] = perc;
        }
        return result;
    }

    public static String grade(double p) {
        if (p >= 80) return "A";
        if (p >= 70) return "B";
        if (p >= 60) return "C";
        if (p >= 50) return "D";
        if (p >= 40) return "E";
        return "R";
    }
}
