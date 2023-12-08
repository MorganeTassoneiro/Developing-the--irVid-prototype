package integratedca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnector {

    private static final String URL = "jdbc:mysql://localhost:3306/"; // MySQL database, host and port. 
    private static final String USER = "root"; //MySQL username
    private static final String PASSWORD = "1234"; //MySQL password
    
   //create a connection to the MySQL database
         public Connection getConnection() throws SQLException{//database connection
         return DriverManager.getConnection(URL, USER, PASSWORD); 
    }
    
}