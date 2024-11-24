//Demonstrate the concept of Database to web connectivity. 

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class NGW_8a extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set content type to HTML
        response.setContentType("text/html");

        // Database connection
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "password");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM employees")) {
            
            // Set the ResultSet as an attribute in the request
            request.setAttribute("resultSet", rs);
            
            // Forward the request to the JSP page for rendering
            request.getRequestDispatcher("NGW_8b.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();  // Handle exceptions
        }
    }
}
