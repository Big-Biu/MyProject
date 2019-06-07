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
    
    <title>My JSP 'person.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	  <link rel="stylesheet" type="text/css" href="css/common.css"/>
<link rel="stylesheet" type="text/css" href="css/css.css" />
<script type="text/javascript" src="js/jquery.min.js"></script>
  </head>
  
  <body>
  <div class="connoisseur">
				<div class="conform">
				<form action="userSearch" method="post">
						<div class="cfD" >
							&nbsp;&nbsp;&nbsp;&nbsp;<a href="useradd.jsp">新增</a>  &nbsp;&nbsp;&nbsp;&nbsp;
							<input name="name" class="userinput vpr" type="text" placeholder="输入学生姓名" />
							<input type="submit" class="userbtn" value="查询">
						</div>
						</form>
				</div>
  			<div class="conShow">
                    <table border="1" cellspacing="0" cellpadding="0">
                    <tr>
							<td width="366px" class="tdColor tdC">学号</td>
							<td width="365px" class="tdColor">姓名</td>
							<td width="365px" class="tdColor">密码</td>
							<td width="360px" class="tdColor">性别</td>
							<td width="360px" class="tdColor">操作</td>
						</tr>
						<c:forEach var="stu" items="${requestScope.stuList }">
							<tr>
								<td>${stu.id }</td>
								<td>${stu.name }</td>
								<td>${stu.psw }</td>
								<td>${stu.sex }</td>
                          <td><a href="userupdate.jsp"><img class="operation"src="images/update.png"></a> 
                            <a href="userDel?id=${stu.id }"><img class="operation delban"src="images/delete.png"></a></td></tr>
                       </c:forEach>
                    </table>
                    <a href="allUser?page=1">1</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="allUser?page=2">2</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="allUser?page=3">3</a>
                    &nbsp;&nbsp;&nbsp;&nbsp;<a href="allUser?page=4">4</a>
                    &nbsp;&nbsp;&nbsp;&nbsp;<a href="allUser?page=5">5</a>
                </div>
      </div>
  </body>
</html>
