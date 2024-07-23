#### Functional Interfaces

Functional interfaces are interfaces with a single abstract method. They are the target types for lambda expressions and method references.

**Predicate:**

```java
Predicate<String> isEmpty = String::isEmpty;
```

**Function:**

```java
Function<String, Integer> length = String::length;
```

**Consumer:**

```java
Consumer<String> printer = System.out::println;
```

**Supplier:**

```java
Supplier<String> supplier = () -> "Hello, World!";
```
