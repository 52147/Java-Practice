// Method Overriding:

// Subclass provides a specific implementation of a method that 
// is already defined in its superclass.
class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car started");
    }
}
