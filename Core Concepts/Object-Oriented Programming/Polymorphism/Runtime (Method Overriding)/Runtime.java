// Runtime (Method Overriding):

// Method implementation is determined at runtime.
class Animal {
    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barking");
    }
}
