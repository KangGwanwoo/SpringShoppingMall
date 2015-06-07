<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>상품 수정</title>
	<link href="/menu.css" rel="stylesheet" type="text/css" media="all" />
</head>
<body>
	<div id="Content">
		<form action="buyProduct" method="post">
			<fieldset>
				<legend>상품 정보</legend>
				<p>
				<a href="/index_nonelogin.jeju"><input type="button" value="목록 "/></a>
				<c:if test="${sessionScope.userLoginInfo.userId==product.provider}">
  				<a href="/product_renew.jeju?id=${product.id}"><input type="button" value="수정 "/></a>
				</c:if>
				</p>
				<p>
					<label>상품명</label>
					<input type="text" name="title" value="${product.title}"  readonly/>
				</p>
				<p>
					<label>가격</label>
					<input type="text" name="price" value="${product.price}" readonly/>
				</p>
				<p>
					<label>판매자</label>
					<input type="text" name="provider" value="${product.provider}" readonly/>
				</p>
				<p>
					<label>상품상세설명</label>
					<input type="text" name="description" value="${product.description}" readonly/>
				</p>
				<p>
					<input type="submit" value="구매" />
					
				</p>
			</fieldset>
		</form>
	</div>
</body>
</html>