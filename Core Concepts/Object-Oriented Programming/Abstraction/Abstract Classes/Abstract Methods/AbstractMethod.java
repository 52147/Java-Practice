// Abstract Methods:

// Declared without an implementation. Must be overridden in subclasses.
abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barking");
    }
}
