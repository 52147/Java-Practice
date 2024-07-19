### Runnable Interface

#### Implementing Runnable

- Implement the `Runnable` interface when you want to create a thread.
- The `run` method must be implemented to define the task to be executed by the thread.

Example:
```java
class Task implements Runnable {
    public void run() {
        System.out.println("Task is running");
    }
}

public class Main {
    public static void main(String[] args) {
        Task task = new Task();
        Thread thread = new Thread(task);
        thread.start();  // Starts the thread
    }
}
```
