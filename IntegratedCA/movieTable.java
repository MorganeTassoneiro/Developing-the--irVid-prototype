package integratedca;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class MovieTableCreator {
    private final DatabaseConnector connector;

    // CONSTRUCTOR
    public MovieTableCreator(String databaseName, DatabaseConnector connector) {
        this.connector = connector;
        this.databaseName = databaseName;
    }

    public void createMoviesTable() {

       // Create the movies table if it doesn't exist
            try (Statement statement = connection.createStatement()) {
                statement.executeUpdate("CREATE TABLE IF NOT EXISTS movies (" +
                        "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                        "title TEXT NOT NULL," +
                        "rented BOOLEAN NOT NULL" +
                        ")");

            }
    
}
