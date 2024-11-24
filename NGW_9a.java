//Demonstrate the concept of Servlets.

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class NGW_9a extends HttpServlet {
    // This method is called to handle the GET request
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set response content type to HTML
        response.setContentType("text/html");

        // Write the HTML response
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Hello, Welcome to Servlet Demonstration!</h1>");
        out.println("</body></html>");
    }
}
