<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    //HttpServletRequest request = new HttpServletRequest();
    String title = request.getParameter("title");
    String author = request.getParameter("author");
    String text = request.getParameter("text");
    String category = request.getParameter("category");
    String dep = request.getParameter("dep");
    String days = request.getParameter("days");
    %>
<!DOCTYPE html>
	<html>
	<head>
		<meta charset="UTF-8">
		<title>서버에서 받은 값들 정리</title>
	</head>
	<body>
		<h3>서버에서 받은 값들 정리</h3>
		<hr color="pink">
		서버에서 받은 제목: <%= title %> <br>
		서버에서 받은 글쓴이: <%= author %> <br>
		서버에서 받은 내용: <%= text %> <br>
		서버에서 받은 종류: <%= category %> <br>
		서버에서 받은 부서: <%= dep %> <br>
		서버에서 받은 날짜: <%= days %> <br>
	</body>
</html>