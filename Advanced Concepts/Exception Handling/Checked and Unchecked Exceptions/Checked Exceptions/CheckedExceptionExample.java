import java.io.*;
// Checked Exceptions
// Definition: Checked exceptions are exceptions that are checked at compile time. These are exceptional conditions that a well-written application should anticipate and recover from.
// Handling: When a method can throw a checked exception, it must declare it using the throws keyword in its method signature. The calling method must either handle this exception with a try-catch block or declare it to be thrown further up the call stack.
// Examples: IOException, SQLException, ClassNotFoundException.
// Example:
public class CheckedExceptionExample {
    public static void main(String[] args) {
        try {
            readFile("nonexistentFile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile(String fileName) throws IOException {
        FileReader fileReader = new FileReader(fileName);
    }
}
