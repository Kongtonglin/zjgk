<%@ page language="java" import="java.util.*,java.sql.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html lang="zh-CN" class="fullscreen-bg">

<head>
	<title>浙江省高考志愿推荐系统</title>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="description" content="高考 志愿 填写 推荐">
	<meta name="description" content="高考志愿填写推荐">
	<meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">   
	
	<!-- vendor css -->
	<link rel="stylesheet" href="assets/css/bootstrap.css">
	<link rel="stylesheet" href="assets/vendor/font-awesome/css/font-awesome.min.css">
	<link rel="stylesheet" href="assets/vendor/linearicons/style.css">
	
	<!-- main css from tmp-->
	<link rel="stylesheet" href="assets/css/main.css">
 
	<!-- ICONS 
	<link rel="apple-touch-icon" sizes="76x76" href="assets/img/apple-icon.png">
	<link rel="icon" type="image/png" sizes="96x96" href="assets/img/favicon.png">
	-->
	
</head>

<body class="layout-fullwidth  text-center ">
<!--navbar-collapse -->
    <nav class="navbar  navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand"  >浙江省高考志愿推荐系统</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse navbar-right">
          <p>
          <a class="btn btn-primary " href="#" role="button">高级推荐&raquo;</a>
          	&nbsp;
          <a class="btn btn-primary " href="login.html" role="button">返回 &raquo;</a>
          </p>
        </div>
      </div>
    </nav>
    <!-- END NAVBAR -->
	<!-- WRAPPER -->
	<div id="wrapper">
		<!-- MAIN -->
		<div class="main">
		<a class=" navbar-center"  >7选3的选考科目推荐是帮助学生根据自身情况扬长避短</a> 
		<br>
		<a class=" navbar-center"  >针对期望报考的专业，推荐较为合适的选考科目组合</a> 
			<!-- MAIN CONTENT -->
			<div class="main-content">
				<div class="container-fluid">
					<!--search form-->
					<div class="row">
						<div class="col-md-12">
							<div class="panel">
								<div class="panel-body">
								<form role="form"  id="optionalFormId"  method="post"  class="form-horizontal"  action="user/optional">									<fieldset>
										<div class="form-group">
											<label class="col-sm-2 control-label">专业类型:</label>
											<div class="col-sm-8">
												<select class="form-control"  id="majorId" name="major">
												</select>
											</div> 
											<div class="col-sm-2"></div> 
										</div>
										<div class="form-group">
											<label class="col-sm-2 control-label" >期望报考的院校排名:</label>
											<div class="col-sm-3">
												<select class="form-control"  id="schoolId"  name="school">
												</select>
											</div>
											<label class="col-sm-2 control-label" >不愿报考科目:</label>
											<div class="col-sm-3">
												<select class="form-control"   id="subjectId"  name="subject">
												</select>
											</div>
											<div class="col-sm-2"></div>  
										</div>
										<div class="form-group">
											<div class="col-sm-2">
											</div>
											<div class="col-sm-8">
												<input type="button" class="btn btn-primary btn-block"    id="optionalId"  onclick=" javascript:optionaldation();" value="查询"    />
											</div>
										</div>
									</fieldset>
								</form>
								
								</div>
							</div>
						</div>
					</div>
		</div>
		<!--search result-->
					<div class="row"  id="resultId"  >
						<div class="col-md-12">
							<div class="panel">
								<div class="panel-heading">
									<h3 class="panel-title"></h3>
								</div>
								<div class="panel-body">
									<table class="table table-striped">
										<thead>
											<tr>
												<th>序号</th>
												<th>推荐科目一</th>
												<th>推荐科目二</th>
												<th>推荐科目三</th>
											</tr>
										</thead>
										<tbody  id="tbodyId" align="left">
										
										</tbody>
									</table>
								</div>
							</div>
						</div>
					</div>
					 	 <a class=" navbar-center"  >以上结果仅针对学生个人情况进行无责推荐</a> 
				</div>
			</div>
			<!-- END MAIN CONTENT -->
		<!-- END MAIN -->
		
		</div>
	
	<!-- END WRAPPER -->
 
		
	<!-- Javascript -->
	<script src="assets/vendor/jquery/jquery.min.js"></script>
	<script src="assets/vendor/jquery/jsrender.js"></script>
	<script src="assets/vendor/bootstrap/js/bootstrap.min.js"></script>
	<script src="assets/vendor/jquery-slimscroll/jquery.slimscroll.min.js"></script>
	<script src="assets/vendor/chartist/js/chartist.min.js"></script>
	<script src="assets/scripts/klorofil-common.js"></script>

