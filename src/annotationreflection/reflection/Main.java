package annotationreflection.reflection;
public class Main{
    public static void main(String[] args){

    }
}
class Person {

    // Fields
    public String name;
    private int age;


    // Constructors
    public Person() {
        System.out.println("Default Constructor");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Methods
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    private void privateMethod() {
        System.out.println("Private Method");
    }
}

class Calculator {

    private int multiply(int a, int b) {
        return a * b;
    }
}


class Student {

    private String name;
    private int age;

    public Student() {
        System.out.println("Default Constructor Called");
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized Constructor Called");
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class MathOperations {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}