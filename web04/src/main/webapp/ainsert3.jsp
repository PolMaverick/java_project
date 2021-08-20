<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    //HttpServletRequest request = new HttpServletRequest();
    String title = request.getParameter("title");
    String demand = request.getParameter("demand");
    String name = request.getParameter("name");
    String com = request.getParameter("com");
    String tel = request.getParameter("tel");
    String sound = request.getParameter("sound");
    String[] option = request.getParameterValues("option");
    String result = "";
    if(option != null){
    	for(String s: option)
    		result += s+ " ";
    }else{
    	result = "옵션 없음";
    }
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
		서버에서 받은 요구사항: <%= demand %> <br>
		서버에서 받은 주문자 이름: <%= name %> <br>
		서버에서 받은 연락처: <%= com %>-<%= tel %> <br>
		서버에서 받은 소리: <%= sound %> <br>
		서버에서 받은 옵션: <%= result %> <br>
	</body>
</html>