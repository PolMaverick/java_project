<%@page import="shop.dto.회원bag"%>
<%@page import="shop.db.회원DAO2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	//1. 전송된 데이터 받아줘야 함
    	String id = request.getParameter("id");
    	String pw = request.getParameter("pw");
    	String name = request.getParameter("name");
    	String tel = request.getParameter("tel");
    	
    	// DAO에 보내기 위해 가방을 만들어 줘야 한다.
    	// jsp에서 자동 import: 클릭 후, 컨트롤+쉬프트+m
    	회원bag bag = new 회원bag();
    	bag.setId(id);
    	bag.setPw(pw);
    	bag.setName(name);
    	bag.setTel(tel);

    	회원DAO2 dao = new 회원DAO2();
    	int result = dao.create(bag); // 0 or 1
    	String text = "회원 가입이 실패했습니다. 재가입 해주세요";
    	if(result == 1) {
    		text = "회원 가입이 성공했습니다. 축하드립니다.";
    	}
    %>
    
<!DOCTYPE html>
	<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
		<body bgcolor="yellow">
			실행 결과는 <%= text %>
	</body>
</html>