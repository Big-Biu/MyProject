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
 <c:set var="g" value="${requestScope.stug}"/>
  <div class="conShow">
                    <table border="1" cellspacing="0" cellpadding="0">
                    <tr>
							<td width="66px" class="tdColor tdC">编号</td>
							<td width="435px" class="tdColor">名字</td>
							<td width="400px" class="tdColor">科目</td>
							<td width="130px" class="tdColor">成绩</td>
						</tr>
                            <tr align="center">
                            <td>1</td>
                            <td>${g.name }</td>
                            <td>${g.subject }</td>
                            <td>${g.grade }</td>
                        </tr>
                    </table>
                </div>
  
  </body>
</html>
