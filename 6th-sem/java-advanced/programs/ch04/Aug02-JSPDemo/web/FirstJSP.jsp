<%-- 
    Document   : FirstJSP
    Created on : Aug 2, 2024, 9:24:06 AM
    Author     : sujal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Add </h1>
		<%! public int sum(int a, int b) {
			return a + b;
			}
		%>
		<form action="" method="post">
			First number: <input name="a" type="number" required />
			Second number: <input name="b" type="number" required />
			<input name="submit" type="submit" value="submit" />
		</form>
		<%= "Sum function example" %>
		<% 
			if(request.getMethod().equalsIgnoreCase("post")) {
			if(request.getParameter("submit") != null) {

			int a = Integer.parseInt(request.getParameter("a"));
			int b = Integer.parseInt(request.getParameter("a"));
			out.println("<br/> Sum is "+sum(a,b));
			}
			}
		%>
    </body>
</html>
