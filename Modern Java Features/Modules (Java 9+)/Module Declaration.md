### Modules (Java 9+)

The Java Platform Module System (JPMS) introduced in Java 9 allows developers to organize code into modules, improving encapsulation and manageability.

#### Module Declaration

Modules are declared in a `module-info.java` file.

**Example:**

```java
module com.example.module {
    requires java.base;
    exports com.example.package;
}
```
