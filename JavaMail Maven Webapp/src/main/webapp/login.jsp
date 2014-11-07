<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>163邮箱登录</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="css/login.css">
	

  </head>
  
  <body>
<body>
	<div class="wrapper">
		<form action="Login.action" method="post" >
		<div class="loginBox">
		<div class="logo">
		<img alt="" src="img/163logo.gif">
		</div>
		
		
			<div class="loginBoxCenter">
				<p><label for="username">163电子邮箱：</label></p>
				<p><input type="email" id="email" name="user.username" class="loginInput" autofocus="autofocus" required="required" autocomplete="off" placeholder="请输入电子邮箱" value="" /></p>
				<p><label for="password">密码：</label><a class="forgetLink" href="#">忘记密码?</a></p>
				<p><input type="password" id="password" name="user.password" class="loginInput" required="required" placeholder="请输入密码" value="" /></p>
			</div>
			<div class="loginBoxButtons">
				<input id="remember" type="checkbox" name="remember" />
				<label for="remember">记住登录状态</label>
				<input class="loginBtn" type="submit">登录</input>
			</div>
		</div>
		</form>
	</div>
</body>
</html>

