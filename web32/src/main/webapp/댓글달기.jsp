<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
		<script type="text/javascript">
			$(function() {
				$('#b1').click(function() {
					contentValue = $('#content').val()
					result1Tag = $('#result1')
					result1Tag.append(contentValue + '<br>')
				})
			})
		</script>
	</head>
	<body>
		댓글입력: <input id='content'>
		<button id=b1>입력값 읽어서 처리</button>
		<hr color=red>
		<div id='result1'></div>
	</body>
</html>