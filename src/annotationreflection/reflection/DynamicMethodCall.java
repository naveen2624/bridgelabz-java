package annotationreflection.reflection;

import java.lang.reflect.Method;
import java.util.Scanner;

public class DynamicMethodCall {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter method name (add/subtract/multiply): ");
        String methodName = sc.nextLine();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Load class
        Class<?> cls = Class.forName("annotationreflection.reflection.MathOperations");

        Object obj = cls.getDeclaredConstructor().newInstance();

        // Get method dynamically
        Method method = cls.getMethod(methodName, int.class, int.class);

        Object result = method.invoke(obj, a, b);

        System.out.println("Result: " + result);
    }
}