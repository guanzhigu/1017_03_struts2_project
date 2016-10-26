<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>list</title>
<script type="text/javascript">
	function addUser(){
		document.Form1.action="user/add/jsp";
		document.Form1.submit();
	}
</script>
</head>
<body>
	<br>
	<form id="Form1" name="Form1" action="user/list.jsp" method="post">
		<table cellspacing="1" cellpadding="0" width="100%" align="center"
			bgcolor="#f5fafe" border="0">
			<TBODY>
				<tr>
					<td class="ta_01" align="center" bgcolor="#afd1f3"><strong>查询条件</strong>
					</td>
				</tr>
				<tr>
					<td>
						<table cellpadding="0" cellspacing="0" border="0" width="100%">
							<tr>
								<td height="22" align="center" bgcolor="#f5fafe" class="ta_01">用户名</td>
								<td class="ta_01" bgcolor="#fff"><input type="text"
									name="username" size="15" value="" id="Form1_username"
									class="bg"></td>
								<td height="22" align="center" bgcolor="#f5fafe" class="ta_01">性别：</td>
								<td class="ta_01" bgcolor="#fff"><select name="sex"
									id="sex">
										<option value="">---选择性别---</option>
										<option value="男">男</option>
										<option value="女">女</option>
								</select></td>
							</tr>
							<tr>
								<td height="22" align="center" bgcolor="#f5fafe" class="ta_01">学历</td>
								<td class="ta_01" bgcolor="#fff"><select name="education"
									id="education">
										<option value="">--选择学历--</option>
										<option value="博士">博士</option>
										<option value="硕士">硕士</option>
										<option value="研究生">研究生</option>
										<option value="本科">本科</option>
										<option value="专科">专科</option>
										<option value="高中">高中</option>
								</select></td>
								<td height="22" align="center" bgcolor="#f5fafe" class="ta_01">是否上传简历</td>
								<td class="ta_01" bgcolor="#fff"><select name="isUpload"
									id="isUpload">
										<option value="">--请选择--</option>
										<option value="1">有</option>
										<option value="2">无</option>
								</select></td>
							</tr>
							<tr>
								<td width="100" heiht="22" align="center" bgcolor="#f5fafe"
									class="ta_01"></td>
								<td class="ta_01" bgcolor="#fff"><font face=""></td>
							</tr>
						</table>
					</td>
				</tr>
			</TBODY>
		</table>
	</form>
</body>
</html>