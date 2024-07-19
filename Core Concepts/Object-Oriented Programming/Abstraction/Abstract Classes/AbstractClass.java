// Abstract Classes:

// Cannot be instantiated. Used to declare common characteristics of subclasses.
abstract class Animal {
    abstract void makeSound();

    void sleep() {
        System.out.println("Sleeping");
    }
}
