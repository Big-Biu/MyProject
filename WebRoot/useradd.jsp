<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'useradd.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" type="text/css" href="css/css.css" />
<script type="text/javascript" src="js/jquery.min.js"></script>

  </head>
  
  <body>
   <div id="pageAll">
		<div class="page ">
			<div class="banneradd bor">
				<div class="baTopNo">
					<span>新增学生</span>
				</div>
				<div class="baBody">
				<form action="addUser" method="post">
					<div class="bbD">
						&nbsp;&nbsp;&nbsp;用户名：<input type="text" class="input3" name="addUname" />
					</div>
					<div class="bbD">
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;密码：<input type="password"
							class="input3" name="addUpsw"/>
					</div>
					<div class="bbD">
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;学号：<input type="text" class="input3" name="addUid"/>
					</div>
					<div class="bbD">
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;性别：<input type="text" class="input3" name="addUsex" />
					</div>
					<div class="bbD">
						<p class="bbDP">
							<input type="submit" class="btn_ok btn_yes" href="#" value="提交">
							<a class="btn_ok btn_no" href="person2.jsp">取消</a>
						</p>
					</div>
					
					</form>
				</div>
			</div>

		</div>
	</div>
  </body>
</html>
