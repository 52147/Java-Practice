#### Thread Pools

- Thread pools manage a set of worker threads.
- Reuse existing threads instead of creating new ones.

Example:
```java
ExecutorService executor = Executors.newCachedThreadPool();
executor.submit(() -> {
    System.out.println("Task is running");
});
executor.shutdown();
```

