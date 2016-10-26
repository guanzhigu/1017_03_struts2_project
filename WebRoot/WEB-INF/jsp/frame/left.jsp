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
<title>left</title>
<ling href="css/left.css" rel="stylesheet" type="text/css">
</head>
<body>
	<table width="100%" border="0">
		<tr>
			<td>
				<div class="dtree">
					<a href="javascript:d.openAll();">展开所有</a>|<a
						href="javascript:d.closeAll();">关闭所有</a>
					<link rel="StyleSheet" href="css/dtree.css" type="text/css" />
					<script type="text/javascript" src="js/dtree.js"></script>
					<script type="text/javascript">
						d = new dTree('d');
						d.add(0, -1, '系统菜单树','','','','images/tree/base.gif');
						d.add(2, 0, '员工管理', 'userAction_showAllUser.action','','right');
						d.add(3,2,'用户管理', 'user/list.jsp','','right');
						document.write(d);
					</script>
				</div>
			</td>
		</tr>
	</table>
</body>
</html>