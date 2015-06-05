<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

	
	<link rel="stylesheet" type="text/css" href="index_login.css">

	</style>
	</head>
	<body>
		<header><span id="header_info">###님의 장바구니</span></header>
		<section class = "product_section">
			<header id="prodect_section_attribute">
				<span>상품이미지</span>
				<span>상품명</span>
				<span>가격</span>
				<span>판매자</span>
			</header>
			<article id="product_section_wrap">
				<div class="product_section_products">
					<img class="product_section_products_img"/ alt="product_img">
					<span class="product_section_products_name" > 품질 좋은 상품</span>
					<span class="product_section_products_price" > 15,000</span>
					<span class="product_section_products_seller" > (주)제주대학교</span>
					<button id="product_section_products_bt">주문취소</button>
				</div>
			</article>
			<div id="product_section_total">총가격 : </div>
		</section>
		<footer></footer>
	</body>
</html>