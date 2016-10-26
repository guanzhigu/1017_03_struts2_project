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
<title>home</title>
<script>
	body{
		SCROLLBAR-ARROW-COLOR:#fff; 
		SCROLLBAR-BASE-COLOR:#def3f7;
	}
</script>
</head>
<frameset rows="103,*,43" frameborder=0 border="0" framespacing="0">
	<frame src="forwardAction.action?method=top" name="top" scrolling="NO"
		noresize>
	<frameset cols="159,*" frameborder="0" border="0" framespacing="0">
		<frame src="forwardAction.action?method=left" name="left" noresize
			scrolling="YES">
		<frame src="forwardAction.action?method=welcome" name="right">
	</frameset>
	<frame src="forwardAction.action?method=bottom" name="bottom"
		scrolling="NO" norsize>
</frameset>
</html>