<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html>
<head>
<base href="<%=basePath%>" />

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache" />
<meta http-equiv="cache-control" content="no-cache" />
<meta http-equiv="expires" content="0" />
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3" />
<meta http-equiv="description" content="This is my page" />

<link href="/MovieWeb/css/common.css" rel="stylesheet" type="text/css" />
<link href="/MovieWeb/css/tail.css" rel="stylesheet" type="text/css" />
<link href="/MovieWeb/css/head.css" rel="stylesheet" type="text/css" />
<link href="/MovieWeb/css/login.css" rel="stylesheet" type="text/css" />

</head>
<body>
	<div class="page">
		
		<jsp:include page="head.jsp" />
		
		<div class="frame" >
			<div class="picture" >
				
				<form action="###" method="post">
					账号：<input type="text" name="username"/><br/><br/>
					密码：<input type="password" name="password"/><br/><br/>
					<input id="login"   type="submit" value="登录"/>
					<input id="reset"  type="reset" value="重置" />
				</form>
			</div>
		</div>
		<jsp:include page="tail.jsp" />
	</div>
</body>
</html>
