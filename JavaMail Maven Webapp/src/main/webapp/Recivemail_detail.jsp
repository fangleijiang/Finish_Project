<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title></title>
    
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
		<li><a href="list_sent_mail.action"><img src="img/mail.png">已发邮件</a></li>
		<li><a href="write_mail.jsp"><img src="img/write.png">写信</a></li>
		</ul>
		</div>
  <s:hidden name="mail.id" value="%{mail.id}"/> 
 
  <font face="微软雅黑" color=blue> 发件人： </font><p>
 
     <font face="微软雅黑" size="2px"><s:property value="%{mail.mail_from}"/></font>
    <p>
   <font face="微软雅黑" color=blue> 邮件主题：</font><p>
    <font face="微软雅黑" size="2px"> <s:property value="%{mail.mail_subject}"/></font>
       <p>
  <font face="微软雅黑" color=blue>   邮件内容：</font><p>
     <font face="微软雅黑" size="2px"><s:property value="%{mail.mail_body}" escape="false"/></font>
    
  </body>
</html>
