// HQL (Hibernate Query Language)
// HQL is a query language similar to SQL but operates on Hibernate's entity objects rather than directly on database tables.

// Querying: Creating and executing HQL queries.
Session session = sessionFactory.openSession();
String hql = "FROM User WHERE username = :username";
Query query = session.createQuery(hql);
query.setParameter("username", "john_doe");
List<User> users = query.list();
