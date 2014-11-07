<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
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
<link href="/MovieWeb/css/player.css" rel="stylesheet" type="text/css" />

</head>
<body>
	<div class="page">
		
		<jsp:include page="head.jsp" />
		<div class="zhong">
			<div class="player_page">
				<div class="player_frame">
					<img src="/MovieWeb/images/playershow.jpg" alt="无法加载该页面" />
				</div>
			</div>
			<div class="response">
				<form action="###" method="post">
				给点描述吧！<br/><br/>
					<textarea rows="20" cols="80" ></textarea><br/><br/>
					<ui>
					<li>非常喜欢：<input type="radio" name="preference" /></li>
					<li>喜欢：<input type="radio" name="preference"/></li>
					<li>一般：<input type="radio" name="preference"/></li>
					<li>不喜欢：<input type="radio" name="preference"/></li>
					</ui>
					<input class="submit" type="submit" value="提交"/>
				</form>
			</div>

		</div>

		<jsp:include page="tail.jsp" />

	</div>
</body>
</html>
