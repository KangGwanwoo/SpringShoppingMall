<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ page session="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>구매목록</title>
	<link href="/menu.css" rel="stylesheet" type="text/css" media="all" />
</head>
<body>

	
	<div id="Header">
		구매목록
	</div>
 	<div id="Menu">
 		${sessionScope.userLoginInfo.name} 님 안녕하세요.</br>
		<a href="index_login.jeju">상품목록</a><br/>
		<a href="logOut.jeju">로그아웃</a>
	</div>
	<div id="Content">
		<table>
			<caption>구매 목록 입니다. </caption>
			<thead>
				<tr>
					<th>상품명</th>
					<th>가격</th>
					<th>판매자</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${soldProductList}" var="soldProduct">
				<tr>
					<td><a href="product_info.jeju?id=${soldProduct.productId}">${soldProduct.title}</a></td>
					<td>${soldProduct.price}</td>
					<td>${soldProduct.provider}</td>
				</tr>
				</c:forEach>
			</tbody>	
		</table>
	</div>
</body>
</html>