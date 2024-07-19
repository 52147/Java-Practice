#### Garbage Collection

Garbage collection in Java is the process of automatically freeing memory by destroying objects that are no longer reachable in the program. The JVM has several garbage collection algorithms, including:

- **Serial Garbage Collector**: Uses a single thread to perform all garbage collection work.
- **Parallel Garbage Collector**: Uses multiple threads to speed up garbage collection.
- **Concurrent Mark-Sweep (CMS)**: Aims to minimize pause times by doing most of the garbage collection work concurrently with the application.
- **Garbage First (G1)**: Divides the heap into regions and prioritizes the collection of regions with the most garbage.

Example:
```java
System.gc();  // Suggests that the JVM performs garbage collection
```

### Summary

- **JDK**: The development environment that includes tools for developing, debugging, and monitoring Java applications.
- **Compiler (javac)**: Translates Java source code into bytecode.
  - Compilation Process: Source code -> Compilation -> Bytecode.
  - Options and Flags: Control various aspects of the compilation process.
- **JRE**: Provides the libraries and JVM required to run Java applications.
- **JVM**: The engine that executes Java bytecode.
  - Class Loader: Loads classes into the JVM.
  - Bytecode Execution: Executes the Java bytecode.
  - Garbage Collection: Manages memory by removing unused objects.

Understanding these components is crucial for Java development, as they form the foundation of how Java applications are created, compiled, and executed.
