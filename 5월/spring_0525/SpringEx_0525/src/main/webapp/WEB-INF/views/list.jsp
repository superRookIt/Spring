<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>

<html>


<head>
<meta charset="UTF-8">
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link
	href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:400,500,700,900&display=swap&subset=korean"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css">
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/notice_list.css">
<title>Insert title here</title>
</head>


<body>

	<section>

		<h1>NOTICE</h1>


		<div class="wrapper">

			<form action="/search" name="search" method="post">

				<select name="category" id="category">
					<option value="0">전체</option>
					<option value="title">제목</option>
					<option value="content">내용</option>
				</select>

				<div class="title">
					<input type="text" size="16">
				</div>

				<button type="submit">
					<i class="fas fa-search"></i>
				</button>

			</form>
		</div>



		<table>

			<colgroup>
				<col width="18%">
				<col width="28%">
				<col width="18%">
				<col width="10%">
			</colgroup>

			<tr>

				<th>No.</th>
				<th>제목</th>
				<th>작성일</th>
				<th>작성자</th>
				<th>조회수</th>
			</tr>

			<c:forEach var="dto" items="${list }">

				<tr>
					<td>${dto.bId }</td>
					
					<td class="table-title">
					<c:forEach begin="1" end="${dto.bIndent }">▶</c:forEach>
					<a href="content_view?bId=${dto.bId }">${dto.bTitle }</a>
					</td>
					
					<td>${dto.bDate}</td>
					<td>${dto.bName}</td>
					<td>${dto.bHit }</td>

				</tr>

			</c:forEach>

		</table>


		<ul class="page-num">
			<li class="first"></li>
			<li class="prev"></li>
			<li class="num">
				<div>1</div>
			</li>
			<li class="next"></li>
			<li class="last"></li>
		</ul>


		<a href="write_view.do"><div class="write">쓰기</div></a>


	</section>

</body>
</html>