package annotationreflection.reflection;

import java.lang.reflect.Field;

public class JsonUtil {

    public static String toJson(Object obj) throws Exception {

        Class<?> cls = obj.getClass();
        Field[] fields = cls.getDeclaredFields();

        StringBuilder json = new StringBuilder("{");

        for (int i = 0; i < fields.length; i++) {

            fields[i].setAccessible(true);

            json.append("\"")
                    .append(fields[i].getName())
                    .append("\":\"")
                    .append(fields[i].get(obj))
                    .append("\"");

            if (i < fields.length - 1)
                json.append(",");
        }

        json.append("}");

        return json.toString();
    }
}