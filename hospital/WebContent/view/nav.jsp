<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="<%= request.getContextPath() %>"></c:set>
<c:if test="${activeCss=='reservation'}">
	<c:set var="reservActive" value="active"></c:set>
</c:if>
<c:if test="${activeCss=='hospital'}">
	<c:set var="hospitalActive" value="active"></c:set>
</c:if>
<c:if test="${activeCss=='doctor'}">
	<c:set var="doctorActive" value="active"></c:set>
</c:if>
<div class="account_slide">
	<div class="account_slide_list">
		<a href="reservation_form.html" class="account_slide_title ${reservActive}"><i
			class="iconfont icon-icon77"></i>预约单</a>
	</div>
	<div class="account_slide_list">
		<a href="${ctx}/hospitalServlet.do" class="account_slide_title ${hospitalActive}"><i
			class="iconfont icon-souyiyuan"></i>医馆管理</a>
	</div>
	<div class="account_slide_list">
		<a href="doctors_management.html" class="account_slide_title ${doctorActive}"><i
			class="iconfont icon-yisheng"></i>医师管理</a>
	</div>
</div>