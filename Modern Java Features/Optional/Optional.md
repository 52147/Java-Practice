### Optional

The `Optional` class in Java 8 provides a container object which may or may not contain a non-null value. It is used to avoid null checks and `NullPointerException`.

**Creating Optionals:**

```java
Optional<String> optional = Optional.of("value");
Optional<String> emptyOptional = Optional.empty();
Optional<String> nullableOptional = Optional.ofNullable(null);
```

**Using Optionals:**

```java
optional.ifPresent(System.out::println);
String value = optional.orElse("default");
String value = optional.orElseGet(() -> "default");
optional.orElseThrow(() -> new IllegalArgumentException("Value is missing"));
```

