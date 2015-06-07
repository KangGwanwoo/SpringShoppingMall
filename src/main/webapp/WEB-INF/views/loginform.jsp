<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>로그인</title>
	<link href="/menu.css" rel="stylesheet" type="text/css" media="all" />
	<%
		//request scopte 에 담긴 에러 메시지 얻어오기
		String errMsg = (String)request.getAttribute("errMsg");
		if(errMsg==null){
			errMsg="";
		}
	%>
</head>
<body>

	<div id="Content">
		<form action="userlogin" method="post">
			<fieldset>
				<legend>로그인</legend>
				<p>
					<label>아이디</label>
					<input type="text" name="userId" />
				</p>
				<p>
					<label>암호</label>
					<input type="password" name="password" />
				</p>
				<p>
					<input type="submit" value="로그인" />
				</p>
				<p id="error">
					${sessionScope.errMsg}
				</p>
			</fieldset>
		</form>
	</div>
</body>