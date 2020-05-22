<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">


	function check() {

		alert('확인하기');
		return false;
		
	}
	
	
</script>

</head>
<body>

<h2>학생정보</h2>

<form action="formOk">

<label>학번</label><input type="text" name="num"><br>
<label>이름</label><input type="text" name="name"><br>
<label>학과</label><input type="text" name="major"><br>
<label>연락처</label><input type="text" name="tel"><br>

<button onclick="check()"></button>
<input type="reset" value="취소">

</form>

</body>
</html>