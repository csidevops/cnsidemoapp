<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
<meta charset="utf-8">
<meta name="mobile-web-app-capable" content="yes">
<meta name="viewport"
	content="width=device-width,minimum-scale=1.0,maximum-scale=1.0">
<meta name="keywords" content="">
<meta name="description" content="">
<title>My Web Application</title>
<link rel="shortcut icon" href="img/favicon.png">
<link rel="stylesheet"
	href="css/style.css?<%=System.currentTimeMillis()%>" />

</head>
<body>

	<header>
		<div>
			<h2>
				<c:out value="Demo Web Application" />
			</h2>
		</div>
	</header>
	<div style="text-align: left; background-color: #f0f0f0">
		<strong>Azure DevOps Training Details for C&SI Team </strong>
	</div>
	<br/>
	<div> 1. Azure DevOps Initial Setup </div>
	<div> 2. Azure DevOps Project Creation </div>
	<div> 3. Azure DevOps CI Pipeline Setup </div>
	<div> 4. Azure DevOps CD Pipeline Setup </div>		
	<div> 5. Azure App Service Deployment </div>
	<br/>
