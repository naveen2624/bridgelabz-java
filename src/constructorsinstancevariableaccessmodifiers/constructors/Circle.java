package constructorsinstancevariableaccessmodifiers.constructors;

class Circle {
    double radius;

    // Default constructor
    Circle() {
        this(1.0); // constructor chaining
    }

    // Parameterized constructor
    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5);

        System.out.println("Default Radius Area: " + c1.area());
        System.out.println("User Radius Area: " + c2.area());
    }
}
