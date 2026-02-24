package annotationreflection.reflection;

import java.lang.reflect.Field;
class Configuration {

    private static String API_KEY = "ORIGINAL_KEY";

    public static void printKey() {
        System.out.println("API KEY: " + API_KEY);
    }
}
public class ModifyStaticField {

    public static void main(String[] args) throws Exception {

        // Print original value
        Configuration.printKey();

        // Load class
        Class<?> cls = Configuration.class;

        // Get private static field
        Field field = cls.getDeclaredField("API_KEY");

        field.setAccessible(true);

        // Modify static field (null for static object reference)
        field.set(null, "UPDATED_SECRET_KEY");

        System.out.println("\nAfter Modification:");

        Configuration.printKey();
    }
}