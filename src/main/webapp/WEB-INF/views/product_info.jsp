<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />


	</style>
	</head>
	<body>
		<header class="product_header">
			<span id="product_header_name">${product.title}</span>
			<span><a href ="/index_login.jeju">목록</a></span>
			<span><a href ="/product_renew.jeju?id=${product.id}">수정</a></span>
		</header>
		<section class = "product_info_section">
			<img id="product_info_section_img" src="" alt="상품이미지">
			<span id="product_info_section_price">가격 : ${product.price}원</span>
			<span id="product_info_section_seller">판매자 : ${product.provider}</span>
			<button id="bt_buy">구매</button>
			<article id="product_info_description">${product.description}</article>
		</section>
		<footer></footer>
	</body>
</html>