package methods.level3;

public class ZaraBonus {

    public static void main(String[] args) {
        double totalBonus = 0;

        for (int i = 1; i <= 10; i++) {
            double salary = 10000 + Math.random() * 90000;
            int years = (int)(Math.random() * 10);
            double bonus = years > 5 ? salary * 0.05 : salary * 0.02;
            totalBonus += bonus;

            System.out.println("Emp " + i + " Bonus: " + bonus);
        }
        System.out.println("Total Bonus: " + totalBonus);
    }
}
