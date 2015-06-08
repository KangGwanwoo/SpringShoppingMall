<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ page session="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>사용자 등록</title>
	<link href="/menu.css" rel="stylesheet" type="text/css" media="all" />
</head>
<body>

	
	<div id="Header">
		쇼핑몰 솔루션
	</div>
 	<div id="Menu">
 		${sessionScope.userLoginInfo.name} 님 안녕하세요.</br>
 		<c:if test="${sessionScope.userLoginInfo.authority=='seller'}">
  				<a href="product_regist.jeju">상품등록</a><br/>
		</c:if>
		<a href="purchaseList.jeju">내 구매목록</a><br/>
		<a href="shoppingBasketList.jeju">장바구니</a><br/>
		<a href="logOut.jeju">로그아웃</a>
	</div>
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
					<td><a href="product_info.jeju?id=${product.id}">${product.title}</a></td>
					<td>${product.price}</td>
					<td>${product.provider}</td>
				</tr>
				</c:forEach>
			</tbody>
			<tfoot>
				<tr>
				<td></td>
				<td>
				<c:if test="${start-1==0}">
				</c:if>
				<c:if test="${start-1!=0}">
				<span><a href="indexPage.jeju?seq=${start-1}">&laquo;</a></span>
				</c:if>
				<c:forEach var="i" begin="${start}" end="${end}">
				<span><a href="indexPage.jeju?seq=${i}">${i}</a></span>
				</c:forEach>
				<c:if test="${end%5==0 && pageNum>end}">
				<span><a href="indexPage.jeju?seq${end+1}">&raquo;</a></span>
				</c:if>
				</td>
				<td></td>
				</tr>
			</tfoot>	
		</table>

	</div>
</body>
</html>