<script>

$(document).ready(function() {
	//get score info
	
	//专业类型
	$.ajax({
        type: "get",
        url: "common/majorId",
        success: function(data) {
          if(data.success==1){ 
        	  var h = $.templates("#majorTempId").render(data);
        	  h = "<option  value=-1 selected>请选择</option>" + h;
        	  $("#majorId").html(h); 
          }
        }
    });
	
	//期望报考院校
	$.ajax({
        type: "get",
        url: "common/schoolId",
        success: function(data) {
          if(data.success==1){ 
        	  var h = $.templates("#subjectTempId").render(data);
        	  h = "<option  value=-1 selected>请选择</option>" + h ;
        	  $("#schoolId").html(h); 
          }
        }
    });
	
	//不愿报考科目
	$.ajax({
        type: "get",
        url: "common/subjectId",
        success: function(data) {
          if(data.success==1){ 
        	  var h = $.templates("#subjectTempId").render(data);
        	  h = "<option  value=-1 selected>请选择</option>" + h;
        	  $("#subjectId").html(h); 
          }
        }
    });
	 
	
});//end document ready


var optionaldation = function () {
	if($("#majorId").val()==-1){
		alert("请选择专业类型！");
		$("#majorId").parent().addClass("has-error");
		$("#majorId").change(function(){
			$("#majorId").parent().removeClass("has-error");
		});
		return false; 
	}
	
	if($("#subjectId").val()==-1){
		alert("请选择不愿报考科目！");
		$("#subjectId").parent().addClass("has-error");
		$("#subjectId").change(function(){
			$("#subjectId").parent().removeClass("has-error");
		});
		return false; 
	}
	
	if($("#schoolId").val()==-1){
		alert("请选择学校排名！");
		$("#schoolId").parent().addClass("has-error");
		$("#schoolId").change(function(){
			$("#schoolId").parent().removeClass("has-error");
		});
		return false; 
	}
	 
	 $.ajax({
	       url: "common/optionaldation",
	       type: "post",
	       data:$("#optionalFormId").serialize(),
	       async: true,
	       success: function (data) {  
	    	   if(data.data.length>0){
	    		   $("#resultId").css("display","");
	    		   var h = $.templates("#optionaldationListTempId").render(data);
	    		   $("#tbodyId").html(h);
	    	   }else{
	    		   $("#resultId").css("display","");
	    		   $("#tbodyId").html("<tr><td cospan=4>查询出错</td></tr>");
	    	   }
	       }		          
	}); 

}
</script>
<script id="majorTempId" type="text/x-jsrender">
{{for data}}
<option value={{:id}}>{{:name}}</option>
{{/for}}
</script> 
<script id="subjectTempId" type="text/x-jsrender">
{{for data}}
<option value={{:name}}>{{:name}}</option>
{{/for}}
</script>

<script id="optionaldationListTempId" type="text/x-jsrender">
{{for data}}
<tr>
	<td>{{:id}}</td>
	<td>{{:subject1}}</td>
	<td>{{:subject2}}</td>
	<td>{{:subject3}}</td>
	</tr>
{{/for}}
</script> 
</body>
<footer id="footer" >
		<div class="container">
			<div class="row" >
			   <div class="col-sm-12 col-xs-12">Copyright &copy; 2017-2020 杭州数翊信息技术有限公司 版权所有. </div> 
			</div>
		</div>
	</footer>
</html>
