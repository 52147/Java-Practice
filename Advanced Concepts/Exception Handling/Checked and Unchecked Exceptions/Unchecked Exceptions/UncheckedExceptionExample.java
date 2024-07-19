// Unchecked Exceptions
// Definition: Unchecked exceptions are not checked at compile time. These are typically programming errors that a program may not be able to recover from, such as logic errors or improper use of an API.
// Handling: There is no requirement for a method to declare unchecked exceptions using the throws keyword. They can be caught and handled, but it is not mandatory to do so.
// Examples: ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException.
// Example:

public class UncheckedExceptionExample {
    public static void main(String[] args) {
        int result = divide(10, 0);
        System.out.println("Result: " + result);
    }

    public static int divide(int a, int b) {
        return a / b;  // This will throw ArithmeticException if b is 0
    }
}

// Key Differences
// Checked Exceptions:

// Must be either caught or declared in the method signature.
// Meant to represent conditions that a program should anticipate and recover from.
// Extend java.lang.Exception.

// Unchecked Exceptions:

// Do not need to be declared or caught.
// Represent programming errors that are typically irrecoverable.
// Extend java.lang.RuntimeException.
// Understanding and appropriately using these exceptions helps in writing robust and error-resilient Java applications.






