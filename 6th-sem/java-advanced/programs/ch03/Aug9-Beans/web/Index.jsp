<%-- 
    Document   : Index
    Created on : Aug 9, 2024, 10:40:45 AM
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
        <h1>Hello World!</h1>
		<jsp:useBean id="student" class="beans.StudentBean" >
			<jsp:setProperty name="student" property="id" value="1"/>
			<jsp:setProperty name="student" property="name" value="John"/>
			<jsp:setProperty name="student" property="address" value="KTM"/>
		</jsp:useBean>

		ID: <jsp:getProperty name="student" property="id" />
		Name: <jsp:getProperty name="student" property="name" />
		Address: <jsp:getProperty name="student" property="address" />
    </body>
</html>
