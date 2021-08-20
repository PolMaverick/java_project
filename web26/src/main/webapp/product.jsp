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
				<h3>상품 검색 </h3>
				<form action="read3.jsp">
					ID: <input name = "id"><br>
		   			<button>상품 하나 검색 처리</button>
				</form>
				<a href="all3.jsp">상품 모든 목록 가지고 오는 페이지 호출</a>
			</div>
		</div>
	</body>
</html>