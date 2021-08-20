<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script type="text/javascript" src='js/out.js'></script>
		<script type="text/javascript" src='js/out2.js'></script> <!-- 자바스크립트 여러개 호출 가능 -->
		<script type="text/javascript"> /* 바로 호출 */
			div() /* 위의 out2.js 호출. 바로 호출한 곳에 불러오기로 가능 */
			alert('나는 html문서에서 실행되는 추가된 자바 스크립트@@@')
		</script>
	</head>
	<body>
		<button style="background: yellow;" onclick="add(10, 20)">더하기 기능 처리</button>
		<button style="background: pink;" onclick="minus(100, 200)">빼기 기능 처리</button>
		<button style="background: pink;" onclick="move()">이동</button>
	</body>
</html>