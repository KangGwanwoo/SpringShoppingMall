<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

	
	<link rel="stylesheet" type="text/css" href="index_login.css">

	</style>
	</head>
	<body>
		<header>쇼핑몰</header>
		<nav class="nav">
			<span id="nav_sayHello">님 안녕하세요.</span>
			<div class = "nav_bC"><button id="put_on_record">상품등록</button></div>
			<div class = "nav_bC"><button id="put_on_record">로그아웃</button></div>
		</nav>
		<section class = "product_section">
			<header id="prodect_section_attribute">
				<div>상품이미지</div>
				<div>상품명</div>
				<div>가격</div>
				<div>판매자</div>
			</header>
				<article id="product_section_wrap">
					<div class="product_section_products">
						<img class="product_section_products_img"/ alt="product_img">
						<span  class="product_section_products_name" > 품질 좋은 상품</span>
						<span class="product_section_products_price" > 15,000</span>
						<span class="product_section_products_seller" > (주)제주대학교</span>
					</div>
				</article>
			<div id="product_section_paging"></div>
		</section>
		<footer></footer>
	</body>
</html>