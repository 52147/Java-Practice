### Callable and Future

#### Callable Interface

- Similar to `Runnable` but can return a result and throw a checked exception.
- Implement the `call` method.

Example:
```java
import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    public Integer call() {
        return 123;
    }
}
```
