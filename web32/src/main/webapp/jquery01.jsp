<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript"> /* jquery랑 따로 script를 만들어줘야 한다. */
	$(function() { // document를 ram에 dom tree로 다 읽어들였으면! document.ready()
		$('#b1').click(function() { /* #id명을 적으면 b1을 선택한다는 의미 */
			alert("버튼1을 클릭하셨군요")
		})
		$('#b2').click(function() { /* #id명을 적으면 b2을 선택한다는 의미 */
			alert("버튼2를 클릭하셨군요")
		})
		$('#b3').click(function() { /* #id명을 적으면 b2을 선택한다는 의미 */
			alert("버튼3를 클릭하셨군요")
		})
	})
</script>

</head>
<body>
	<button id=b1>push me</button>
	<button id=b2>push me2</button>
	<button id=b3>push me3</button>
</body>
</html>