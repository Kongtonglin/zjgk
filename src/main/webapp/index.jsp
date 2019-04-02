<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
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
  <body style="background-image: url(assets/img/rlie_.png);background-position:50% 50%;background-size:60% 97%; margin:10%;background-repeat:no-repeat;
  background-color:#97FFFF" >
  <div >
    <form action="first"  >
   <table border=0 style="width:500;height:30;margin-top:1%;"  align="center">
   <tr> <td>尊敬的同学：十分感谢您抽出时间填写此份问卷，若符合自身情况请在问题前的框内打勾，最终结果仅作为个人参考!</td></tr>
   <tr> <td><input type="checkbox"name="box"  value="1" >1.我喜欢把一件事情做完后再做另一件事</td></tr>
   <tr> <td><input type="checkbox" name="box" value="2">2.在工作中我喜欢独自筹划，不愿受别人干涉</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="3">3.在集体讨论中，我往往保持沉默</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="4">4.我喜欢做戏剧、 音乐、 歌舞、 新闻采访等方面的工作</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="5">5.每次写信我都一挥而就，不再重复</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="6">6.我经常不停地思考某一问题，直到想出正确的答案</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="7">7.对别人借我的和我借别人的东西，我都能记得很清楚</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="8">8.我喜欢抽象思维的工作，不喜欢动手的工作</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="9">9.我喜欢成为人们注意的焦点</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="10">10.我喜欢不时地夸耀一下自己取得的好成就</td> </tr>
    <tr> <td><input type="checkbox"name="box" value="11">11.我曾经渴望有机会参加探险</td></tr>
   <tr> <td><input type="checkbox" name="box" value="12">12.当我一个独处时，会感到更愉快</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="13">13.我喜欢在做事情前，对此事情做出细致的安排</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="14">14.我讨厌修理自行车、电器一类的工作</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="15">15.我喜欢参加各种各样的聚会</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="16">16.我愿意从事虽然工资少、但是比较稳定的职业</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="17">17.音乐能使我陶醉</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="18">18.我办事很少思前想后</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="19">19.我喜欢经常请示上级</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="20">20.我喜欢需要运用智力的游戏</td> </tr>
   <tr> <td><input type="submit" value="下一页" ></td> </tr>
    </table>
    </form></div>
  </body>
</html>
