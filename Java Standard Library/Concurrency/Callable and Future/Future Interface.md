#### Future Interface

- Represents the result of an asynchronous computation.
- Methods to check if the computation is complete, wait for its completion, and retrieve the result.

Example:
```java
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Callable<Integer> callable = () -> 123;
        Future<Integer> future = executor.submit(callable);

        try {
            Integer result = future.get();  // Waits for the task to complete and retrieves the result
            System.out.println("Result: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }
}
```

