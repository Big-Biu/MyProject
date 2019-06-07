<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
					<span>修改学生信息</span>
				</div>
				<div class="baBody">
				<form action="updateClass?id=${param.id }" method="post">
					<div class="bbD">
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;班级编号：${param.id }
					</div>
					<div class="bbD">
						&nbsp;&nbsp;&nbsp;班级名称：<input type="text" class="input3" name="cname" />
					</div>
					<div class="bbD">
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;班级人数：<input type="text"
							name="cnum" class="input3" />
					</div>
					
					<div class="bbD">
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;备注：<input type="text" name="note" class="input3" />
					</div>
					<div class="bbD">
						<p class="bbDP">
							<input type="submit" class="btn_ok btn_yes" value="提交">
							<a class="btn_ok btn_no" href="allUser">取消</a>
						</p>
					</div>
					</form>
				</div>
			</div>

		</div>
	</div>
  </body>
</html>
