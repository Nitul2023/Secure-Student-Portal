package com.pentagon.Conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectors {

public static Connection getConnection() {
        
        // JDBC URL, username, and password
        String url = "jdbc:mysql://localhost:3306/student_portal"; // ✅ Good, specifies DB and port
        String user = "root";  // ⚠ Hardcoded credentials; consider using config file for security
        String password = "NITUL#2026@"; 
        Connection con = null;
        
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver"); // ✅ Necessary for older JDBC versions, optional in modern JDBC
            // Establish the connection
            con = DriverManager.getConnection(url, user, password); // ✅ Correct usage
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace(); // ⚠ Prints stack trace; for production, consider logging instead
        }
        
        return con; // ✅ Returns connection object; null if failed
    }
}
