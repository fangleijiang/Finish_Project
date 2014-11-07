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

<html>
<head>
<base href="<%=basePath%>" />

<title>用户列表</title>
<meta http-equiv="pragma" content="no-cache" />
<meta http-equiv="cache-control" content="no-cache" />
<meta http-equiv="expires" content="0" />
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3" />
<meta http-equiv="description" content="This is my page" />
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

<script type="text/javascript" src="js/jquery-1.8.0.js"></script>
<script type="text/javascript" >
function allChecked() {
		var uidscbs = $("input[name='uids']"); /* 获得复选框 */
		if (uidscbs.attr("checked")) {
			uidscbs.attr("checked", false);
		} else {
			uidscbs.attr("checked", true);
		}
	}
	function reverseChecked() {
		var uidscbs = $("input[name='uids']");
		uidscbs.each(function() {
			$(this).attr("checked", !$(this).attr("checked"));
		});
	}
	function checkDelete() {
		var uidscbs = $("input[name='uids'][checked='checked']");
		if (uidscbs.length == 0) {
			alert("请选择要删除的记录");
			return;
		} else {
			if (confirm("确认删除吗？")) {
				alert("已删除"); 
				$("#user_list_form").attr("action", "user_delete.do");
				$("#user_list_form").submit;
			}
		}
	}
	
	function goFirstPage(){
		$("#page").val("1");
		$("#pageSize").val("${pageModel.pageSize}");
		$("#user_query_form").submit;
	}
	
	function goLastPage(){
		$("#page").val("${pageModel.pageCount}");
		$("#pageSize").val("${pageModel.pageSize}");
		$("#user_query_form").submit;
		
	}
	
	function goNextPage(){
	
		var page = ${pageModel.page};
		page++;
		$("#page").val(page); 
		$("#pageSize").val("${pageModel.pageSize}");
		$("#user_query_form").submit;
	}
	
	function goPrePage(){
		var page = ${pageModel.page};
		page--;
		$("#page").val(page);
		$("#pageSize").val("${pageModel.pageSize}");
		$("#user_query_form").submit;
	}
	
/* 	function conf(){
		 if (!confirm("确认要删除？")) {
		 alert("已删除"); 
         window.event.returnValue = false;
        }
	} */
	function ConfirmDel() {
		if (confirm("真的要删除吗？")){
			alert("已删除"); 
				return true;
		}else{
			return false;
		}
	}
	
</script>

<c:if test="${not empty msg}">
<script type="text/javascript">
	alert("${msg}");
</script>
</c:if>
</head>
<body>
	<hr />
	<center>
		<h1>用户列表</h1>
		<hr />
		<form id="user_query_form" action="user_list" method="post">
		<!-- <input type="hidden" name="page" id="page"/>
		<input type="hidden" name="pageSize" id="pageSize"/>  -->
		用户名:<input type="text" name="queryUserName" value="${queryUserName}"/>  组名:<input type="text" name="queryGroupName" value="${queryGroupName}"/> <input type="submit" value="查询"/>
		</form>
		<br/>
		<form id="user_list_form" method="post">
			<table border="1" cellpadding="4" cellspacing="0">
				<tr>
					<th>选择</th>
					<th>编号</th>
					<th>姓名</th>
					<th>出生时间</th>
					<th>注册时间</th>
					<th>组别</th>
					<th>操作</th>
				</tr>

			<%-- 	<c:forEach items="${list}" var="user">
					<tr>
						<td><input type="checkbox" name="uids" value="${user.id}" />
						</td>
						<td>${user.id}</td>
						<td>${user.name}</td>
						<td>${user.birthday}</td>
						<td>${user.regday}</td>
						<td>${user.group.name}</td>
						<td><s:a href="###">详细信息</s:a>|<s:a href="#">删除</s:a>
						</td>
					</tr>
				</c:forEach>
				<tr>
					<td colspan="1"><input type="button" value="全选" onclick="javascript:allChecked();" /></td>
					<td colspan="1"><input type="button" value="反选" onclick="javascript:reverseChecked();" /></td>
					<td colspan="2"><input type="submit" value="删除选中"onclick="javascript:checkDelete();" /> 
						<input type="hidden" name="pageSize" value="${pageModel.pageSize}" /> 
						<input type="hidden" name="page" value="${pageModel.page}" />
					</td>
				</tr>
 --%>
				<s:if test="list.size==0">
					<tr>
						<td colspan="6">暂无相关数据</td>
					</tr>
				</s:if>
				<s:else>
						<s:iterator value="list" id="user">
							<tr>
								<td>
									<input type="checkbox" name="uids" value="${id}" />
								</td>
								<td>
									<s:property value="#user.id" />
								</td>
								<td>
									<s:property value="#user.name" />
								</td>
								<td>
									<s:date name="#user.birthday" format="yyyy-MM-dd" />
								</td>
								<td>
									<s:date name="#user.regday" format="yyyy-MM-dd" />
								</td>
								<td>
									<s:property value="#user.group.name" />
								</td>
								<td>
									<!-- <s:a href="user_load?uids=%{id}">详细信息</s:a>|<s:a href="user_delete?uids=%{id}&page=%{pageModel.page}&pageSize=%{pageModel.pageSize}" onclick="javascript:return ConfirmDel();">删除</s:a>  -->
									<s:a href="user_load?uids=%{id}">详细信息</s:a>
									|
									<s:a
										href="user_delete?uids=%{id}&page=%{pageModel.page}&pageSize=%{pageModel.pageSize}">删除</s:a>
								</td>
							</tr>
						</s:iterator>
					</s:else>

				<tr>
					<td colspan="2"><input type="button" value="全选" onclick="javascript:allChecked();" />
					<input type="button" value="反选" onclick="javascript:reverseChecked();" /></td>
					<td colspan="2"><input type="submit" value="删除选中" onclick="javascript:checkDelete();" /> 
						<%-- <input type="hidden" name="pageSize" value="${pageModel.pageSize}" />
						<input type="hidden" name="page" value="${pageModel.page}" /> --%>
					</td>
					<td colspan="4"><a href="user_addUser">添加用户</a> </td>
				</tr>
				
			</table>
		</form>
		总共
		<s:property value="pageModel.countAll" />
		条，每页
		<s:property value="pageModel.pageSize" />
		条 ，当前第
		<s:property value="pageModel.page" />
		/
		<s:property value="pageModel.pageCount" />
		页<br />
		 <s:a href="user_list?page=1">首页</s:a>
		|
		<s:a href="user_list?page=%{pageModel.page-1}">上一页</s:a>
		|
		<s:a href="user_list?page=%{pageModel.page+1}">下一页</s:a>
		|
		<s:a href="user_list?page=%{pageModel.pageCount}">尾页</s:a>
		
		<!-- <a href="javascript:void(0);" onclick="javascript:goFirstPage();">首页</a>
		|
		<a href="javascript:void(0);" onclick="javascript:goPrePage();">上一页</a>
		|
		<a href="javascript:void(0);" onclick="javascript:goNextPage();">下一页</a>
		|
		<a href="javascript:void(0);" onclick="javascript:goLastPage();">尾页</a> -->
		<s:debug />
	</center>
</body>
</html>
