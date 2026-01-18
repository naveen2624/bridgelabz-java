package methods.level1;
public class SpringSeason {

    /*
     * This method checks whether the given date
     * falls in Spring Season (March 20 to June 20)
     */
    public static boolean isSpringSeason(int month, int day) {

        return (month == 3 && day >= 20) ||
                (month == 4) ||
                (month == 5) ||
                (month == 6 && day <= 20);
    }

    public static void main(String[] args) {

        // Command line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Method call and output
        if (isSpringSeason(month, day)) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
