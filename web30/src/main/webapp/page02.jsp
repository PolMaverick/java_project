<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	Cookie[] list = request.getCookies();
    	for(Cookie c: list){
    		if(!c.getName().equals("JSESSIONID")){
    			//out.print(c.getValue() + "<br>"); //아래 코드가 더편함
    %>
    			<%= c.getValue() %> <br>
    			
    <%
    		}
    	}
    %>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		
	</body>
</html>