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
					<span>新增班级课程分数</span>
				</div>
				<div class="baBody">
					<div class="bbD">
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;班级：
						<select class="input3" >
							<option>一班</option>
							<option>二班</option>
							<option>三班</option>
						</select>
					</div>
					<div class="bbD">
						&nbsp;&nbsp;课程名称：<input type="password"
							class="input3" />
					</div>
					<div class="bbD">
						<p class="bbDP">
							<button class="btn_ok btn_yes" onclick="window.location.href='addfsxq.jsp'">下一步</button>
							<a class="btn_ok btn_no" href="#">取消</a>
						</p>
					</div>
				</div>
			</div>

		</div>
	</div>
  </body>
</html>
