package annotationreflection.reflection;

import java.lang.reflect.Method;
class Task {
    public void run() {
        for (int i = 0; i < 1000000; i++);
        System.out.println("Task Completed");
    }
}
public class MethodTimer {

    public static void measureExecution(Object obj, String methodName) throws Exception {

        Class<?> cls = obj.getClass();
        Method method = cls.getMethod(methodName);

        long start = System.nanoTime();

        method.invoke(obj);

        long end = System.nanoTime();

        System.out.println("Execution Time: " + (end - start) + " ns");
    }
    public static void main(String[] args)throws Exception{
        Task task = new Task();
        MethodTimer.measureExecution(task, "run");
    }
}