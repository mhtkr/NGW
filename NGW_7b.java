import java.sql.*;

public class NGW_7b {
    public static void main(String[] args) {
        String dsn = "jdbc:odbc:myDSN"; // Replace with your actual ODBC Data Source Name
        String user = "root"; // Replace with your actual database username
        String password = "password"; // Replace with your actual database password

        try {
            // Establish the ODBC connection
            Connection conn = DriverManager.getConnection(dsn, user, password);
            
            // Create a statement
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM employees"; // Replace with your actual table name

            // Execute query and process the result
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name"));
            }

            // Close connections
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
