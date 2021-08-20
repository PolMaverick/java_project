<%@page import="shop.dto.게시판bag"%>
<%@page import="shop.db.게시판DAO"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="shop.db.회원DAO2"%>
<%@page import="shop.dto.회원bag"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	String id = request.getParameter("id");
    	// DB처리하는 DAO에게 주면서 검색하는 SQL문을 만들어서 전송
    	
    	// 가방을 만들어서 데이터를 넣자.
    	게시판bag bag = new 게시판bag();
    	bag.setId(id);
    	
    	// DAO를 만들어서 검색요청
    	게시판DAO dao = new 게시판DAO();
    	게시판bag bag2= dao.read(bag);
    %>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h3>게시물 정보 검색 결과 입니다.</h3>
		<hr color="green">
		<table border="1">
			<tr>
				<td>검색된 id는 <%= bag2.getId() %><br></td>
				<td>검색된 title은 <%= bag2.getTitle() %><br></td>
				<td>검색된 content는 <%= bag2.getContent() %><br></td>
				<td>검색된 writer는 <%= bag2.getWriter() %><br></td>
			</tr>
		</table>
	</body>
</html>