<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String id2 = "root";
	String pw2 = "1234";
	String result = "로그인 실패!!!"; // else를 쓰는 것보다 default로 이렇게 해주는 것이 더 좋은 코드. else를 돌리지 않아도 되니까
	
	if(id.equals(id2) && pw.equals(pw2)){
		result = "로그인 성공!!!";
	}
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
로그인 정보가 전송되었음. <br>
서버에 도착한 ID는 <%= id %> <br>
서버에 도착한 PW는 <%= pw %> <br>
<hr>
로그인 결과는 <%= result %>
</body>
</html>