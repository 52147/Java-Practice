## Modern Java Features

### Streams API

The Streams API in Java provides a functional approach to processing sequences of elements, allowing for operations such as filtering, mapping, and reducing. It was introduced in Java 8.

#### Stream Creation

Streams can be created from various sources, such as collections, arrays, or through generating methods.

**From Collections:**

```java
List<String> list = Arrays.asList("a", "b", "c");
Stream<String> stream = list.stream();
```

**From Arrays:**

```java
String[] array = {"a", "b", "c"};
Stream<String> stream = Arrays.stream(array);
```

**Generating Streams:**

```java
Stream<String> stream = Stream.of("a", "b", "c");
Stream<Double> randoms = Stream.generate(Math::random).limit(10);
Stream<Integer> iterate = Stream.iterate(0, n -> n + 1).limit(10);
```

