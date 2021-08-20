<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" href="css/out.css">
	</head>
	<body>
		<div id="total"> <!-- 나눠주는 역할만. div만으로는 사람만 인식할 뿐 인식 못함. css로 잡아줘야 함. -->
			<div id="top">
				<jsp:include page="top.jsp"></jsp:include>
			</div>
			<div id="top2">
				<jsp:include page="top2.jsp"></jsp:include>
			</div>
			<div id="center"> <!-- member.jsp ->  insert.jsp -> 회원dao2(브라우저에서 받은거 확인, jdbc4단계) -> DB로 전송 -->
				<form action="insert.jsp">
					ID: <input name = "id"><br>
					PW: <input name = "pw"><br>
					이름: <input name = "name"><br>
					tel: <input name = "tel"><br>
					<button>회원가입 처리</button>
				</form>
			</div>
		</div>
	</body>
</html>