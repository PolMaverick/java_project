<%@page import="java.sql.ResultSet"%>
<%@page import="shop.db.회원DAO2"%>
<%@page import="shop.dto.회원bag"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	String id = request.getParameter("id");
    	// DB처리하는 DAO에게 주면서 검색하는 SQL문을 만들어서 전송
    	
    	// 가방을 만들어서 데이터를 넣자.
    	회원bag bag = new 회원bag();
    	bag.setId(id);
    	
    	// DAO를 만들어서 검색요청
    	회원DAO2 dao = new 회원DAO2();
    	회원bag bag2= dao.read(bag);
    %>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h3>회원 정보 검색 결과 입니다.</h3>
		<hr>
		검색된 id는 <%= bag2.getId() %><br>
		검색된 pw는 <%= bag2.getPw() %><br>
		검색된 name는 <%= bag2.getName() %><br>
		검색된 tel는 <%= bag2.getTel() %><br>
	</body>
</html>