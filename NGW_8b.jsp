<%@ page import="java.sql.*" %>
<html>
<head>
    <title>Employee List</title>
</head>
<body>
    <h1>Employees</h1>
    <table border="1">
        <tr><th>ID</th><th>Name</th><th>Position</th></tr>
        <%
        // Retrieve the ResultSet from the request
        ResultSet rs = (ResultSet) request.getAttribute("resultSet");
        
        // Loop through the ResultSet and display employee data
        while (rs.next()) {
            out.println("<tr><td>" + rs.getInt("id") + "</td><td>" + rs.getString("name") + "</td><td>" + rs.getString("position") + "</td></tr>");
        }
        %>
    </table>
</body>
</html>
