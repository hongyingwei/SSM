<%@page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Page</title>
</head>
<body>
	<div style="display: flex; justify-content: center;">
		请登录
	</div>

	<div style="display: flex; justify-content: center;">
		<form action="login" method="post">
			<table>
				<tr>
					<td>用户名：</td>
					<td>
						<label>
							<input type="text" name="user_name">
						</label>
					</td>
				</tr>
				<tr>
					<td>密码：</td>
					<td><label>
						<input type="password" name="password">
					</label></td>
				</tr>
				<tr>
					<td colspan="2" style="alignment: center">
						<input type="submit" value="登录">
						<input type="reset" value="重置">
					</td>
				</tr>
			</table>
		</form>
		<p style="color: red">${msg}</p>
	</div>
</body>
</html>