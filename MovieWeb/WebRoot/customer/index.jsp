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

<title>网站视频主页</title>
<meta http-equiv="pragma" content="no-cache" />
<meta http-equiv="cache-control" content="no-cache" />
<meta http-equiv="expires" content="0" />
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3" />
<meta http-equiv="description" content="This is my page" />


<link href="/MovieWeb/css/index.css" rel="stylesheet" type="text/css" />
<link href="/MovieWeb/css/common.css" rel="stylesheet" type="text/css" />
<link href="/MovieWeb/css/tail.css" rel="stylesheet" type="text/css" />
<link href="/MovieWeb/css/head.css" rel="stylesheet" type="text/css" />


</head>
<body>
	<div class="page">
		<jsp:include page="head.jsp" />
		<div>
			<div class="swf">
				<script type="text/javascript" src="banner.js"></script>
			</div>
			<div class="paihangbang">
				<img src="/MovieWeb/images/paihangbang.jpg" alt="无法加载该图片" />
				<table>
					<tr>
						<td>排名</td>
						<td>视频</td>
						<td>点击次数</td>
					</tr>
					<%
						int j = 0;
						{
					%>
					<s:iterator value="listClick" id="n">

						<%
							if (j < 10) {
						%>
						<tr>
							<td><img src="/MovieWeb/images_num/1_<%=j%>.jpg" /></td>
							<td><a href="index_play?id=${n.id}"><s:property value="#n.name" /></a></td>
							<td><s:property value="#n.clickNum" /></td>
						</tr>
						<%
							j++;
									}
						%>

					</s:iterator>
					<%
						if (j < 9) {
					%>
					<tr>
						<td><img src="/MovieWeb/images_num/1_<%=j%>.jpg" /></td>
						<td>无相关视频</td>
						<td>0</td>
					</tr>
					<%
						} else {
					%>

					<%
						}
						}
					%>
				</table>
			</div>
			
			<div class="zhongjian">
				<div class="left_index">
					<img src="/MovieWeb/images/left_index.jpg" alt="无法加载此图片" />
					<p id="font3">类型</p>
					<table id="font4">
						<tr>
							<td><a href="index_list?flag=typequery&note=listAll&mark=1">全部</a></td>
							<td><a href="index_search?queryName=喜剧&mark=2">喜剧</a></td>
						</tr>
						<tr>
							<td><a href="index_search?queryName=剧情&mark=2">剧情</a></td>
							<td><a href="index_search?queryName=犯罪&mark=2">犯罪</a></td>
						</tr>
						<tr>
							<td><a href="index_search?queryName=爱情&mark=2">爱情</a>
							</td>
							<td><a href="index_search?queryName=惊奇&mark=2">惊奇</a>
							</td>
						</tr>
						<tr>
							<td><a href="index_search?queryName=动画&mark=2">动画</a>
							</td>
							<td><a href="index_search?queryName=冒险&mark=2">冒险</a>
							</td>
						</tr>
						<tr>
							<td><a href="index_search?queryName=动作&mark=2">动作</a>
							</td>
							<td><a href="index_search?queryName=悬疑&mark=2">悬疑</a>
							</td>
						</tr>
						<tr>
							<td><a href="index_search?queryName=科幻&mark=2">科幻</a>
							</td>
							<td><a href="index_search?queryName=其他&mark=2">其他</a>
							</td>
						</tr>
					</table>

					<hr />
					
					<p id="font3">国家地区</p>
					<table id="font4">
						<tr>
							<td><a href="index_list?flag=typequery&note=listAll&mark=1">全部</a>
							</td>
							<td><a href="index_search?queryName=大陆&mark=2">大陆</a>
							</td>
						</tr>
						<tr>
							<td><a href="index_search?queryName=台湾&mark=2">台湾</a>
							</td>
							<td><a href="index_search?queryName=韩国&mark=2">韩国</a>
							</td>
						</tr>
						<tr>
							<td><a href="index_search?queryName=泰国&mark=2">泰国</a>
							</td>
							<td><a href="index_search?queryName=美国&mark=2">美国</a>
							</td>
						</tr>
						<tr>
							<td><a href="index_search?queryName=法国&mark=2">法国</a>
							</td>
							<td><a href="index_search?queryName=英国&mark=2">英国</a>
							</td>
						</tr>
						<tr>
							<td><a href="index_search?queryName=印度&mark=2">印度</a>
							</td>
							<td><a href="index_search?queryName=俄罗斯&mark=2">俄罗斯</a>
							</td>
						</tr>
						<tr>
							<td><a href="index_search?queryName=意大利&mark=2">意大利</a>
							</td>
							<td><a href="index_search?queryName=其他&mark=2">其他</a>
							</td>
						</tr>
					</table>

					<hr />
					
					<p id="font3">热门人物</p>
					<table id="font4">
						<tr>
							<td><a href="index_search?queryName=周润发&mark=2">周润发</a>
							</td>
							<td><a href="index_search?queryName=周星驰&mark=2">周星驰</a>
							</td>
						</tr>
						<tr>
							<td><a href="index_search?queryName=范冰冰&mark=2">范冰冰</a>
							</td>
							<td><a href="index_search?queryName=成龙&mark=2">成龙</a>
							</td>
						</tr>
						<tr>
							<td><a href="index_search?queryName=甄子丹&mark=2">甄子丹</a>
							</td>
							<td><a href="index_search?queryName=赵薇&mark=2">赵薇</a>
							</td>
						</tr>
						<tr>
							<td><a href="index_search?queryName=黄蓉&mark=2">黄蓉</a>
							</td>
							<td><a href="index_search?queryName=古天乐&mark=2">古天乐</a>
							</td>
						</tr>
						<tr>
							<td><a href="index_search?queryName=邓超&mark=2">邓超</a>
							</td>
							<td><a href="index_search?queryName=周迅&mark=2">周迅</a>
							</td>
						</tr>
						<tr>
							<td><a href="index_search?queryName=谢霆锋&mark=2">谢霆锋</a>
							</td>
							<td><a href="index_search?queryName=胡歌&mark=2">胡歌</a>
							</td>
						</tr>
					</table>
				</div>

				<div class="right_index">
					<div class="fenleititle" id="font5">原创空间</div>
					<%
						int i = 0;
						{
					%>
					<s:iterator value="list" id="movie1">
						<s:if test='#movie1.typeBanner=="原创"'>
							<%
								if (i < 4) {
							%>
							<tr>
								<div class="filmlist">
									<a href="index_play?id=${movie1.id}"><img src=<s:property value="#movie1.photo"/> alt="" /> </a>
									<p><a href="index_play?id=${movie2.id}"><s:property value="#movie1.name" /> </a></p>
								</div>
							</tr>
							<%
								i++;
											}
							%>
						</s:if>
					</s:iterator>
					<%
						if (i < 3) {
					%>
					<tr>
						<div class="filmlist">
							<img src="/MovieWeb/images_film/lack.jpg" alt="无法加载此图片" />
							<p>无相关视频</p>
						</div>
					</tr>
					<%
						} else {
					%>
					<div class="gengduo" id="font6">
						<a href="index_list?flag=banner&queryTypeBanner=原创&note=listAll">更多</a>
					</div>
					<%
						}
						}
					%>


					<div class="fenleititle" id="font5">电视观看</div>
					<%
						i = 0;
						{
					%>
					<s:iterator value="list" id="movie2">
						<s:if test='#movie2.typeBanner=="电视剧"'>
							<%
								if (i < 4) {
							%>
							<tr>
								<div class="filmlist">
									<a href="index_play?id=${movie2.id}"><img src=<s:property value="#movie2.photo"/> alt="" /> </a>
									<p><a href="index_play?id=${movie2.id}"><s:property value="#movie2.name" /> </a></p>
								</div>
							</tr>
							<%
								i++;
											}
							%>
						</s:if>
					</s:iterator>
					<%
						if (i < 3) {
					%>
					<tr>
						<div class="filmlist">
							<img src="/MovieWeb/images_film/lack.jpg" alt="无法加载此图片" />
							<p>无相关视频</p>
						</div>
					</tr>
					<%
						} else {
					%>
					<div class="gengduo" id="font6">
						<a href="index_list?flag=banner&queryTypeBanner=电视剧&note=listAll">更多</a>
					</div>
					<%
						}
						}
					%>



					<div class="fenleititle" id="font5">电影欣赏</div>
					<%
						i = 0;
						{
					%>
					<s:iterator value="list" id="movie3">
						<s:if test='#movie3.typeBanner=="电影"'>
							<%
								if (i < 4) {
							%>
							<tr>
								<div class="filmlist">
									<a href="index_play?id=${movie3.id}"><img src=<s:property value="#movie3.photo"/> alt="" /></a>
									<p><a href="index_play?id=${movie3.id}"><s:property value="#movie3.name" /> </a></p>
								</div>
							</tr>
							<%
								i++;
											}
							%>
						</s:if>
					</s:iterator>
					<%
						if (i < 3) {
					%>
					<tr>
						<div class="filmlist">
							<img src="/MovieWeb/images_film/lack.jpg" alt="无法加载此图片" />
							<p>无相关视频</p>
						</div>
					</tr>
					<%
						} else {
					%>
					<div class="gengduo" id="font6">
						<a href="index_list?flag=banner&queryTypeBanner=电影&note=listAll">更多</a>
					</div>
					<%
						}
						}
					%>


					<div class="fenleititle" id="font5">综艺大全</div>
					<%
						i = 0;
						{
					%>
					<s:iterator value="list" id="movie4">
						<s:if test='#movie4.typeBanner=="综艺"'>
							<%
								if (i < 4) {
							%>
							<tr>
								<div class="filmlist">
									<a href="index_play?id=${movie4.id}"><img src=<s:property value="#movie4.photo"/> alt="" /> </a>
									<p><a href="index_play?id=${movie4.id}"><s:property value="#movie4.name" /> </a></p>
								</div>
							</tr>
							<%
								i++;
											}
							%>
						</s:if>
					</s:iterator>
					<%
						if (i < 3) {
					%>
					<tr>
						<div class="filmlist">
							<img src="/MovieWeb/images_film/lack.jpg" alt="无法加载此图片" />
							<p>无相关视频</p>
						</div>
					</tr>
					<%
						} else {
					%>
					<div class="gengduo" id="font6">
						<a href="index_list?flag=banner&queryTypeBanner=综艺&note=listAll">更多</a>
					</div>
					<%
						}
						}
					%>


					<div class="fenleititle" id="font5">校园DV</div>
					<%
						i = 0;
						{
					%>
					<s:iterator value="list" id="movie5">
						<s:if test='#movie5.typeBanner=="校园"'>
							<%
								if (i < 4) {
							%>
							<tr>
								<div class="filmlist">
									<a href="index_play?id=${movie5.id}"><img src=<s:property value="#movie5.photo"/> alt="" /></a>
									<p><a href="index_play?id=${movie5.id}"><s:property value="#movie5.name" /></a></p>
								</div>
							</tr>
							<%
								i++;
											}
							%>
						</s:if>
					</s:iterator>
					<%
						if (i < 3) {
					%>
					<tr>
						<div class="filmlist">
							<img src="/MovieWeb/images_film/lack.jpg" alt="无法加载此图片" />
							<p>无相关视频</p>
						</div>
					</tr>
					<%
						} else {
					%>
					<div class="gengduo" id="font6">
						<a href="index_list?flag=banner&queryTypeBanner=校园&note=listAll">更多</a>
					</div>
					<%
						}
						}
					%>

				</div>
			</div>
		</div>
		<jsp:include page="tail.jsp" />
	</div>
</body>
</html>
