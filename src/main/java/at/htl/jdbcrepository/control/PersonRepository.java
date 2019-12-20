package at.htl.jdbcrepository.control;

import at.htl.jdbcrepository.entity.Repository;

public class PersonRepository implements Repository {

    private static final String url = "jdbc:derby://localhost:1527/db;create=true";
    private static final String username = "app";
    private static final String password = "app";
}
