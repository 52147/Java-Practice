### Lambda Expressions

Lambda expressions in Java provide a way to write anonymous methods that can be passed as arguments to methods or stored in variables. They are a key part of Java's functional programming capabilities introduced in Java 8.

#### Syntax and Use Cases

**Basic Syntax:**

```java
(parameters) -> expression
(parameters) -> { statements; }
```

**Examples:**

```java
// No parameters
Runnable r = () -> System.out.println("Hello, world!");

// Single parameter
Consumer<String> c = s -> System.out.println(s);

// Multiple parameters
BinaryOperator<Integer> add = (a, b) -> a + b;
```

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
