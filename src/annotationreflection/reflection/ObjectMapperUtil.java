package annotationreflection.reflection;

import java.lang.reflect.Field;
import java.util.Map;
class User {
    private String name;
    private int age;

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ObjectMapperUtil {

    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) throws Exception {

        T obj = clazz.getDeclaredConstructor().newInstance();

        for (Map.Entry<String, Object> entry : properties.entrySet()) {

            Field field = clazz.getDeclaredField(entry.getKey());
            field.setAccessible(true);
            field.set(obj, entry.getValue());
        }

        return obj;
    }
}