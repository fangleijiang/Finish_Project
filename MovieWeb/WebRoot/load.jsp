<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html>
<head>
<base href="<%=basePath%>" />

<title>修改用户</title>
<meta http-equiv="pragma" content="no-cache" />
<meta http-equiv="cache-control" content="no-cache" />
<meta http-equiv="expires" content="0" />
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3" />
<meta http-equiv="description" content="This is my page" />
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
<script language="javascript" type="text/javascript" src="js/My97DatePicker/WdatePicker.js"></script>
</head>
<body>
	<center>
		<h1>用户详情</h1>
		<hr />
		<form action="user_modify" method="post">
			<input type="hidden" name="id" value="${user.id}" /> <br/>
			姓名：<input type="text" name="name" value="${user.name }" /><br/>
			生日：<input class="Wdate" type="text" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss.0'})" name="birthday" value="${user.birthday }" readonly="readonly"/><br/>
			注册：<input type="text" name="hiredate" value="${user.regday }" disabled="disabled"/><br/>
			组别：<select name="group.id">
					<s:iterator value="groupList" var="group">
					<option value="${group.id}"   ${user.group.id==group.id? 'selected=\'selected\'':''}>${name }</option>
					</s:iterator>
				</select><br/>
			<input type="submit" value="修改"/>
			<input type="reset" value="重置"/>
		</form>
		<br/>
			<s:a href="user_list">返回列表</s:a>
	</center>
</body>
</html>
