<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>학생성적입력</h2>


<form action="formOk3" method="post">

<label> 번호 </label> <input type="text" name="num"><br>
<label> 제목  </label> <input type="text" name="title"><br>
<label> 내용 </label> <input type="text" name="content"><br>
<label> 날짜 </label> <input type="text" name="date"><br>
<label> 그룹 </label> <input type="text" name="group"><br>
<label> step </label> <input type="text" name="step"><br>
<label> indent </label> <input type="text" name="indent"><br>

<input type="submit" value="입력"> 
<input type="reset" value="취소">



</body>
</html>