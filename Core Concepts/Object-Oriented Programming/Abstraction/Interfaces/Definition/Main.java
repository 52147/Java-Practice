// Definition:

// A reference type in Java, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types. Interfaces cannot have instance fields or constructors.
// An interface in Java can have abstract methods, default methods, and static methods. Since Java 8, default and static methods in interfaces can have implementations.
interface MyInterface {
    // 1. Abstract method
    void abstractMethod();

    // 2. Default method(with implementation)
    default void defaultMethod() {
        System.out.println("This is a default method.");
    }

    // 3. Static method(with implementation)
    static void staticMethod() {
        System.out.println("This is a static method.");
    }
}

class MyClass implements MyInterface {
    @Override
    public void abstractMethod() {
        System.out.println("This is an abstract method implementation.");
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.abstractMethod(); // Outputs: This is an abstract method implementation.
        myClass.defaultMethod(); // Outputs: This is a default method.
        MyInterface.staticMethod(); // Outputs: This is a static method.
    }
}
