package integratedca;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import integratedca.DatabaseConnector;

public class MovieTableCreator {
    private final DatabaseConnector connector;
    private String databaseName;

       /**
     * @param connector
     * @param databaseName
     */
    public MovieTableCreator(DatabaseConnector connector, String databaseName) {
        this.connector = connector;
        this.databaseName = databaseName;
    }

 /**
 * 
 */
public void createMoviesTable() {
        String createTableSQL = generateCreateTableSQL();
        
       Connection connection;
            // Create the movies table if it doesn't exist
            try (Statement statement = connection.createStatement()) {
                statement.executeUpdate("CREATE TABLE IF NOT EXISTS movies (" +
                        "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                        "title TEXT NOT NULL," +
                        "rented BOOLEAN NOT NULL" +
                        ")");

         try (Connection Connection = connector.getConnection(); 
             Statement Statement = connection.createStatement()) {
            statement.executeUpdate(createTableSQL);
            System.out.println("Successfully created.");
        } catch (SQLException e) {
            handleSQLException("An error was made: " + e.getMessage(), e);
            }
        }
    }
private String generateCreateTableSQL() {
    return null;
}
}
    private void handleSQLException(String errorMessage, SQLException e) {
        System.out.println(errorMessage);
        e.printStackTrace();
    }




