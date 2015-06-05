<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />


	</style>
	</head>
	<body>
		<header class="regist_header">
			<span id="regist_header_info">제주대학교 님의 상품</span>
		</header>
		<section class = "regist_section">
			<div class="regist_section_div">
				<span>상품이미지</span>
				<input type="file" name="upfile" size="20">
			</div>
			<div class="regist_section_div">
				상품 이름
				<input id="regist_section_product_name" type="text">
			</div>
			<div class="regist_section_div">
				상품 가격
				<input id="regist_section_product_price" type="text">
			</div>
			<div class="regist_section_div">
				상품 설명
				<input id="regist_section_product_description" type="text">
			</div>
			<div id="regist_Form_bts">
				<button id="bt_regist">등록</button>
				<button id="bt_cancle">취소</button>
			</div>
		</section>
		<footer>
			
		</footer>
	</body>
</html>