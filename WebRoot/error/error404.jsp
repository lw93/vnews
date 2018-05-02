<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  
    <meta charset="UTF-8" />
    <title>error page</title>
	 <meta http-equiv="X-UA-Compatible" content="IE=Edge">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="vnews,xiuyuan,news">
	<meta http-equiv="description" content="404">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="stylesheet" href="<%=path%>/css/bootstrap.min.css" />

</head>
  
  <body>

	<div class="container" align="center">
		<div style="margin-top:15%">
			<h1>404</h1>
			<h3>Opps, You're lost.</h3>
			<p>We can not find the page you're looking for.</p>
			<a class="btn btn-big" href="<%=path%>/index.jsp">Back to Home</a>
		</div>
	</div>

</body>
</html>
