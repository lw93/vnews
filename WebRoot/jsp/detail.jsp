<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE=html>  
<html>  
<head>  
<meta charset="utf-8">
<title>detail</title>
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
<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>  
<body>
	<div class="fixed-top navbar-fixed-top fade in ">
		<div class="focus-disabled div-inline">
		<img width="180" height="50" alt="logo" src="/vnews/static/logo-50x180-whilte.png"> 
		<a id="home" href="/vnews/" target="_blank">首页</a>
		<strong class="text-muted">/</strong>
		<a id="tab-title" href="/vnews/" target="_blank">detail</a>
		<strong class="text-muted">/</strong>
		<span class="text-muted">正文</span>
		</div>
		<div id="vnews-body-title" class="div-inline div-inline-center">
			<strong><h3></h3></strong>
		</div>
		<HR width=100% color=#987cb9 SIZE=1>
	</div>
	<!-- <div class="main" style="height:700px;overflow:auto;">  
      
        <div class="child" style='border:1px solid red;margin-top:20px;color:grey;height:800px' >
        </div>  
    </div>   -->
 <div id="vnews-body" class="container lead vnews-body">
 	<div id="exchange-body">   
			
  	</div>
  </div>
</body>


<script src="/vnews/js/detail.min.js"></script>  
<!-- <script  type="text/javascript">  
$(document).ready(function(){  
    $(".main").unbind("scroll").bind("scroll", function(e){  
        var sum = this.scrollHeight;  
        if (sum <= $(this).scrollTop() + $(this).height()) {  
            $(".main").append($(".child").clone());  
        }  
    });  
});  
</script>   -->
</html> 