<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="<%= request.getContextPath() %>"></c:set>
<jsp:include page="header.jsp"></jsp:include>
<div class="main">
	<div class="main_pad">
		<div class="account_box clearfix">
			<jsp:include page="nav.jsp"></jsp:include>
			<div class="account_main">
				<div class="account_main_block">
					<h3 class="account_main_title clearfix">
						<span>修改医师</span>
					</h3>
					<div class="account_main_pad">
						<form>
							<div class="input_group">
								<label class="input_text">医生姓名：</label>
								<div class="input_control">
									<input type="text" class="input_long error_border" />
									<p class="error_text">错误提示</p>
								</div>
							</div>
							<div class="input_group">
								<label class="input_text">职称：</label>
								<div class="input_control">
									<select class="input_long">
										<option>请选择</option>
									</select>
								</div>
							</div>
							<div class="input_group">
								<label class="input_text">所属医院：</label>
								<div class="input_control">
									<select class="input_long">
										<option>请选择</option>
									</select>
								</div>
							</div>
							<div class="input_group">
								<label class="input_text">所在科室：</label>
								<div class="input_control">
									<select class="input_long">
										<option>请选择</option>
									</select>
								</div>
							</div>
							<div class="input_group">
								<label class="input_text">预约费用：</label>
								<div class="input_control">
									<input type="text" class="input_long" />&nbsp;次
								</div>
							</div>
							<div class="input_group">
								<label class="input_text">擅长：</label>
								<div class="input_control">
									<textarea class="input_long" placeholder="请填写备注信息"></textarea>
								</div>
							</div>
							<div class="input_group">
								<label class="input_text">备注：</label>
								<div class="input_control">
									<textarea class="input_long" placeholder="请填写备注信息"></textarea>
								</div>
							</div>
							<div class="input_group">
								<label class="input_text"></label>
								<div class="input_control">
									<button type="button" class="btn_block100 btn_default">提
										交</button>
									<button type="button" class="btn_block100 btn_cancel">重
										置</button>
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<div class="footer">
	<div class="container">
		<div class="footer_link">
			<p>2007-2016 All Rights Reserved. xxxxxxx有限公司 版权所有 沪ICP备xxxxxx号</p>
		</div>
	</div>
</div>

<!--引用js-->
<script type="text/javascript" src="${ctx}/static/js/jquery.min.js"></script>
<script type="text/javascript" src="${ctx}/static/js/layer/layer.js"></script>
</body>
</html>
