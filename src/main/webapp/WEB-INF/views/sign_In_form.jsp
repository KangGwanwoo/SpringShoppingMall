<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />


</style>
</head>
<body>
	<div id="Content">
		<form action="signIn" method="post">
			<fieldset>
				<legend>회원가입</legend>
				<p>
					<label>아이디</label> <input type="text" name="userId" />
					<div id="error">
					${sessionScope.errMsg}
					</div>
				</p>
				<p>
					<label>이름</label> <input type="text" name="name" />
				</p>
				<p>
					<label>비밀번호</label> <input type="password" name="password" />
				</p>
				<p>
					<label>핸드폰번호</label> <input type="number" name="phoneNumber" />
				</p>
				<p>
					<label>권한</label> <select name="authority">
						<option value="seller">판매자</option>
						<option value="buyer">구매자</option>
					</select>
				</p>
				<p>
					<input type="submit" value="회원가입" /> 
					<a href="index.jeju"><input
						type="button" value="취소 " /></a>
				</p>
			</fieldset>
		</form>
	</div>
</body>

</html>

