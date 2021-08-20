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
			<div id="center">
				게시판 전체 목록 들어가는 부분.
			</div>
		</div>
	</body>
</html>