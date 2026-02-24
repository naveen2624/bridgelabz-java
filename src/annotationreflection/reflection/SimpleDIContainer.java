package annotationreflection.reflection;

import java.lang.reflect.Field;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Inject {}
class Engine {
    public void start() {
        System.out.println("Engine Started");
    }
}

class Car {

    @Inject
    private Engine engine;

    public void drive() {
        engine.start();
        System.out.println("Car Driving");
    }
}

public class SimpleDIContainer {

    public static <T> T createInstance(Class<T> clazz) throws Exception {

        T obj = clazz.getDeclaredConstructor().newInstance();

        for (Field field : clazz.getDeclaredFields()) {

            if (field.isAnnotationPresent(Inject.class)) {

                Object dependency = field.getType()
                        .getDeclaredConstructor()
                        .newInstance();

                field.setAccessible(true);
                field.set(obj, dependency);
            }
        }

        return obj;
    }
    public static void main(String[] args) throws Exception{
        Car car = SimpleDIContainer.createInstance(Car.class);
        car.drive();
    }
}