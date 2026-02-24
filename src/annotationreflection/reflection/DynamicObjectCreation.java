package annotationreflection.reflection;
import java.lang.reflect.*;
public class DynamicObjectCreation {

    public static void main(String[] args) throws Exception {

        // 🔹 Load class dynamically
        Class<?> cls = Class.forName("annotationreflection.reflection.Student");

        // 🔹 Get Constructor (String, int)
        Constructor<?> constructor = cls.getConstructor(String.class, int.class);

        // 🔹 Create object without using 'new'
        Object obj = constructor.newInstance("Naveen", 22);

        // 🔹 Call display method
        cls.getMethod("display").invoke(obj);
    }
}
