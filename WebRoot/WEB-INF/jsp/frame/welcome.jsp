<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>welcome</title>
<link href="${pageContext.request.contextPath}/css/Style.css"
	type="text/css" rel="stylesheet" />
<style type="text/css">
<!--
body {
	background-color: #FFFFFF;
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}

body, td, th {
	color: #000000;
}
-->
</style>
<style>
BODY {
	SCROLLBAR-FACE-COLOR: #cccccc;
	SCROLLBAR-HIGHLIGHT-COLOR: #ffffFF;
	SCROLLBAR-SHADOW-COLOR: #ffffff;
	SCROLLBAR-3DLIGHT-COLOR: #cccccc;
	SCROLLBAR-ARROW-COLOR: #ffffff;
	SCROLLBAR-TRACK-COLOR: #ffffFF;
	SCROLLBAR-DARKSHADOW-COLOR: #cccccc;
}
</style>
</head>
<body>
	<form name="Form1" method="post" action="name" id="Form1">
		<table width="100%" height="88" border="1"
			background="images/back1.jpg">
			<tr>
				<td colspan=3 class="ta_01" align="center" bgcolor="#afd1f3"><strong>系统首页</strong>
				</td>
			</tr>
			<tr>
				<td width="65%" height="84" align="center" valign="top"><span
					class="Style1">登录成功！</span></td>
			</tr>
			<tr>
				<td height=2></td>
			</tr>
		</table>
	</form>
</body>
</html>