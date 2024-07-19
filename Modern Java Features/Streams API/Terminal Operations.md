#### Terminal Operations

Terminal operations produce a result or a side effect and terminate the stream pipeline.

**forEach:**

```java
stream.forEach(System.out::println);
```

**collect:**

```java
List<String> collected = stream.collect(Collectors.toList());
Set<String> collectedSet = stream.collect(Collectors.toSet());
```

**reduce:**

```java
Optional<String> reduced = stream.reduce((s1, s2) -> s1 + s2);
```

**toArray:**

```java
String[] array = stream.toArray(String[]::new);
```

**count:**

```java
long count = stream.count();
```

**anyMatch:**

```java
boolean anyMatch = stream.anyMatch(s -> s.startsWith("a"));
```

**allMatch:**

```java
boolean allMatch = stream.allMatch(s -> s.length() == 1);
```

**noneMatch:**

```java
boolean noneMatch = stream.noneMatch(s -> s.isEmpty());
```

