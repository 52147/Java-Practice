// Static Methods:

// Methods defined in interfaces with a static keyword.
// They can be called without an instance of the interface.
interface Animal {
    void makeSound();

    static void breathe() {
        System.out.println("Breathing");
    }
}
