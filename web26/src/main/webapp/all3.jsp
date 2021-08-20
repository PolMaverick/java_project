<%@page import="shop.dto.ProductDTO"%>
<%@page import="shop.db.ProductDAO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	ProductDAO dao = new ProductDAO();
    	ArrayList<ProductDTO> list = dao.read(); // ArrayList<게시판bag>. arraylist, 게시판bag 둘다 컨트롤쉬프트m으로 임포트
    	
    %>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		전체 상품 목록 개수 <%= list.size() %>개<br>
		<hr>
		<%= list %>
		<hr color="red">
		<%
			for(int i = 0; i < list.size(); i++) {
				ProductDTO dto = list.get(i);
		%>
				상품 id: <%= dto.getId() %><br>
				상품 name: <%= dto.getName() %><br>
				상품 content: <%= dto.getContent() %><br>
				상품 price: <%= dto.getPrice() %><br><br>
		<%}%> <!-- 위의 for문을 닫아주는 괄호 -->
		<hr color="blue">
		<%
			for(ProductDTO dto: list) { // i값 쓸 것 아니면 foreach를 더 많이 사용
		%>
				상품 id: <%= dto.getId() %><br>
				상품 name: <%= dto.getName() %><br>
				상품 content: <%= dto.getContent() %><br>
				상품 price: <%= dto.getPrice() %><br><br>
		<%}%> <!-- 위의 foreach문을 닫아주는 괄호 -->
		<hr color="green">
		<table border=1>
			<tr bgcolor="yellow">
				<th>아이디 </th>
				<th>상품명 </th>
				<th>내 용 </th>
				<th>가 격 </th>
			</tr>
			<%
				for(ProductDTO dto: list) { // i값 쓸 것 아니면 foreach를 더 많이 사용
			%>
			<tr bgcolor="pink">
				<td><%= dto.getId() %></td>
				<td>
					<a href="http://localhost:8889/web26/read3.jsp?id=<%= dto.getId() %>">
						<%= dto.getName() %>
					</a>
				</td>	
				<td><%= dto.getContent() %></td>
				<td><%= dto.getPrice() %></td>
			</tr>
			<%}%> <!-- 위의 foreach문을 닫아주는 괄호 -->
		</table>
	</body>
</html>