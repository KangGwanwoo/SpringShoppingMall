<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>사용자 등록</title>
	<link href="/menu.css" rel="stylesheet" type="text/css" media="all" />
</head>
<body>
	<div id="Header">
		사용자 관리
	</div>
<!-- 	<div id="Menu">
		<a href="list">목록보기</a><br/>
		<a href="create.jeju">등록하기</a>
	</div> -->
	<div id="Content">
		<table>
			<caption>강관우 쇼핑몰</caption>
			<thead>
				<tr>
					<th>상품명</th>
					<th>가격</th>
					<th>판매자</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${productList}" var="product">
				<tr>
					<td><a herf="info?id=${product.id}">${product.title}</a></td>
					<td>${product.price}</td>
					<td>${product.provider}</td>
				</tr>
				</c:forEach>
			</tbody>	
		</table>
	</div>
</body>
</html>