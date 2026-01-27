package methods.level3;

public class DistanceLine {

    public static void main(String[] args) {
        double x1 = 2, y1 = 3, x2 = 5, y2 = 7;

        double distance = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;

        System.out.println("Distance: " + distance);
        System.out.println("Line: y = " + m + "x + " + b);
    }
}
