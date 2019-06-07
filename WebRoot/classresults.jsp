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
							&nbsp;&nbsp;&nbsp;&nbsp;<a href="addresults.jsp">新增</a>  &nbsp;&nbsp;&nbsp;&nbsp;
							<input class="userinput vpr" type="text" placeholder="输入班级" />
							<button class="userbtn">查询</button>
						</div>
					</form>
				</div>
  			<div class="conShow">
                    <table border="1" cellspacing="0" cellpadding="0">
                    <tr>
							<td width="300px" class="tdColor tdC">学号</td>
							<td width="150px" class="tdColor">名字</td>
							<td width="200px" class="tdColor">科目</td>
							<td width="80px" class="tdColor">成绩</td>
							<td width="200px" class="tdColor">任课老师</td>
							<td width="200px" class="tdColor">班级</td>
							<td width="200px" class="tdColor">操作</td>
						</tr>
                           <c:forEach var="cla" items="${requestScope.classgrade }">
                            <tr align="center">
                            <td>${cla.id}</td>
                             <td>${cla.name}</td>
                            <td>${cla.subject}</td>
                            <td>${cla.grade}</td>
                            <td>${cla.teacher}</td>
                            <td>${cla.note}</td>
                            <td><a href="gradeUpdate.jsp?id=${cla.id }&note=${cla.note}"><img class="operation"src="images/update.png">修改成绩</a> 
                          </td>
                        </tr>
                        </c:forEach>
                    </table>
                </div>
      </div>
  </body>
</html>
