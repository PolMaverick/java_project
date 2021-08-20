<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	//누가, 얼마나, 무엇을
    	String productId = request.getParameter("productId");
    	String productName = request.getParameter("productName");
    	String total = request.getParameter("total");
    	String uId = request.getParameter("uId");
    	String dateTime = request.getParameter("dateTime");
    	
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%= uId %>님의 결제 내역은 아래와 같습니다.
<hr>
<%= dateTime.substring(0,24) %><br>
구매하신 상품 ID: <%= productId %> <br>
구매하신 상품 name: <%= productName %> <br>
결제하신 total: <%= total %> <br>
</body>
</html>