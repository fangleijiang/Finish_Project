<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<link href="/MovieWeb/css/head.css" rel="stylesheet" type="text/css" />
<link href="/MovieWeb/css/common.css" rel="stylesheet" type="text/css" />

</head>


<body>
	<div>
		<div class="top">
			<table id="font1">
				<tr valign="bottom">
					<td width='10'><a href="index_list?flag=index&note=listAll">首页</a></td>
					<td width='10'><a href="###">设为主页</a></td>
					<td width='10'><a href="###">收藏</a></td>
					<td width="70"></td>

					<td width='10'><a href="/MovieWeb/customer/login.jsp">登录</a></td>
					<td width='10'><a href="###">注册</a></td>
					<td width='10'><a href="user_list">个人中心</a></td>
				</tr>
			</table>
		</div>


		<div class="banner">
			<img class="img" src="/MovieWeb/images/banner1.jpg" alt="无法加载此图片"
				longdesc="http://www.csust.edu.cn" />
		</div>

		<div class="navi">
			<table id="font2">
				<tr>
					<td><a href="index_list?flag=banner&queryTypeBanner=原创&note=listAll">原创</a>
					</td>
					<td><a href="index_list?flag=banner&queryTypeBanner=电视剧&note=listAll">电视剧</a>
					</td>
					<td><a href="index_list?flag=banner&queryTypeBanner=电影&note=listAll">电影</a>
					</td>
					<td><a href="index_list?flag=banner&queryTypeBanner=综艺&note=listAll">综艺</a>
					</td>
					<td><a href="index_list?flag=banner&queryTypeBanner=校园&note=listAll">校园</a>
					</td>
					<td><a href="###">论坛</a>
					</td>

					<form id="query_form" action="index_search" method="post">
						<!-- <input type="hidden" name="page" id="page"/>
						<input type="hidden" name="pageSize" id="pageSize"/>  -->
						<input type="hidden" name="mark" id="2"/>
						<td><input name="queryName" type="text" value="${queryName}" /></td>
						<input id="search" type="submit" value=""/>
						<!--  <td><a href="index_list"><img src="/MovieWeb/images/search.jpg" width="70" height="30" border="0" /> </a></td> --> 
						
				
					
				</tr>
			</table>
		</div>
	</div>
</body>
</html>
