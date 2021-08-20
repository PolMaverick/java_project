<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>  
<!-- 1. 서버로 전송된 데이터를 받아야 함. 자바 필요. 넣어주기 -->
<%
 	// 자바코드 써주는 기호
	// HttpServletRequest request = new HttpServletRequest();
	String id = request.getParameter("id"); //apple
	String pw = request.getParameter("pw"); //1234
	String name = request.getParameter("name"); //apple
	String tel = request.getParameter("tel"); //011
%>
    <!-- 2. DB에 넣어야함. 자바 필요. DAO -->
    <!-- 3. DB 처리가 잘 되었는지 확인하는 메세지를 클라이언트에 보내주어야 함. 3번이 이 아래 코드들 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
회원 정보가 잘 도착하였음.<br>
서버에 도착한 ID는 <%= id %> <br>
서버에 도착한 PW는 <%= pw %> <br>
서버에 도착한 이름은 <%= name %> <br>
서버에 도착한 전화번호는 <%= tel %> <br>
</body>
</html>