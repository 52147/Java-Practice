// extends keyword:

// Used to create a subclass from a superclass.
class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle {
    void honk() {
        System.out.println("Car honking");
    }
}

