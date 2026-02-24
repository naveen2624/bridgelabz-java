package annotationreflection.reflection;

import java.lang.reflect.*;


interface Greeting {
    void sayHello();
}

class GreetingImpl implements Greeting {

    public void sayHello() {
        System.out.println("Hello Naveen!");
    }
}

public class LoggingProxy {

    public static void main(String[] args) {

        Greeting original = new GreetingImpl();

        Greeting proxy = (Greeting) Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class[]{Greeting.class},
                (Object proxyObj, Method method, Object[] methodArgs) -> {

                    System.out.println("Method Called: " + method.getName());

                    return method.invoke(original, methodArgs);
                });

        proxy.sayHello();
    }
}