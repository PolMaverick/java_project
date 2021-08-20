<%@page import="shop.db.회원DAO2"%>
<%@page import="shop.dto.회원bag"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	String id = request.getParameter("id");
    	String name = request.getParameter("name");
    	String tel = request.getParameter("tel");
    	// DB처리하는 DAO에게 주면서 수정하는 SQL문을 만들어서 전송
    	
    	// 가방을 만들어서 데이터를 넣자.
    	회원bag bag = new 회원bag();
    	bag.setId(id);
    	bag.setName(name);
    	bag.setTel(tel);
    	
    	// DAO를 만들어서 수정요청
    	회원DAO2 dao = new 회원DAO2();
    	int result = dao.update(bag);
    	String text = "회원 수정이 실패했습니다. 다시 시도해주세요";
    	if(result == 1) {
    		text = "회원 수정이 성공했습니다. 축하드립니다.";
    	}
    	
    %>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		실행 결과는 <%= text %>
	</body>
</html>