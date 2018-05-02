<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<meta charset="utf-8">
<title>vnews</title>
<meta http-equiv="X-UA-Compatible" content="IE=Edge">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="vnews,xiuyuan,news">
<meta http-equiv="description"
	content="vnews 是一个新闻类相关的开源项目,内容都是最近大家关注的事情,不会有任何不良信息或者版权经济问题.若出现类似情况与本博主无关,所有权归本人所有.">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>
<link rel="icon" href="/vnews/static/logo-128x128.png" type="image/x-icon">
<link href="/vnews/css/vnews.css" rel="stylesheet">
<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，1.12.4所以必须放在前边) -->
<script src="https://cdn.bootcss.com/jquery/2.2.1/jquery.min.js"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 style="overflow-x:hidden;overflow-y:scroll"-->
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<body class="scroll">
	
	
	<!-- 标题 data-spy="scroll" data-target="#myScrollspy" data-offset="50" -->
	<div id="vnews-header" class="text-center">
		<img src="/vnews/static/logo-240x160-whilte.png">
	</div>
	<div id="vnews-tab" class="fixed-top">
		<div id="vnew-type" class="container">
			<ul id="myTab" class="nav nav-tabs" role="tablist">
				<li id="head-top" role="presentation"><a href="#"
					aria-controls="vnews-content" role="tab" data-toggle="tab"
					target="_self">头条</a></li>
				<li role="presentation"><a href="#"
					aria-controls="vnews-content" role="tab" data-toggle="tab"
					target="_self">要文</a></li>
				<li role="presentation"><a href="#"
					aria-controls="vnews-content" role="tab" data-toggle="tab"
					target="_self">独家</a></li>
				<li role="presentation"><a href="#"
					aria-controls="vnews-content" role="tab" data-toggle="tab"
					target="_self">科技</a></li>
				<li role="presentation"><a href="#"
					aria-controls="vnews-content" role="tab" data-toggle="tab"
					target="_self">智能</a></li>
				<li role="presentation"><a href="#"
					aria-controls="vnews-content" role="tab" data-toggle="tab"
					target="_self">娱乐</a></li>
				<li role="presentation"><a href="#"
					aria-controls="vnews-content" role="tab" data-toggle="tab"
					target="_self">游戏</a></li>
				<li role="presentation"><a href="#"
					aria-controls="vnews-content" role="tab" data-toggle="tab"
					target="_self">财经</a></li>
				<li role="presentation"><a href="#"
					aria-controls="vnews-content" role="tab" data-toggle="tab"
					target="_self">汽车</a></li>
				<li role="presentation"><a href="#"
					aria-controls="vnews-content" role="tab" data-toggle="tab"
					target="_self">社会</a></li>
				<li role="presentation"><a href="#"
					aria-controls="vnews-content" role="tab" data-toggle="tab"
					target="_self">军事</a></li>
				<li role="presentation"><a href="#"
					aria-controls="vnews-content" role="tab" data-toggle="tab"
					target="_self">体育</a></li>
				<li role="presentation"><a href="#"
					aria-controls="vnews-content" role="tab" data-toggle="tab"
					target="_self">健康</a></li>
				<li role="presentation"><a href="#"
					aria-controls="vnews-content" role="tab" data-toggle="tab"
					target="_self">旅游</a></li>
				<li role="presentation"><a href="#"
					aria-controls="vnews-content" role="tab" data-toggle="tab"
					target="_self">女人</a></li>
				<!-- 		<li><a href="javascript:return false;"  target="_self">更多</a></li>	-->
				<li><a href="#" aria-controls="vnews-content" role="tab"
					data-toggle="tab" target="_self">历史</a></li>
				<li><a href="#" aria-controls="vnews-content" role="tab"
					data-toggle="tab" target="_self">电台</a></li>
				<li><a href="#" aria-controls="vnews-content" role="tab"
					data-toggle="tab" target="_self">航空</a></li>
				<li><a href="#" aria-controls="vnews-content" role="tab"
					data-toggle="tab" target="_self">影视歌</a></li>
				<li><a href="#" aria-controls="vnews-content" role="tab"
					data-toggle="tab" target="_self">股票</a></li>
				<li><a href="#" aria-controls="vnews-content" role="tab"
					data-toggle="tab" target="_self">彩票</a></li>
				<li><a href="#" aria-controls="vnews-content" role="tab"
					data-toggle="tab" target="_self">手机</a></li>
				<li><a href="#" aria-controls="vnews-content" role="tab"
					data-toggle="tab" target="_self">数码</a></li>
				<li><a href="#" aria-controls="vnews-content" role="tab"
					data-toggle="tab" target="_self">轻松一刻</a></li>
				<li><a href="#" aria-controls="vnews-content" role="tab"
					data-toggle="tab" target="_self">房产</a></li>
				<li><a href="#" aria-controls="vnews-content" role="tab"
					data-toggle="tab" target="_self">家居</a></li>
				<li><a href="#" aria-controls="vnews-content" role="tab"
					data-toggle="tab" target="_self">教育</a></li>
				<li><a href="#" aria-controls="vnews-content" role="tab"
					data-toggle="tab" target="_self">时尚</a></li>
				<li><a href="#" aria-controls="vnews-content" role="tab"
					data-toggle="tab" target="_self">政务</a></li>
				<li><a href="#" aria-controls="vnews-content" role="tab"
					data-toggle="tab" target="_self">艺术</a></li>
			</ul>
		</div>
		<!-- 刷新 -->
		<div id="refresh"
			class="alert-link alert-warning text-center container" >
			<span>点击刷新</span> <small><span
				class="glyphicon glyphicon-refresh"></span></small>
			<!-- <div id="loading" class="loading">
				<img src="/vnews/static/loading.gif" alt="" /> 正在加载数据,请稍候...
			</div> -->
		</div>
	</div>

	<!-- 内容 -->
	<div id="vnews-content" class="container tab-content in">
		<div id="myScrollspy">
			<ul id="vnews-content-ul" class="media-list" style="margin-top:5px">
			
			</ul>
		</div>
	</div>
	<script src="/vnews/js/vnews.min.js"></script>
</body>

</html>
