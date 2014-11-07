<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>已发邮件</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="css/mail_success.css">
	<style type="text/css">
	li{ display:inline;list-style: none;margin-left:20px;} 
	</style>

<style>
tr {
	padding: 5px;
	
}
</style>
<script language=javascript>
	function changebg(obj, cl) {
		var bgcolor;
		if (cl == "0") {
			bgcolor = "#E2EDFC";
		} else {
			bgcolor = "#F8FBFE";
		}
		obj.style.backgroundColor = bgcolor;
	}
</script>

<script type="text/javascript" language="javascript">  
    function checkall() {  
        var a = document.getElementsByTagName("input");  
        if (document.getElementById("selectAll").checked == true) {  
            for ( var i = 0; i < a.length; i++)  
                if (a[i].type == "checkbox")  
                    a[i].checked = true;  
        } else {  
            for ( var i = 0; i < a.length; i++)  
                if (a[i].type == "checkbox")  
                    a[i].checked = false;  
        }  
    }  
  
    function getIdStr() {  
        var idStr = "";  
        var temp = "";  
        var a = document.getElementsByName("id");  
        for ( var i = 0; i < a.length; i++) {  
            if (a[i].checked) {  
                temp = a[i].value;  
                idStr = idStr + "," + temp;  
            }  
        }  
        document.getElementById("idStr").value = idStr.substring(1,  
                idStr.length);  
        document.getElementById("deleteForm").submit();  
    }  
</script>  
</head>

<body>

<div class="nav">
		<ul>
		<li><a href="index.jsp" target="_top"><img src="img/return.png" >返回主页</a></li>
		<li><a href="list_sent_mail.action"><img src="img/mail.png">查看已发邮件</a></li>
		<li><a href="write_mail.jsp"><img src="img/write.png">继续写信</a></li>
		</ul>
		</div>
		<div class="mail_pic"><img src="img/sentmail.png"></div><div class="mail_suc">未发邮件</div>
		
		<p>
		 <input type="checkbox" id="selectAll"  
            onclick="checkall()"><label for="selectAll">全选</label>  <button  
            id="deleteAll" onclick="getIdStr()">删除</button>  
        <form action="mailaction!delete_draft_mail.action" method="post" id="deleteForm">  
            <input type="hidden" id="idStr" name="idStr" />  
        </form>  
        
        
	<table width="100%" border="0" cellpadding="0" cellspacing="0"
		bgcolor="fafafa" style="font-size:12px">
		<tr style="background-color: #DBDBD4" height="30px">
			<td width="5%"><input type="checkbox"></td>
			<td width="10%">收件人</td>
			<td width="50%">主题</td>
			<td width="10%">时间</td>
		</tr>
		 <s:iterator value="list_draft_mail" var="mail">
		<tr onmousemove=javascript:changebg(this,0)
			style="backgroud-color:#f8fbfe"
			onmouseout=javascript:changebg(this,1) height="30px">
			<td width="5%"><input type="checkbox" value="${mail.id}" name="id"></td>
			<td width="10%"><s:property value="#mail.mail_to"/></td>
			<td width="50%">
			<a href="mailaction!find_mail_by_id.action?mail.id=${mail.id}">
			<s:property value="#mail.mail_subject"/>
			</a>
			</td>
			<td width="10%"><s:property value="#mail.date"/></td>
		</tr>
		</s:iterator>
          <s:iterator value="pageBean">
                        
                        <tr height="20px"> 
                      
                        <td  colspan="5" bgcolor="#DBDBD4" align="center" colspan="1">
                        	共<FONT color="red"><s:property value="allRow"/></FONT>条记录
                        	共<FONT color="red"><s:property value="totalPage"/></FONT>页
                        	当前第<FONT color="red"><s:property value="currentPage"/></FONT>页
                        	<s:if test="%{currentPage == 1}">
                        	第一页  上一页
                        	</s:if>
                        <s:else>
                        <a href="list_draft_mail.action?currentPage=1"><FONT color="black">第一页</FONT></a>
                        
                         <a href="list_draft_mail.action?currentPage=<s:property value="%{currentPage-1}"/>"><FONT color="black">上一页</FONT></a>
                        </s:else>
                        <s:if test="%{currentPage != totalPage}">
                         <a href="list_draft_mail.action?currentPage=<s:property value="%{currentPage+1}"/>"><FONT color="black">下一页</FONT></a>
                         <a href="list_draft_mail.action?currentPage=<s:property value="totalPage"/>"><FONT color="black">最后一页</FONT></a>
                        
           				</s:if>
           				<s:else>
           				下一页 最后一页
           				</s:else>
                        
                        </td>
                     
                        
                        </tr>
                        
                        </s:iterator>
        
	</table>
</body>
</html>
