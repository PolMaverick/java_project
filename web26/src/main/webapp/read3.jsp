<%@page import="shop.db.ProductDAO"%>
<%@page import="shop.dto.ProductDTO"%>
<%@page import="java.sql.ResultSet"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	String id = request.getParameter("id");
    	// DB처리하는 DAO에게 주면서 검색하는 SQL문을 만들어서 전송
    	
    	// 가방을 만들어서 데이터를 넣자.
    	
    	ProductDTO dto = new ProductDTO();
    	dto.setId(id);
    	
    	// DAO를 만들어서 검색요청
    	ProductDAO dao = new ProductDAO();
    	ProductDTO dto2= dao.read(dto);
    %>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h3>상품 정보 검색 결과 입니다.</h3>
		<hr color="green">
		<table border="1">
			<tr>
				<td>검색된 id는 <%= dto2.getId() %><br></td>
				<td>검색된 name은 <%= dto2.getName() %><br></td>
				<td>검색된 content는 <%= dto2.getContent() %><br></td>
				<td>검색된 price는 <%= dto2.getPrice() %><br></td>
			</tr>
		</table>
	</body>
</html>