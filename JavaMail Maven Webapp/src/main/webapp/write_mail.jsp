<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>发送邮件</title>
<!-- 配置文件 -->
<script type="text/javascript" src="./ueditor/ueditor.config.js"></script>
<!-- 编辑器源码文件 -->
<script type="text/javascript" src="./ueditor/ueditor.all.js"></script>
<!-- 语言包文件(建议手动加载语言包，避免在ie下，因为加载语言失败导致编辑器加载失败) -->
<script type="text/javascript" src="./ueditor/lang/zh-cn/zh-cn.js"></script>

<link rel="stylesheet" href="//code.jquery.com/ui/1.10.4/themes/smoothness/jquery-ui.css">
  <script src="//code.jquery.com/jquery-1.9.1.js"></script>
  <script src="//code.jquery.com/ui/1.10.4/jquery-ui.js"></script>

<script type="text/javascript">
$(document).ready(function(){
  $("button").click(function(){
    $("form").attr('action','savemail.action').submit();;
  });
});
</script>
</head>
<body>
	<img alt="" src="img/163logo.gif">
	<form action="sendmail.action" method="post">
	发件人：<input name="param.personalName"  type="text" size=170><p>
	收件人：<input name="param.mail_to"  type="text" size=170><p>
	主&nbsp;&nbsp;题：<input name="param.mail_subject" type="text" size=170><p>
	<textarea id="container" name="param.mail_body" ></textarea>
	<input type="submit" value="发送">
	<input type="reset" value="取消">
	<button>保存到草稿箱</button>
	</form>
	<script type="text/javascript">
		var editor = UE.getEditor('container');
	</script>

</body>
</html>
