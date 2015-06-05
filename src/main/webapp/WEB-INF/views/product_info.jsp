<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />


	</style>
	</head>
	<body>
		<header class="product_header">
			<span id="product_header_name">품질좋은 상품</span>
			<button class ="product_header_bt" id="bt_list">목록</button>
			<button class ="product_header_bt" id="bt_modify">수정</button>
		</header>
		<section class = "product_info_section">
			<img id="product_info_section_img" src="" alt="상품이미지">
			<span id="product_info_section_price">가격 : 15,000원</span>
			<span id="product_info_section_seller">판매자 : 제주대학교</span>
			<button id="bt_buy">구매</button>
			<article id="product_info_description">정말 좋은 상품인거 같아요 .</article>
		</section>
		<footer></footer>
	</body>
</html>