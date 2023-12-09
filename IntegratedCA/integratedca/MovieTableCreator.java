/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integratedca;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author morgane
 */

public class MovieTableCreator {
    private String databaseName;

       public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * @param connector
     * @param databaseName
     */
    public MovieTableCreator(DatabaseConnector connector, String databaseName) {
        this.databaseName = databaseName;
    }

 /**
 * @throws SQLException
 * 
 */
public void createMoviesTable() throws SQLException {
        String createTableSQL = generateCreateTableSQL();
        
       String connection = null;
      
            // Create the movies table if it doesn't exist
            try (Statement statement = connection.createStatement()) {
                statement.executeUpdate("CREATE TABLE IF NOT EXISTS movies (" +
                        "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                        "title TEXT NOT NULL," +
                        "rented BOOLEAN NOT NULL" +
                        ")");

         try {
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

    private void handleSQLException(String par, SQLException e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}

