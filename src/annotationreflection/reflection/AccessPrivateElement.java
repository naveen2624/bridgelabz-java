package annotationreflection.reflection;
import java.lang.reflect.*;
public class AccessPrivateElement {
    public static void main(String[] args) throws Exception{
        Person person = new Person("Naveen",21);
        System.out.println("Before Modifying");
        person.display();
        Class<?> cls = person.getClass();
        Field ageField = cls.getDeclaredField("age");
        ageField.setAccessible(true);
        ageField.set(person,30);
        System.out.println("Updated Age Field");
        person.display();
    }
}
