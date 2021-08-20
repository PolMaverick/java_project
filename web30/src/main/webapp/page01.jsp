<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	// 쿠키 바로 삭제는 setMaxAge(0)으로 다시 심는다.
    	// 1. 쿠키객체를 만든다. 두개 만든다.
    	Cookie c1 = new Cookie("category", "운동");
    	Cookie c2 = new Cookie("type", "축구");
    	// 2. 쿠리를 브라우저에 심는다.
    	response.addCookie(c1);
    	response.addCookie(c2);
    %>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		saved in browser <a href="page02.jsp">쿠키 확인하러 가기</a>
	</body>
</html>