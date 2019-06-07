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
					<form>
						<div class="cfD" >
							&nbsp;&nbsp;&nbsp;&nbsp;<a href="classadd.jsp">新增</a>  &nbsp;&nbsp;&nbsp;&nbsp;
							<input class="userinput vpr" type="text" placeholder="输入班级名称" />
							<button class="userbtn">查询</button>
						</div>
					</form>
				</div>
  			<div class="conShow">
                    <table border="1" cellspacing="0" cellpadding="0">
                    <tr>
							<td width="66px" class="tdColor tdC">班级编号</td>
							<td width="435px" class="tdColor">班级姓名</td>
							<td width="435px" class="tdColor">班级人数</td>
							<td width="400px" class="tdColor">备注</td>
							<td width="130px" class="tdColor">操作</td>
						</tr>
						<c:forEach var="cla" items="${requestScope.class }">
                            <tr align="center">
                            <td>${cla.cid}</td>
                             <td><a href="classGradeServlet?id=${cla.cid }">
                             ${cla.cname}</a></td>
                            <td>${cla.cnum}</td>
                            <td>${cla.cnote}</td>
                            <td><a href="classUpdate.jsp?id=${cla.cid}"><img class="operation"src="images/update.png"></a> 
                           <a href="delClass?id=${cla.cid }">  <img class="operation delban"src="images/delete.png"></a></td>
                        </tr>
                        </c:forEach>
                    </table>
                </div>
      </div>
  </body>
</html>
