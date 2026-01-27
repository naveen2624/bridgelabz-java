package methods.level3;

public class CalendarDisplay {

    static int firstDay(int m, int y) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        return (1 + x + (31 * m0) / 12) % 7;
    }

    public static void main(String[] args) {
        int month = 7, year = 2005;
        int day = firstDay(month, year);

        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for (int i = 0; i < day; i++) System.out.print("    ");

        for (int d = 1; d <= 31; d++) {
            System.out.printf("%3d ", d);
            if ((d + day) % 7 == 0) System.out.println();
        }
    }
}
