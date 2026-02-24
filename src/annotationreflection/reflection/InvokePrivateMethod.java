package annotationreflection.reflection;

import java.lang.reflect.Method;

public class InvokePrivateMethod {

    public static void main(String[] args) throws Exception {

        // 🔹 Create Calculator object
        Calculator calculator = new Calculator();

        // 🔹 Get Class object
        Class<?> cls = calculator.getClass();

        // 🔹 Get private method multiply(int,int)
        Method method = cls.getDeclaredMethod("multiply", int.class, int.class);

        // 🔹 Allow access to private method
        method.setAccessible(true);

        // 🔹 Invoke method
        Object result = method.invoke(calculator, 5, 4);

        // 🔹 Display result
        System.out.println("Multiplication Result: " + result);
    }
}
