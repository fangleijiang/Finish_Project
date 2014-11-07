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
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<base href="<%=basePath%>" />

<title>更多视频</title>
<meta http-equiv="pragma" content="no-cache" />
<meta http-equiv="cache-control" content="no-cache" />
<meta http-equiv="expires" content="0" />
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3" />
<meta http-equiv="description" content="This is my page" />

<link href="/MovieWeb/css/index.css" rel="stylesheet" type="text/css" />
<link href="/MovieWeb/css/common.css" rel="stylesheet" type="text/css" />
<link href="/MovieWeb/css/tail.css" rel="stylesheet" type="text/css" />
<link href="/MovieWeb/css/head.css" rel="stylesheet" type="text/css" />
<link href="/MovieWeb/css/more.css" rel="stylesheet" type="text/css" />

<script type="text/javascript" src="js/jquery-1.8.0.js"></script>
<script type="text/javascript" >
	function goNextPage(){
		  var page = ${pageModel.page};  
 			var pageSize =  ${pageModel.pageSize};
/*  			var queryName = ${interPretorModel.queryName}; */
		/* ${queryName}; */
		
	
		alert(pageSize);
		page++;
		
		
		$("#pageModel.page").val(page); 
		
		 $("#pageModel.pageSize").val("$(pageModel.pageSize)"); 
		
		$("#queryName").val("${interPretorModel.queryName}");
		
		$("#query_form").submit; 
	}
	
</script>

</head>
<body>

	<div class="page">

		<jsp:include page="head.jsp" />

		<div class="more_list">
		
			<%int i=0;{ %>
							<s:iterator  value="list" id="movie">
						
							<%if(i<42){ %>
								<tr>
									<div class="more_list_tu">
										<a href="index_play?id=${movie.id}"><img src=<s:property value="#movie.photo"/>  alt="无法加载此图片" /></a>
										<p><a href="index_play?id=${movie.id}"><s:property value="#movie.name" /></a></p> 
									</div>
								</tr>
							<%i++;}%>
						
							</s:iterator>
						<% if(i<41){%>
							<tr>
								<div class="more_list_tu">
									<img src="/MovieWeb/images_film/lack.jpg"  alt="无法加载此图片" />
									<p>无相关视频</p>
								</div>
							</tr>
						<%}
					} %>
					
					
		<div class="devide">			
			总共<s:property value="pageModel.countAll" />条，
			每页<s:property value="pageModel.pageSize" />条 ，
			当前第<s:property value="pageModel.page" />/<s:property value="pageModel.pageCount" />页<br />
			  <s:if test='mark=="1"'> 
			 <s:a href="index_list?queryName=%{interPretorModel.queryName}
			&queryRole=%{interPretorModel.queryRole}
			&queryTypeBanner=%{interPretorModel.queryTypeBanner}
			&queryTypeField=%{interPretorModel.queryTypeField}
			&queryTypeType=%{interPretorModel.queryTypeType}
			&mark=%{mark}
			&note=%{note}
			&page=1">首页</s:a>
			|
			<s:a href="index_list?queryName=%{interPretorModel.queryName}
			&queryRole=%{interPretorModel.queryRole}
			&queryTypeBanner=%{interPretorModel.queryTypeBanner}
			&queryTypeField=%{interPretorModel.queryTypeField}
			&queryTypeType=%{interPretorModel.queryTypeType}
			&mark=%{mark}
			&note=%{note}
			&page=%{pageModel.page-1}">上一页</s:a>
			|
			<s:a href="index_list?queryName=%{interPretorModel.queryName}
			&queryRole=%{interPretorModel.queryRole}
			&queryTypeBanner=%{interPretorModel.queryTypeBanner}
			&queryTypeField=%{interPretorModel.queryTypeField}
			&queryTypeType=%{interPretorModel.queryTypeType}
			&mark=%{mark}
			&note=%{note}
			&page=%{pageModel.page+1}">下一页</s:a>
			|
			<s:a href="index_list?queryName=%{interPretorModel.queryName}
			&queryRole=%{interPretorModel.queryRole}
			&queryTypeBanner=%{interPretorModel.queryTypeBanner}
			&queryTypeField=%{interPretorModel.queryTypeField}
			&queryTypeType=%{interPretorModel.queryTypeType}
			&mark=%{mark}
			&note=%{note}
			&page=%{pageModel.pageCount}">尾页</s:a>
			</s:if>
			 <s:elseif test='mark=="2"'> 
			 <s:a href="index_search?queryName=%{interPretorModel.queryName}
			&queryRole=%{interPretorModel.queryRole}
			&queryTypeBanner=%{interPretorModel.queryTypeBanner}
			&queryTypeField=%{interPretorModel.queryTypeField}
			&queryTypeType=%{interPretorModel.queryTypeType}
			&mark=%{mark}
			&page=1">首页</s:a>
			|
			<s:a href="index_search?queryName=%{interPretorModel.queryName}
			&queryRole=%{interPretorModel.queryRole}
			&queryTypeBanner=%{interPretorModel.queryTypeBanner}
			&queryTypeField=%{interPretorModel.queryTypeField}
			&queryTypeType=%{interPretorModel.queryTypeType}
			&mark=%{mark}
			&page=%{pageModel.page-1}">上一页</s:a>
			|
			<s:a href="index_search?queryName=%{interPretorModel.queryName}
			&queryRole=%{interPretorModel.queryRole}
			&queryTypeBanner=%{interPretorModel.queryTypeBanner}
			&queryTypeField=%{interPretorModel.queryTypeField}
			&queryTypeType=%{interPretorModel.queryTypeType}
			&mark=%{mark}
			&page=%{pageModel.page+1}">下一页</s:a>
			|
			<s:a href="index_search?queryName=%{interPretorModel.queryName}
			&queryRole=%{interPretorModel.queryRole}
			&queryTypeBanner=%{interPretorModel.queryTypeBanner}
			&queryTypeField=%{interPretorModel.queryTypeField}
			&queryTypeType=%{interPretorModel.queryTypeType}
			&mark=%{mark}
			&page=%{pageModel.pageCount}">尾页</s:a>
			</s:elseif>
			<s:debug/>	
		</div>
			

		</div>

		<jsp:include page="tail.jsp" />

	</div>
</body>
</html>
