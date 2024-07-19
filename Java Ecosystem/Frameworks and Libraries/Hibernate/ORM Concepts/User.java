// Hibernate
// ORM Concepts
// Hibernate is an Object-Relational Mapping (ORM) framework that maps Java objects to database tables and vice versa.

// Entity: A Java class that maps to a database table.
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;

    // getters and setters
}
