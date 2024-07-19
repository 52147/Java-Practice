// Default Methods:

// Methods defined in interfaces with a default implementation. These methods provide default behavior that implementing classes can override.
interface Animal {
    void makeSound();

    default void sleep() {
        System.out.println("Sleeping");
    }
}
