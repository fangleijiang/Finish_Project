<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>发送成功</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	<link rel="stylesheet" type="text/css" href="css/mail_success.css">
	<style type="text/css">
	li{ display:inline;list-style: none;margin-left:20px;} 
	</style>

  </head>
  
  <body>
		<div class="nav">
		<ul>
		<li><a href="index.jsp" target="_top"><img src="img/return.png" >返回主页</a></li>
		<li><a href="list_sent_mail.action"><img src="img/mail.png">查看已发邮件</a></li>
		<li><a href="write_mail.jsp"><img src="img/write.png">继续写信</a></li>
		</ul>
		</div>
		<div class="mail_pic"><img src="img/success.png"></div><div class="mail_suc">发送成功!</div>
		
  </body>
</html>
