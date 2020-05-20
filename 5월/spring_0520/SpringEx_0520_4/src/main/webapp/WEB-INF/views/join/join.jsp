<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보</title>
</head>
<body>


<h2>학생성적입력</h2>


<form action="joinOk" method="get">


<label> 학생번호 </label> <input type="text" name="stu_num"><br>
<label> 학생이름 </label> <input type="text" name="stu_name"><br>
<label> 국어 </label> <input type="text" name="kor"><br>
<label> 영어 </label> <input type="text" name="eng"><br>
<label> 수학 </label> <input type="text" name="math"><br>
<label> 합계 </label> <input type="text" name="total"><br>
<label> 평균 </label> <input type="text" name="avg"><br>

<input type="submit" value="입력"> 
<input type="reset" value="취소">


</form>


</body>
</html>