/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integratedca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author morgane 2021327
 */
   

public class DatabaseConnector {

    private static final String URL = "jdbc:mysql://localhost:3306/"; // MySQL database, host and port. 
    private static final String USER = "root"; //MySQL username
    private static final String PASSWORD = "1234"; //MySQL password
    
   //create a connection to the MySQL database
         public Connection getConnection() throws SQLException{//database connection
         return DriverManager.getConnection(URL, USER, PASSWORD); 
    }
    
}
    
