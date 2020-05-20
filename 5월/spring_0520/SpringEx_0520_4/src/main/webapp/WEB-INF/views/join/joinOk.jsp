<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>학생성적정보</h2>

<label> 학생번호 </label> ${student.stu_num} <br>
<label> 학생이름 </label> ${student.stu_name} <br>
<label> 국어 </label> ${student.kor} <br>
<label> 영어 </label> ${student.eng} <br>
<label> 수학 </label> ${student.math} <br>
<label> 합계 </label> ${student.total} <br>
<label> 평균 </label> ${student.avg} <br>



</body>
</html>