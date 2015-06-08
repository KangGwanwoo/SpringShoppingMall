<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ page session="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>장바구니</title>
	<link href="/menu.css" rel="stylesheet" type="text/css" media="all" />
</head>
<body>

	
	<div id="Header">
		장바구니
	</div>
 	<div id="Menu">
 		${sessionScope.userLoginInfo.name} 님 안녕하세요.</br>
		<a href="index.jeju">상품목록</a><br/>
		<a href="logOut.jeju">로그아웃</a>
	</div>
	<div id="Content">
		<table>
			<caption>장바구니 목록 입니다. </caption>
			<thead>
				<tr>
					<th>상품명</th>
					<th>가격</th>
					<th>판매자</th>
					<th>관리</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${shoppingBasketList}" var="shoppingBasket">
				<tr>
					<td><a href="product_info.jeju?id=${shoppingBasket.productId}">${shoppingBasket.title}</a></td>
					<td>${shoppingBasket.price}</td>
					<td>${shoppingBasket.provider}</td>
					<td><a href="deleteShoppinglist.jeju?userId=${shoppingBasket.userId}&productId=${shoppingBasket.productId}">주문 취소</a></td>
				</tr>
				</c:forEach>
			</tbody>	
		</table>
	</div>
</body>
</html>