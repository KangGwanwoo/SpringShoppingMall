<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />


	</style>
	</head>
	<body>
		<nav class="nav">
		</nav>
		<section class = "SignInForm_section">
			<div id="SignInForm_section_id">id :<input id="SignInForm_section_id_value" type="text"></div>
			<div id="SignInForm_section_pw">password : <input id="SignInForm_section_pw_value" type="text"></div>
			<div id="SignInForm_section_name">이름 :<input id="SignInForm_section_name_value" type="text"></div>
			<div id="SignInForm_section_authority">권한 : 
			<select id="SignInForm_section_authority_value">
   				 	<option value="seller">판매자</option>
   				 	<option value="buyer">구매자</option>
			</select>
			<div id="SignInForm_bts">
				<button id="SignInForm_bts_submit">회원가입</button>
				<button id="SignInForm_bts_cancle">취소</button>
			</div>
		</section>
		<footer></footer>
	</body>
</html>