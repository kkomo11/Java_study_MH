<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Login Page</h1>

	<form action="./login" method="post">
		<div>
			<input type="text" value="id1" name="userName">
		</div>
		<div>
			<input type="password" value="pw1" name="password">
		</div>
		<div class="login">
			<input type="submit" value="로그인">
		</div>
	</form>

</body>
</html>