#### Intermediate Operations

Intermediate operations return a new stream and are used to transform or filter the stream's elements.

**filter:**

```java
Stream<String> filtered = stream.filter(s -> s.startsWith("a"));
```

**map:**

```java
Stream<Integer> mapped = stream.map(String::length);
```

**sorted:**

```java
Stream<String> sorted = stream.sorted();
Stream<String> sortedByLength = stream.sorted(Comparator.comparingInt(String::length));
```

**distinct:**

```java
Stream<String> distinct = stream.distinct();
```

**limit:**

```java
Stream<String> limited = stream.limit(2);
```

**skip:**

```java
Stream<String> skipped = stream.skip(1);
```
