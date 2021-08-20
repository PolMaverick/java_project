<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	session.setAttribute("count", 100); // object(big) <--변환-- int(s). 작은 애가 들어가니 자동으로 들어간다.
    	
    %>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		현재 count: <%= session.getAttribute("count") %> <!-- 표현식에서는 ;를 사용하지 않는다 -->
		<hr>
		<a href="page04.jsp">카운트값 증가 후 다시 세션 저장</a>
		<a href="page05.jsp">카운트값 확인</a>
	</body>
</html>