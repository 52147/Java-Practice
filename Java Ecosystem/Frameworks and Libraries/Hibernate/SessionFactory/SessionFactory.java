// SessionFactory
// SessionFactory is used to create sessions, which are used to interact with the database.

// Configuration: Configure and build the SessionFactory.
Configuration configuration = new Configuration().configure();
SessionFactory sessionFactory = configuration.buildSessionFactory();
