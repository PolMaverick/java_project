<%@page import="shop.dto.게시판bag"%>
<%@page import="java.util.ArrayList"%>
<%@page import="shop.db.게시판DAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	게시판DAO dao = new 게시판DAO();
    	ArrayList<게시판bag> list = dao.read(); // ArrayList<게시판bag>. arraylist, 게시판bag 둘다 컨트롤쉬프트m으로 임포트
    	
    %>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		전체 게시판 목록 개수 <%= list.size() %>개<br>
		<hr>
		<%= list %>
		<hr color="red">
		<%
			for(int i = 0; i < list.size(); i++) {
				게시판bag dto = list.get(i);
		%>
				게시판 id: <%= dto.getId() %><br>
				게시판 title: <%= dto.getTitle() %><br>
				게시판 content: <%= dto.getContent() %><br>
				게시판 writer: <%= dto.getWriter() %><br><br>
		<%}%> <!-- 위의 for문을 닫아주는 괄호 -->
		<hr color="blue">
		<%
			for(게시판bag dto: list) { // i값 쓸 것 아니면 foreach를 더 많이 사용
		%>
				게시판 id: <%= dto.getId() %><br>
				게시판 title: <%= dto.getTitle() %><br>
				게시판 content: <%= dto.getContent() %><br>
				게시판 writer: <%= dto.getWriter() %><br><br>
		<%}%> <!-- 위의 foreach문을 닫아주는 괄호 -->
		<hr color="green">
		<table border=1>
			<tr bgcolor="yellow">
				<th>아이디 </th>
				<th>제 목 </th>
				<th>내 용 </th>
				<th>작성자 </th>
			</tr>
			<%
				for(게시판bag dto: list) { // i값 쓸 것 아니면 foreach를 더 많이 사용
			%>
			<tr bgcolor="pink">
				<td><%= dto.getId() %></td>
				<td>
					<a href="http://localhost:8889/web26/read2.jsp?id=<%= dto.getId() %>">
						<%= dto.getTitle() %>
					</a>
				</td>	
				<td><%= dto.getContent() %></td>
				<td><%= dto.getWriter() %></td>
			</tr>
			<%}%> <!-- 위의 foreach문을 닫아주는 괄호 -->
		</table>
	</body>
</html>