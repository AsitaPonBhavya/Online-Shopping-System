package cn.ecart.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbCon {
    private static Connection connection = null;
    
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        if (connection == null) {
            // Load the PostgreSQL JDBC Driver
            Class.forName("org.postgresql.Driver");
            
            // Update the connection string for PostgreSQL
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/shopping", "postgres", "Asita@#java");
            
            System.out.print("connected");
        }
        return connection;
    }
}