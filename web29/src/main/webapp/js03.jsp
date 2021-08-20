<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script type="text/javascript">
			num1 = prompt('첫번째 숫자를 넣어주세요')
			num2 = prompt('두번째 숫자를 넣어주세요')
			
			num3 = parseInt(num1)
			num4 = parseInt(num2)
			
			sum = num3 + num4
			sub = num3 - num4
			mul = num3 * num4
			di = num3 / num4
			alert('두 수의 더하기는 ' + sum + '입니다.')
			alert('두 수의 빼기는 ' + sub + '입니다.')
			alert('두 수의 곱하기는 ' + mul + '입니다.')
			alert('두 수의 나누기는 ' + di + '입니다.')
		</script>
	</head>
	<body>
		
	</body>
</html>