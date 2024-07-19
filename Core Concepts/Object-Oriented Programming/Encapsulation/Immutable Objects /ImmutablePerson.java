// Details on Immutable Objects
// Definition:

// An immutable object is an object whose state cannot be modified after it is created.
// Characteristics of Immutable Objects:

// All fields are final and set during object construction.
// No setters or other methods that modify fields.
// The class itself can be declared as final to prevent subclassing (optional but recommended).

// Benefits of Immutable Objects:

// Thread-safety: Immutable objects can be shared between threads without synchronization.
// Simplicity: Easier to understand and reason about since their state does not change.
// Caching: Safe to cache and reuse since they cannot be altered.
// Example:
public final class ImmutablePerson {
    private final String name;
    private final int age;

    public ImmutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
// Creating Immutable Collections:

// Use Collections.unmodifiableList, Collections.unmodifiableMap, etc.
List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));
List<String> immutableList = Collections.unmodifiableList(list);
