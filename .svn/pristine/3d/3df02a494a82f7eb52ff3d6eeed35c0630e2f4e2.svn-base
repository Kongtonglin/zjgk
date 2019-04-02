<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page  import="com.zjgk.diaocha.fenlei"%>
<%@ page  import="com.zjgk.diaocha.xianshi"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'success.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
   <style> 
table 
  {   border-collapse:   separate;   border-spacing:   10px;   } 
</style> 
  <body style="background-image: url(assets/img/rlie_.png);background-position:50% 50%;background-size:60% 97%; 
  margin-top:10%;margin-bottom:10%;margin-left:18%; margin-right:18%;background-repeat:no-repeat;
  background-color:#97FFFF" >
    <div align="center">
   <table style="margin-top:8%;margin-left:11%; margin-right:11%;margin-bottom:10%; text-align: center;" border="2" >	
   <% ArrayList al = (ArrayList)request.getAttribute("sort");  %>
  			<tr>
  				<th style="width: 24%; " >形态</th>
  				<th style="width: 57%; ">人格倾向</th>
  			</tr>
  			 	
  			 <% for(int i=0;i<3;i++){ fenlei f=new fenlei();%>
  			<tr>
  				<td> <%=al.get(i)%></td>
  				<td><%=f.helo(""+al.get(i)) %></td>
  			</tr>
  			 <% } xianshi xs=new xianshi();%>
  			 <tr>
  				<th colspan="2">职业推荐</th>
  				
  			</tr>
  			 <tr>
  				<td colspan="2"><%=xs.rt(""+al.get(0)+al.get(1)+al.get(2))%></td>
  			</tr>
  			<tr> <td colspan="2"><a href="login.html"><input type="button"  value="返回" align="middle" ></a></td> </tr>
  			</table>
  		    </div> 
  		    </body>
			</html>
