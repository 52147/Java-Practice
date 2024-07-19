### Synchronization

#### synchronized Keyword

- Used to control the access of multiple threads to a shared resource.
- Can be applied to methods or blocks of code.

**Method Synchronization**:
```java
public synchronized void synchronizedMethod() {
    // synchronized code
}
```

**Block Synchronization**:
```java
public void someMethod() {
    synchronized(this) {
        // synchronized code
    }
}
```
