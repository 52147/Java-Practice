### Executors

#### ExecutorService

- Provides a high-level API for managing threads.
- Methods to submit tasks and manage thread lifecycle.

Example:
```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(() -> {
            System.out.println("Task 1 is running");
        });
        executor.submit(() -> {
            System.out.println("Task 2 is running");
        });
        executor.shutdown();  // Shutdown the executor
    }
}
```

