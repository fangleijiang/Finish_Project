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

<title>视频分类</title>

<meta http-equiv="pragma" content="no-cache" />
<meta http-equiv="cache-control" content="no-cache" />
<meta http-equiv="expires" content="0" />
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3" />
<meta http-equiv="description" content="This is my page" />

<link href="/MovieWeb/css/common.css" rel="stylesheet" type="text/css" />
<link href="/MovieWeb/css/group.css" rel="stylesheet" type="text/css" />

</head>

<body>
	<div class="page">
		<jsp:include page="head.jsp" />
		<div>
			<div class="paomadeng">
				<span id="font7">原创</span>
				<marquee width=900px behavior=alternate direction=left> <font
					id="font8">欢迎广大会员上传各类视频!</font> </marquee>
			</div>
			<div class="group_zhong">
				<div class="player_field">
					<div class="player">
						<img src="/MovieWeb/images/playershow.jpg" alt="无法加载该页面" />
					</div>
				</div>
				<div class="right_index">
					<table id="usual_font">
						<tr>
							<td></td>
							<td id="font9">火热播放</td>
							<td></td>
						</tr>
						
						<%int k=0;{ %>
							<s:iterator  value="listClick" id="n">
							
							<%if(k<15){   %>
									<tr>
										<td><img src= "/MovieWeb/images_num/1_<%=k%>.jpg"/></td>
										<td><a href="index_play?id=${n.id}"><s:property value="#n.name" /></a></td>
										<td><s:property value="#n.clickNum" /></td>
									</tr>
							<%k++;}%>
							</s:iterator>
						<% if(k<14){%>
							<tr>
								<td><img src="/MovieWeb/images_num/1_<%=k%>.jpg" /></td>
								<td><a href="#">无相关视频</a></td>
								<td>0</td>
							</tr>
						<%}else{%>
							
						<%}
					} %>
	
					</table>

					<table class="right_table2" id="usual_font">
						<tr>
							<td></td>
							<td id="font9">最新推荐</td>
							<td></td>
						</tr>
						
						<%int j=0;{ %>
							<s:iterator  value="listTime" id="t">
							
							<%if(j<15){   %>
									<tr>
										<td><img src= "/MovieWeb/images_num/1_<%=j%>.jpg"/></td>
										<td><a href="index_play?id=${t.id}"><s:property value="#t.name" /></a></td>
										<td><s:property value="#t.clickNum" /></td>
									</tr>
							<%j++;}%>
							</s:iterator>
						<% if(j<14){%>
							<tr>
								<td><img src="/MovieWeb/images_num/1_<%=j%>.jpg" /></td>
								<td><a href="#">无相关视频</a></td>
								<td>0</td>
							</tr>
						<%}else{%>
							
						<%}
					} %>
					
					</table>

					<table class="right_table2" id="usual_font">
						<tr>
							<td></td>
							<td id="font9">经典回放</td>
							<td></td>
						</tr>
						
						<%int q=0;{ %>
							<s:iterator  value="listClassic" id="c">
							
							<%if(q<15){   %>
									<tr>
										<td><img src= "/MovieWeb/images_num/1_<%=q%>.jpg"/></td>
										<td><a href="index_play?id=${c.id}"><s:property value="#c.name" /></a></td>
										<td><s:property value="#c.clickNum" /></td>
									</tr>
							<%q++;}%>
							</s:iterator>
						<% if(q<14){%>
							<tr>
								<td><img src="/MovieWeb/images_num/1_<%=q%>.jpg" /></td>
								<td><a href="#">无相关视频</a></td>
								<td>0</td>
							</tr>
						<%}else{%>
							
						<%}
					} %>
						
					</table>

					<table class="right_table2" id="usual_font">
						<tr>
							<td></td>
							<td id="font9">校园专区</td>
							<td></td>
						</tr>
						<%int w=0;{ %>
							<s:iterator  value="listSchool" id="s">
							
							<%if(w<15){   %>
									<tr>
										<td><img src= "/MovieWeb/images_num/1_<%=w%>.jpg"/></td>
										<td><a href="index_play?id=${s.id}"><s:property value="#s.name" /></a></td>
										<td><s:property value="#s.clickNum" /></td>
									</tr>
							<%w++;}%>
							</s:iterator>
						<% if(w<14){%>
							<tr>
								<td><img src="/MovieWeb/images_num/1_<%=w%>.jpg" /></td>
								<td><a href="#">无相关视频</a></td>
								<td>0</td>
							</tr>
						<%}else{%>
							
						<%}
					} %>
						
					</table>
				</div>
			
				<div class="left_index">
				<div class="left_fenleititle" id="font5">剧情</div>
						<%int i=0;{ %>
							<s:iterator  value="list" id="movie1">
							<s:if test='#movie1.typeType=="剧情"'>
							<%if(i<4){ %>
								<tr>
									<div class="left_list">
										<a href="index_play?id=${movie1.id}" ><img src=<s:property value="#movie1.photo"/>  alt="" /></a>
										<p><a href="index_play?id=${movie1.id}"><s:property value="#movie1.name" /></a></p> 
									</div>
								</tr>
							<%i++;}%>
							</s:if>
							</s:iterator>
						<% if(i<3){%>
							<tr>
								<div class="left_list">
									<img src="/MovieWeb/images_film/lack.jpg"  alt="无法加载此图片" />
									<p>无相关视频</p>
								</div>
							</tr>
						<%}else{%>
							<div class="gengduo" id="font6">
							<a href="index_list?queryTypeBanner=原创&queryTypeType=剧情&mark=1&note=list">更多</a>
							</div>
						<%}
					} %>
					
					<div class="left_fenleititle" id="font5">动作</div>
						<%i=0;{ %>
							<s:iterator  value="list" id="movie2">
							<s:if test='#movie2.typeType=="动作"'>
							<%if(i<4){ %>
								<tr>
									<div class="left_list">
										<a href="index_play?id=${movie2.id}"><img src=<s:property value="#movie2.photo"/>  alt="" /></a>
										<p><a href="index_play?id=${movie2.id}"><s:property value="#movie2.name" /></a></p> 
									</div>
								</tr>
							<%i++;}%>
							</s:if>
							</s:iterator>
						<% if(i<3){%>
							<tr>
								<div class="left_list">
									<img src="/MovieWeb/images_film/lack.jpg"  alt="无法加载此图片" />
									<p>无相关视频</p>
								</div>
							</tr>
						<%}else{%>
							<div class="gengduo" id="font6">
							<a href="index_list?queryTypeBanner=原创&queryTypeType=动作&mark=1&note=list">更多</a>
							</div>
						<%}
					} %>
	
				<div class="left_fenleititle" id="font5">科幻</div>
						<%i=0;{ %>
							<s:iterator  value="list" id="movie3">
							<s:if test='#movie3.typeType=="科幻"'>
							<%if(i<4){ %>
								<tr>
									<div class="left_list">
										<a href="index_play?id=${movie3.id}"><img src=<s:property value="#movie3.photo"/>  alt="" /></a>
										<p><a href="index_play?id=${movie3.id}"><s:property value="#movie3.name" /></a></p> 
									</div>
								</tr>
							<%i++;}%>
							</s:if>
							</s:iterator>
						<% if(i<3){%>
							<tr>
								<div class="left_list">
									<img src="/MovieWeb/images_film/lack.jpg"  alt="无法加载此图片" />
									<p>无相关视频</p>
								</div>
							</tr>
						<%}else{%>
							<div class="gengduo" id="font6">
							<a href="index_list?queryTypeBanner=原创&queryTypeType=科幻&mark=1&note=list">更多</a>
							</div>
						<%}
					} %>
					
				<div class="left_fenleititle" id="font5">喜剧</div>
						<%i=0;{ %>
							<s:iterator  value="list" id="movie4">
							<s:if test='#movie4.typeType=="喜剧"'>
							<%if(i<4){ %>
								<tr>
									<div class="left_list">
										<a href="index_play?id=${movie4.id}"><img src=<s:property value="#movie4.photo"/>  alt="" /></a>
										<p><a href="index_play?id=${movie4.id}"><s:property value="#movie4.name" /></a></p> 
									</div>
								</tr>
							<%i++;}%>
							</s:if>
							</s:iterator>
						<% if(i<3){%>
							<tr>
								<div class="left_list">
									<img src="/MovieWeb/images_film/lack.jpg"  alt="无法加载此图片" />
									<p>无相关视频</p>
								</div>
							</tr>
						<%}else{%>
							<div class="gengduo" id="font6">
							<a href="index_list?queryTypeBanner=原创&queryTypeType=喜剧&mark=1&note=list">更多</a>
							</div>
						<%}
					} %>

					<div class="left_fenleititle" id="font5">悬疑</div>
						<%i=0;{ %>
							<s:iterator  value="list" id="movie5">
							<s:if test='#movie5.typeType=="悬疑"'>
							<%if(i<4){ %>
								<tr>
									<div class="left_list">
										<a href="index_play?id=${movie5.id}"><img src=<s:property value="#movie5.photo"/>  alt="" /></a>
										<p><a href="index_play?id=${movie5.id}"><s:property value="#movie5.name" /></a></p> 
									</div>
								</tr>
							<%i++;}%>
							</s:if>
							</s:iterator>
						<% if(i<3){%>
							<tr>
								<div class="left_list">
									<img src="/MovieWeb/images_film/lack.jpg"  alt="无法加载此图片" />
									<p>无相关视频</p>
								</div>
							</tr>
						<%}else{%>
							<div class="gengduo" id="font6">
							<a href="index_list?queryTypeBanner=原创&queryTypeType=悬疑&mark=1&note=list">更多</a>
							</div>
						<%}
					} %>
				
				
				 	<div class="left_fenleititle" id="font5">爱情</div>
						<%i=0;{ %>
							<s:iterator  value="list" id="movie6">
							<s:if test='#movie6.typeType=="爱情"'>
							<%if(i<4){ %>
								<tr>
									<div class="left_list">
										<a href="index_play?id=${movie6.id}"><img src=<s:property value="#movie6.photo"/>  alt="" /></a>
										<p><a href="index_play?id=${movie6.id}"><s:property value="#movie6.name" /></a></p> 
									</div>
								</tr>
							<%i++;}%>
							</s:if>
							</s:iterator>
						<% if(i<3){%>
							<tr>
								<div class="left_list">
									<img src="/MovieWeb/images_film/lack.jpg"  alt="无法加载此图片" />
									<p>无相关视频</p>
								</div>
							</tr>
						<%}else{%>
							<div class="gengduo" id="font6">
							<a href="index_list?queryTypeBanner=原创&queryTypeType=爱情&mark=1&note=list">更多</a>
							</div>
						<%}
					} %>
				
					<div class="left_fenleititle" id="font5">恐怖</div>
						<%i=0;{ %>
							<s:iterator  value="list" id="movie7">
							<s:if test='#movie7.typeType=="恐怖"'>
							<%if(i<4){ %>
								<tr>
									<div class="left_list">
										<a href="index_play?id=${movie7.id}"><img src=<s:property value="#movie7.photo"/>  alt="" /></a>
										<p><a href="index_play?id=${movie7.id}"><s:property value="#movie7.name" /></a></p> 
									</div>
								</tr>
							<%i++;}%>
							</s:if>
							</s:iterator>
						<% if(i<3){%>
							<tr>
								<div class="left_list">
									<img src="/MovieWeb/images_film/lack.jpg"  alt="无法加载此图片" />
									<p>无相关视频</p>
								</div>
							</tr>
						<%}else{%>
							<div class="gengduo" id="font6">
							<a href="index_list?queryTypeBanner=原创&queryTypeType=恐怖&mark=1&note=list">更多</a>
							</div>
						<%}
					} %>
				
					<div class="left_fenleititle" id="font5">奇幻</div>
						<%i=0;{ %>
							<s:iterator  value="list" id="movie8">
							<s:if test='#movie8.typeType=="奇幻"'>
							<%if(i<4){ %>
								<tr>
									<div class="left_list">
										<a href="index_play?id=${movie8.id}"><img src=<s:property value="#movie8.photo"/>  alt="" /></a>
										<p><a href="index_play?id=${movie8.id}"><s:property value="#movie8.name" /></a></p> 
									</div>
								</tr>
							<%i++;}%>
							</s:if>
							</s:iterator>
						<% if(i<3){%>
							<tr>
								<div class="left_list">
									<img src="/MovieWeb/images_film/lack.jpg"  alt="无法加载此图片" />
									<p>无相关视频</p>
								</div>
							</tr>
						<%}else{%>
							<div class="gengduo" id="font6">
							<a href="index_list?queryTypeBanner=原创&queryTypeType=奇幻&mark=1&note=list">更多</a>
							</div>
						<%}
					} %>
				
				</div>

			</div>

		</div>
		<jsp:include page="tail.jsp" />
	</div>
</body>
</html>
