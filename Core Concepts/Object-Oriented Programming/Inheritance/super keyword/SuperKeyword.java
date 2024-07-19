// super keyword:

// Refers to the superclass object.
// Used to access superclass methods and constructors.
class Vehicle {
    Vehicle() {
        System.out.println("Vehicle created");
    }
}

class Car extends Vehicle {
    Car() {
        super();
        System.out.println("Car created");
    }
}
