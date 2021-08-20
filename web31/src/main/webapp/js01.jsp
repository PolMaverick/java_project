<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
 //alert('tern project')
 function idCheck() {
	//1. id에 입력한 값 가지고 와야 함.
	//1-1. id가 "id"인 input태그를 먼저 찾아야 함.
	idTag = document.getElementById("id"); // <input name="id" id="id" value="test"> 까지 인식
	//1-2. 그태그내에 있는 VALUE값을 가지고 면 됨.
	idValue = idTag.value; // value="test"
	alert('id is>> ' + idValue);
	//2. 값의 글자수를 세야함.
	alert('id length>> ' + idValue.length);
	//3. 5글자 이상이 아닌 경우, 메시지를 보여주어야 함.
	result = "";
	if (idValue.length >= 5) {
		result = "5글자 이상입니다. 유효합니다."
	} else {
		result = "5글자 미만입니다. 재입력해주세요."
	}
	divTag = document.getElementById("result"); // <div id="result></div> 까지 인식
	divTag.innerHTML = result;
}
 
 function pwCheck() {
	pw1Tag = document.getElementById("pw1"); // pw1은 id. 태그만 가져온것 
	pw2Tag = document.getElementById("pw2"); // pw2는 id. 태그만 가져온것 
	pw1Value = pw1Tag.value; // value 값 꺼내오기
	pw2Value = pw2Tag.value; // value 값 꺼내오기
	result = "비밀번호가 동일하지 않습니다.<img src=img/no.jpg>";
	if (pw1Value == pw2Value) {
		result = "비밀번호가 동일합니다.<img src=img/ok.jpg>";
	}
	resultTag = document.getElementById("result");
	resultTag.innerHTML = result;
	pw1Tag.value = "";
	pw2Tag.value = "";
}
</script>
</head>
<body>
<h3>자바 스크립트 테스트</h3>
<hr>
아이디:  <input name="id" id="id" value="test">
<button onclick="idCheck()" id="b1" style="color:blue; background:pink; width:100px; height:25px">글자수 체크</button><br>
패스워드 :  <input name="pw1" id="pw1"> <br>
패스워드2 :  <input name="pw2" id="pw2">
<button onclick="pwCheck()" id="b2" style="color:white; background:lime; width:200px; height:25px">패스워드 동일 여부 체크</button><br>
<hr>
<div id="result" style="color:red; background:yellow; width:500px; height:50px; font-size:30px"></div>
</body>
</html>