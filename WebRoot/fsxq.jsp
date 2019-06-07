<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
  <div class="conShow">
                    <table border="1" cellspacing="0" cellpadding="0">
                    <tr>
							<td width="66px" class="tdColor tdC">编号</td>
							<td width="435px" class="tdColor">学生姓名</td>
							<td width="435px" class="tdColor">分数</td>
							<td width="400px" class="tdColor">课程</td>
							<td width="130px" class="tdColor">备注</td>
						</tr>
                        <tr align="center">
                            <td>1</td>
                             <td>呵呵哒</td>
                            <td><input type="text" value="88"> </td>
                            <td>00001</td>
                            <td>的服务而</td>
                        </tr>
                         <tr align="center">
                            <td>1</td>
                             <td>呵呵哒</td>
                            <td><input type="text" value="88"> </td>
                            <td>00001</td>
                            <td>的服务而</td>
                        </tr>
                         <tr align="center">
                            <td>1</td>
                             <td>呵呵哒</td>
                            <td><input type="text" value="88"> </td>
                            <td>00001</td>
                            <td>的服务而</td>
                        </tr>
                         <tr align="center">
                            <td>1</td>
                             <td>呵呵哒</td>
                            <td><input type="text" value="88"> </td>
                            <td>00001</td>
                            <td>的服务而</td>
                        </tr>
                         <tr align="center">
                            <td>1</td>
                             <td>呵呵哒</td>
                            <td><input type="text" value="88"> </td>
                            <td>00001</td>
                            <td>的服务而</td>
                        </tr>
                    </table>
                </div>
                <div class="bbD" align="center">
						<p class="bbDP">
							<button class="btn_ok btn_yes" href="#">提交</button>
							<a class="btn_ok btn_no" href="#">取消</a>
						</p>
					</div>
  
  </body>
</html>
