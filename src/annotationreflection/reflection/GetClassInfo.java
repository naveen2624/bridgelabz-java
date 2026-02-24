package annotationreflection.reflection;
import java.lang.reflect.*;



public class GetClassInfo {
    public static void main(String[] args)throws Exception {
        Class<?> cls=Class.forName("annotationreflection.reflection.Person");
        System.out.println("Class Name: "+cls.getName());
        System.out.println("\n--- Fields ---");
        Field[] fields = cls.getDeclaredFields();
        for(Field field : fields){
            System.out.println(field.getType().getSimpleName() + " " + field.getName());
        }
        System.out.println("\n--- Constructors ---");
        Constructor<?>[] cons = cls.getDeclaredConstructors();
        for(Constructor<?> constructor:cons){
            System.out.println(constructor.getName());
        }
        System.out.println("\n--- Methods ---");
        Method[] method = cls.getDeclaredMethods();
        for(Method met:method){
            System.out.println(met.getReturnType().getSimpleName()+ " "+met.getName());
        }

    }
}
