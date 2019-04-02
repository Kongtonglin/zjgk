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
  
  <body>
    <form action="main" >
   <table border=1 style="position:absolute;width:600;height:30;left:20;top:30">
   <tr> <td><input type="checkbox" name="box"  value="1">1.我喜欢把一件事情做完后再做另一件事</td></tr>
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
   <tr> <td><input type="checkbox" name="box"value="20">20.我喜欢需要运用智力的游戏</td> </tr>
    </table>
    
    <table border=1 style="position:absolute;width:600;height:30;left:640;top:30">
   <tr> <td><input type="checkbox"name="box" value="21">21.我很难做那种需要持续集中注意力的工作</td></tr>
   <tr> <td><input type="checkbox" name="box" value="22">22.我喜欢亲自动手制作一些东西，从中得到乐趣</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="23">23.我的动手能力很差</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="24">24.和不熟悉的人交谈对我来说毫不困难</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="25">25.和别人谈判时，我总是很容易放弃自己的观点 </td> </tr>
   <tr> <td><input type="checkbox" name="box" value="26">26.我很容易结识同性朋友</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="27">27.对于社会问题，我通常持中庸的态度</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="28">28.当我开始做一件事情后，即使碰到再多的困难，我也要执著地干下去</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="29">29.我是一个沉静而不易动感情的人</td> </tr>
   <tr> <td><input type="checkbox" name="box"value="30">30.当我工作时，我喜欢避免干扰</td> </tr>
    <tr> <td><input type="checkbox"name="box" value="31">31.我的理想是当一名科学家</td></tr>
   <tr> <td><input type="checkbox" name="box" value="32">32.与言情小说相比，我更喜欢推理小说</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="33">33.有些人太霸道，有时明明知道他们是对的，也要和他们对着干</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="34">34.我爱幻想</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="35">35.我总是主动地向别人提出自己的建议 </td> </tr>
   <tr> <td><input type="checkbox" name="box" value="36">36.我喜欢使用榔头一类的工具</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="37">37.我乐于解除别人的痛苦</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="38">38.我更喜欢自己下了赌注的比赛或游戏</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="39">39.我喜欢按部就班地完成要做的工作</td> </tr>
   <tr> <td><input type="checkbox" name="box"value="40">40.我希望能经常换不同的工作来做</td> </tr>
	 <tr> <td><input type="submit"  name="box" value="确定" align="middle"></td> </tr>
	</table>
	
  <table border=1 style="position:absolute;width:600;height:30;left:1260;top:30">
   <tr> <td><input type="checkbox"name="box" value="41">41.我总留有充裕的时间去赴约会</td></tr>
   <tr> <td><input type="checkbox" name="box" value="42">42.我喜欢阅读自然科学方面的书籍和杂志</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="43">43.如果掌握一门手艺并能以此为生，我会感到非常满意</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="44">44.我曾渴望当一名汽车司机</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="45">45.听别人谈“家中被盗”一类的事，很难引起我的同情</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="46">46.如果待遇相同，我宁愿当商品推销员，而不愿当图书管理员</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="47">47.我讨厌跟各类机械打交道</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="48">48.我小时候经常把玩具拆开，把里面看个究竟</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="49">49.当接受新任务后，我喜欢以自己的独特方法去完成它</td> </tr>
   <tr> <td><input type="checkbox" name="box"value="50">50.我有文艺方面的天赋</td> </tr>
    <tr> <td><input type="checkbox"name="box" value="51">51.我喜欢把一切安排得整整齐齐、井井有条</td></tr>
   <tr> <td><input type="checkbox" name="box" value="52">52.我喜欢作一名教师</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="53">53.和一群人在一起的时候，我总想不出恰当的话来说</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="54">54.看情感影片时，我常禁不住眼圈红润</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="55">55.我讨厌学数学 </td> </tr>
   <tr> <td><input type="checkbox" name="box" value="56">56.在实验室里独自做实验会令我寂寞难耐</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="57">57.对于急躁、爱发脾气的人，我仍能以礼相待</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="58">58.遇到难解答的问题时，我常常放弃</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="59">59.大家公认我是一名勤劳踏实的、愿为大家服务的人</td> </tr>
   <tr> <td><input type="checkbox" name="box"value="60">60.我喜欢在人事部门工作</td> </tr>

	</table>
    </form>
  </body>
</html>
