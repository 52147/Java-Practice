### Java Virtual Machine (JVM)

The Java Virtual Machine (JVM) is a virtual machine that enables a computer to run Java programs. It provides a runtime environment in which Java bytecode can be executed.

#### Class Loader

The class loader is a subsystem of the JVM responsible for loading class files. It performs three main tasks:

1. **Loading**: Loads the class files into memory.
2. **Linking**: Performs verification, preparation, and (optionally) resolution.
3. **Initialization**: Executes the class initializers and static initializers.

Example of loading a class:
```java
Class<?> clazz = Class.forName("com.example.MyClass");
```
