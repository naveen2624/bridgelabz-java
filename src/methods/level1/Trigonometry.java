package methods.level1;

public class Trigonometry {

    /*
     * This method calculates sine, cosine and tangent
     * of an angle given in degrees
     */
    public static double[] calculateTrigonometricFunctions(double angle) {

        // Convert degrees to radians
        double radians = Math.toRadians(angle);

        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);

        return new double[]{sin, cos, tan};
    }

    public static void main(String[] args) {

        double angle = Double.parseDouble(args[0]);

        // Method call
        double[] result = calculateTrigonometricFunctions(angle);

        System.out.println("Sine: " + result[0]);
        System.out.println("Cosine: " + result[1]);
        System.out.println("Tangent: " + result[2]);
    }
}
