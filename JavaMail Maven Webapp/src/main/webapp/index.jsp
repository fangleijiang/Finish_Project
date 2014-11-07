<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML>
<html>
<head>
<base href="<%=basePath%>">

<title>我的163邮箱</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link rel="stylesheet" type="text/css" href="css/index.css">
<style type="text/css">
.menu5 {
	padding: 5px 0 0 1em;
	margin: 0;
	list-style: none;
	height: 40px;
	position: relative;
	background: transparent
		url(http://www.codef ans.net/jscss/demoimg/200906/pro_five_0c.gif)
		repeat-x left bottom;
	font-size: 12px;
}

.menu5 li {
	float: left;
	height: 40px;
	margin-left: 10px;
}

.menu5 li a {
	display: block;
	float: left;
	height: 40px;
	line-height: 35px;
	color: #333;
	text-decoration: none;
	font-family: arial, verdana, sans-serif;
	font-weight: bold;
	text-align: center;
	padding: 0 0 0 4px;
	cursor: pointer;
	background:
		url(http://www.codefans.net/jscss/demoimg/200906/pro_five_0a.gif)
		no-repeat;
}

.menu5 li a b {
	float: left;
	display: block;
	padding: 0 16px 5px 12px;
	background:
		url(http://www.codefans.net/jscss/demoimg/200906/pro_five_0b.gif)
		no-repeat right top;
}

.menu5 li.current a {
	color: #000;
	background:
		url(http://www.codefans.net/jscss/demoimg/200906/pro_five_2a.gif)
		no-repeat;
}

.menu5 li.current a b {
	background:
		url(http://www.codefans.net/jscss/demoimg/200906/pro_five_2b.gif)
		no-repeat right top;
}

.menu5 li a:hover {
	color: #000;
	background:
		url(http://www.codefans.net/jscss/demoimg/200906/pro_five_1a.gif)
		no-repeat;
}

.menu5 li a:hover b {
	background:
		url(http://www.codefans.net/jscss/demoimg/200906/pro_five_1b.gif)
		no-repeat right top;
}

.menu5 li.current a:hover {
	color: #000;
	background:
		url(http://www.codefans.net/jscss/demoimg/200906/pro_five_2a.gif)
		no-repeat;
	cursor: default;
}

.menu5 li.current a:hover b {
	background:
		url(http://www.codefans.net/jscss/demoimg/200906/pro_five_2b.gif)
		no-repeat right top;
}
</style>
<script type="text/javascript">
function refresh(){
 	setInterval("check()",1000);
}
function check(){
	
}
</script>



</head>

<body>
	<div class="header">
		<div class="header_logo">
			=<img alt="" src="img/163logo.gif">
		</div>
		<div class="nav">
			<ul class="menu5">
				<li><a href="index.jsp"><b>&nbsp;&nbsp;&nbsp;&nbsp;首&nbsp;&nbsp;&nbsp;&nbsp;页&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</b>
				</a></li>
				<li><a href="#" target="iFrame1 "><b>&nbsp;&nbsp;&nbsp;&nbsp;通&nbsp;&nbsp;&nbsp;&nbsp;讯&nbsp;&nbsp;&nbsp;&nbsp;录&nbsp;&nbsp;&nbsp;&nbsp;</b>
				</a></li>
				<li><a href="List_recieveMail.action" target="iFrame1 "><b>&nbsp;&nbsp;&nbsp;&nbsp;收&nbsp;&nbsp;&nbsp;&nbsp;件&nbsp;&nbsp;&nbsp;&nbsp;箱&nbsp;&nbsp;&nbsp;&nbsp;</b>
				</a></li>
			</ul>
		</div>
	</div>
	<section>
		<div class="article1">
			<div class="link"><a href="write_mail.jsp" target="iFrame1 ">发送邮件</a></div>

						<div class="link"><a href="List_recieveMail.action" target="iFrame1 ">收件箱</a></div>
			<div class="link"><a href="list_sent_mail.action" target="iFrame1 ">已发邮件</a></div>
			<div class="link"><a href="list_draft_mail.action" target="iFrame1 ">草稿箱</a></div>
		</div>
		<article id="iFrame1 ">
				<iframe name="iFrame1 " width=1200px height=500px src="first.jsp"> </iframe>
		</article>
	</section>
	<footer>版权</footer>
</body>
</html>
