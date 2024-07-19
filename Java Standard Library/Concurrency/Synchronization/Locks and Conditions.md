#### Locks and Conditions

- `ReentrantLock` provides more flexibility than `synchronized`.
- Allows explicit locking and unlocking.

Example:
```java
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    private final Lock lock = new ReentrantLock();

    public void doSomething() {
        lock.lock();
        try {
            // critical section
        } finally {
            lock.unlock();
        }
    }
}
```
