// Implementing Interfaces:
interface Animal {
    void makeSound();
}
// A class uses the implements keyword to implement an interface. A class can implement multiple interfaces.
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}
