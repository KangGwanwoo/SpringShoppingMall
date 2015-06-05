<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />


	</style>
	</head>
	<body>
		<header class="renew_header">
			<span id="renew_header_info">제주대학교 님의 상품</span>
		</header>
		<section class = "renew_section">
			<div class="renew_section_div">
				<span>상품이미지</span>
				<input type="file" name="upfile" size="20">
				<span><img src="" alt="상품이미지" id="renew_seciton_img"></span>
			</div>
			<div class="renew_section_div">
				상품 이름
				<input id="renew_section_product_name" type="text">
			</div>
			<div class="renew_section_div">
				상품 가격
				<input id="renew_section_product_price" type="text">
			</div>
			<div class="renew_section_div">
				상품 설명
				<input id="renew_section_product_description" type="text">
			</div>
			<div id="renew_Form_bts">
				<button id="bt_modify">수정</button>
				<button id="bt_cancle">취소</button>
			</div>
		</section>
		<footer>
			
		</footer>
	</body>
</html>