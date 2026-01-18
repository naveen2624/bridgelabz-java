package classandobject.level1;

public class Circle {
    double radius;
    // Method to calculate circumference
    public double circumferenceOfCircle(){
        return 2*Math.PI*radius;
    }
    // Method to calculate area of circle
    public double areaOfCircle(){
        return Math.PI*radius*radius;
    }
    public static void main(String[] args) {
        Circle c = new Circle();
        c.radius = 8;
        System.out.println("Area of Circle: " + c.areaOfCircle());
        System.out.println("Circumference of Circle: " + c.circumferenceOfCircle());

    }
}
