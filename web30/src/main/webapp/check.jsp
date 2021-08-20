<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String id = request.getParameter("id");
    	String pw = request.getParameter("pw");
    	String id2 = "root";
    	String pw2 = "1234";
    	
    	String result = "로그인 실패";
    	if(id.equals(id2) && pw.equals(pw2)){
    		result = "로그인 성공";
    		session.setAttribute("id", id);
    	} else{
    		out.print("다시 로그인 해주세요<br>");
    	}
    %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		로그인 결과: <%= result %> 
		<% if(session.getAttribute("id") != null) { %>
			<%= session.getAttribute("id") %>님이 로그인 하셨습니다.
		<% } %>
		<hr>
		<form action="news.jsp">
			<button style='color:green; background: lightblue;'>뉴스</button>
		</form>
		<form action="mail.jsp">
			<button style='color:green; background: lightblue;'>메일</button>
		</form>
		<form action="cafe.jsp">
			<button style='color:green; background: lightblue;'>카페</button>
		</form>
	</body>
</html>