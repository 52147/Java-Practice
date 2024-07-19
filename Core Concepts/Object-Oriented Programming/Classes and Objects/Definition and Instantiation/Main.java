// Classes and Objects
// Definition and Instantiation:

// Class: A blueprint for creating objects. It defines a datatype by bundling data and methods that work on the data into one single unit.
// Object: An instance of a class. It is a real-world entity with state and behavior.
// Instantiation: The process of creating an object from a class.
class Car {
    String color;
    String model;

    void display() {
        System.out.println("Model: " + model + ", Color: " + color);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(); // Instantiation
        car1.color = "Red";
        car1.model = "Toyota";
        car1.display();
    }
}
