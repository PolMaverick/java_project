<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		
		<h3>로그인 화면입니다.</h3>
		<hr>
		
		<form action="logCheck.jsp">
			로그인 ID: <input type="text" name='id'><br>
			로그인 PW: <input type="text" name='pw'><br>
			<button style='color:red; background: yellow;'>로그인 처리 요청</button>
		</form>
	</body>
</html>