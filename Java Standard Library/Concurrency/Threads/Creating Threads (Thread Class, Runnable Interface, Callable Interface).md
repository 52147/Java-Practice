Creating threads in Java can be done in three primary ways: by extending the `Thread` class, by implementing the `Runnable` interface, and by using the `Callable` interface. Each method has its own use cases and advantages.

### 1. Creating Threads by Extending the `Thread` Class

When you extend the `Thread` class, you create a new class that inherits from `Thread` and override the `run` method to define the code that should run in the new thread. You then create an instance of your custom thread class and start it using the `start` method.

#### Example:

```java
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();  // Starts the thread
    }
}
```

### 2. Creating Threads by Implementing the `Runnable` Interface

The `Runnable` interface should be implemented by any class whose instances are intended to be executed by a thread. This approach separates the task from the thread itself, making it more flexible since the class implementing `Runnable` can extend another class.

#### Example:

```java
class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable is running");
    }
}

public class Main {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();  // Starts the thread
    }
}
```

### 3. Creating Threads by Implementing the `Callable` Interface

The `Callable` interface is similar to `Runnable` but can return a result and throw a checked exception. Instances of `Callable` can be executed by an `ExecutorService`, which manages the threads.

#### Example:

```java
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        return 123;
    }
}

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        
        MyCallable callable = new MyCallable();
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

### Summary

- **Thread Class**: Directly extend `Thread` and override `run`. Simple but limits inheritance as Java does not support multiple inheritance.
- **Runnable Interface**: Implement `Runnable` and pass the instance to a `Thread` object. More flexible as it allows the class to extend another class.
- **Callable Interface**: Implement `Callable` for tasks that return a result or throw an exception. Use `ExecutorService` to manage execution, providing more control and flexibility, especially for managing a pool of threads and handling task results.