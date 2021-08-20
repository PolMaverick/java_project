<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	int count = (int)session.getAttribute("count"); // 이번엔 object(big) --강제변환(int)--> int(small).
    	count++;
    	session.setAttribute("count", count);
    %>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		현재 count: <%= session.getAttribute("count") %> <!-- 표현식에서는 ;를 사용하지 않는다 -->
		<a href="page04.jsp">카운트값 증가 후 다시 세션 저장</a>
	</body>
</html>