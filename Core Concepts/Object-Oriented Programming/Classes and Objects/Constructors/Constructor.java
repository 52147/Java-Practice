// Constructors:

// Special methods called when an object is instantiated. They initialize the object's state.
// A class can have multiple constructors (constructor overloading).

class Car {
    String color;
    String model;

    Car() {
        // Default constructor
        color = "White";
        model = "Honda";
    }

    Car(String c, String m) {
        // Parameterized constructor
        color = c;
        model = m;
    }

    void display() {
        System.out.println("Model: " + model + ", Color: " + color);
    }
}

