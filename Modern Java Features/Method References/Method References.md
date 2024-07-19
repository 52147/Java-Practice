### Method References

Method references provide a way to refer to methods without executing them. They are a shorthand notation for lambda expressions that just call an existing method.

**Types of Method References:**

```java
// Static method
Function<Integer, String> converter = String::valueOf;

// Instance method of a particular object
Consumer<String> printer = System.out::println;

// Instance method of an arbitrary object of a particular type
Function<String, Integer> length = String::length;

// Constructor
Supplier<List<String>> listSupplier = ArrayList::new;
```
