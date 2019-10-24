<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="<%= request.getContextPath() %>"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=Edge">
<title>健康国医馆-${title}</title>
<link type="text/css" rel="stylesheet"
	href="${ctx}/static/css/style.css" />
</head>
<body>
	<div class="admin_header">
		<div class="container clearfix">
			<h1 class="logo">
				<a href=""> <img src="${ctx}/static/images/logo.png" />
				</a>
			</h1>
			<span class="logo_text">健康国医管理后台</span>
			<div class="heder_right">
				<a href="" class=""><i class="iconfont icon-gerenzhongxin"></i>hdjksfjfsd</a>
				<a href="" class=""><i class="iconfont icon-tuichu"></i>退出</a>
			</div>
		</div>
	</div>