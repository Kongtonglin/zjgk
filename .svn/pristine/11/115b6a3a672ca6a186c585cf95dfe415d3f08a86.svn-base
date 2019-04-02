<%@ page language="java" import="java.util.*,java.sql.*" pageEncoding="UTF-8"%>

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
	<link rel="stylesheet" href="assets/css/bootstrap.min.css">
	<link rel="stylesheet" href="assets/vendor/font-awesome/css/font-awesome.min.css">
	<link rel="stylesheet" href="assets/vendor/linearicons/style.css">
	
	<!-- main css from tmp-->
	<link rel="stylesheet" href="assets/css/login.css">
 
	<!-- ICONS 
	<link rel="apple-touch-icon" sizes="76x76" href="assets/img/apple-icon.png">
	<link rel="icon" type="image/png" sizes="96x96" href="assets/img/favicon.png">
	-->
	
</head>

<body class="layout-fullwidth">
<!--navbar-collapse -->
    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#" >浙江高考查询系统</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse navbar-right">
          <p>
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
			<!-- MAIN CONTENT -->
			<div class="main-content">
				<div class="container-fluid">
					<!--<h3 class="page-title"></h3>-->
					
					<!--search form-->
					<div class="row">
						<div class="col-md-12">
							<div class="panel">
								
								<div class="panel-body">
								
								<form  class="form-horizontal" action="Check" method="post">
									<fieldset>
										<div class="form-group">
											<label class="col-sm-2 control-label">专业类型:</label>
											<div class="col-sm-8">
												<select class="form-control"  id="majorId" name="major">
												<option value="1">哲学</option>
												<option value="2">经济学</option>
												<c:if test="${major eq '3'}">
												<option value="3" selected>法学</option>
												</c:if>
												<option value="4">教育学</option>
												<option value="5">文学</option>
												<option value="6">历史学</option>
												<option value="7">理学</option>
												<option value="8">工学</option>
												<option value="9">农学</option>
												<option value="10">医学</option>
												<option value="11">管理学</option>
												<option value="12">艺术学</option>
												</select>
											</div> 
											<div class="col-sm-2"></div> 
										</div>
										<div class="form-group">
											<label class="col-sm-2 control-label" >全国排名:</label>
											<div class="col-sm-3">
												<select class="form-control"  id="numId"  name="num">
												<option value="all">全部</option>
												<option value="50">前50</option>
												<option value="100">前100</option>
												<option value="150">前150</option>
												<option value="200">前200</option>
												<option value="250">前250</option> 
												<option value="300">前300</option>   
												</select>
											</div>
											<label class="col-sm-2 control-label" >弃选科目:</label>
											<div class="col-sm-3">
												<select class="form-control"   id="subjectId"  name="subject">
												<option value="不">不限</option>
												<option value="物理">物理</option>
												<option value="化学">化学</option>
												<option value="生物">生物</option>
												<option value="信息">信息</option>
												<option value="历史">历史</option>
												<option value="地理">地理</option>
												<option value="思想政治">思想政治</option>
												</select>
											</div>
											<div class="col-sm-2"></div>  
										</div>
									<div class="form-group">
											<label class="col-sm-2 control-label" >可选的学校数:</label>
											<div class="col-sm-8">
												<input type="text" class="form-control" value="${x}"  disabled/>
											</div>
											
											<div class="col-sm-2"></div> 
										</div>
										
										 
										<div class="form-group">
											<div class="col-sm-2">
											</div>
											<div class="col-sm-8">
												<input type="submit" class="btn btn-primary btn-block"   value="查询"    />
											</div>
											
										</div>
										
									</fieldset>
								</form>
								
								</div>
							</div>
						</div>
					</div>
					
				
		</div>
		<!-- END MAIN -->
		<div class="clearfix"></div>
		</div>
	</div>
	</div>
	<!-- END WRAPPER -->
 
		
	<!-- Javascript -->
	<script src="assets/vendor/jquery/jquery.min.js"></script>
	<script src="assets/vendor/jquery/jsrender.js"></script>
	<script src="assets/vendor/bootstrap/js/bootstrap.min.js"></script>
	<script src="assets/vendor/jquery-slimscroll/jquery.slimscroll.min.js"></script>
	<script src="assets/vendor/chartist/js/chartist.min.js"></script>
	<script src="assets/scripts/klorofil-common.js"></script>
	<!--  <script>
	 
	$(document).ready(function() {
		//get score info
		$.ajax({
			url: "Get.java",
	        type: "post",
	        success: function(data) {
	        	  $("#SchoolId").val(data);
	        	  alret("获取成功"+data);
	        },
	        error: function(data) {
	        	alret("系统出错"+data);
	        }
	    });
		
	}
	</script>   -->
	

</body>

</html>
