<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" href='css/js07.css'>
		<script type="text/javascript">
			function login() {
				id1 = prompt('아이디를 입력해주세요.')
				pw1 = prompt('패스워드를 입력해주세요.')
				
				id2 = 'root'
				pw2 = '1234'
				
				if (id1 == id2 && pw1 == pw2) {
					location.href = 'http://www.naver.com'
				} else {
					location.href = 'http://www.daum.net'
				}
			}
			
			function pay() {
				total = 1000
				rank = prompt('일반 회원이시면 1, VIP 회원이시면 2를 입력해주세요')
				
				if (rank == 1) {
					normal = total * 1.1
					alert('결제 금액은 ' + normal + '원입니다.')
				} else if (rank == 2) {
					vip = total * 0.9
					alert('결제 금액은 ' + vip + '원입니다.')
				} else {
					alert('다시 입력해주세요')
				}
			}

		</script>
	</head>
	<body>
		<button onclick="login()">로그인</button>
		<button onclick="pay()">결제</button>
	</body>
</html>