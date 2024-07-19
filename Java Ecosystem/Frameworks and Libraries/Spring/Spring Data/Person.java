// Spring Data
// Spring Data simplifies data access, making it easier to implement data access layers by providing repositories.

// Repositories: Interfaces for CRUD operations.
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    // getters and setters
}

public interface PersonRepository extends JpaRepository<Person, Long> {
}
