//Demonstrate the concept of Database Connectivity using JDBC and ODBC. 

import java.sql.*;

public class NGW_7a {
    public static void main(String[] args) {
        // JDBC variables
        String url = "jdbc:mysql://localhost:3306/testdb"; // Replace with your actual database name
        String username = "root"; // Replace with your actual username
        String password = "9933mk"; // Replace with your actual password

        // Establish the connection
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connected to the database successfully.");

            // Create a statement object to execute SQL
            Statement statement = connection.createStatement();

            // Execute a query to fetch data
            ResultSet resultSet = statement.executeQuery("SELECT * FROM users"); // Replace with your actual table name

            // Process the result set
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                System.out.println("ID: " + id + ", Name: " + name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
