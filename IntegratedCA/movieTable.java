package integratedca;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class MovieTableCreator {
    private final DatabaseConnector connector;

       public MovieTableCreator(DatabaseConnector connector, String databaseName) {
        this.connector = connector;
        this.databaseName = databaseName;
    }

 public void createMoviesTable() {
        String createTableSQL = generateCreateTableSQL();
        
       // Create the movies table if it doesn't exist
            try (Statement statement = connection.createStatement()) {
                statement.executeUpdate("CREATE TABLE IF NOT EXISTS movies (" +
                        "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                        "title TEXT NOT NULL," +
                        "rented BOOLEAN NOT NULL" +
                        ")");

         try (Connection connection = connector.getConnection(); 
             Statement statement = connection.createStatement()) {
            statement.executeUpdate(createTableSQL);
            System.out.println("Successfully created.");
        } catch (SQLException e) {
            handleSQLException("An error was made: " + e.getMessage(), e);
            }
        }
    }
}
    private void handleSQLException(String errorMessage, SQLException e) {
        System.out.println(errorMessage);
        e.printStackTrace();
    }




