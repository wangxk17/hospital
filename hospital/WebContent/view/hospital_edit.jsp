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
						<span>修改医馆</span>
					</h3>
					<div class="account_main_pad">
						<form>
							<div class="input_group">
								<label class="input_text">医馆名称：</label>
								<div class="input_control">
									<input type="text" class="input_long error_border" />
									<p class="error_text">错误提示</p>
								</div>
							</div>
							<div class="input_group">
								<label class="input_text">所在区域：</label>
								<div class="input_control">
									<select class="input_short">
										<option>请选择省</option>
									</select> &nbsp;&nbsp; <select class="input_short">
										<option>请选择市</option>
									</select> &nbsp;&nbsp; <select class="input_short">
										<option>请选择区</option>
									</select>
								</div>
							</div>
							<div class="input_group">
								<label class="input_text">详细地址：</label>
								<div class="input_control">
									<textarea class="input_long" placeholder="请填写详细信息"></textarea>
								</div>
							</div>
							<div class="input_group">
								<label class="input_text">科室选择：</label>
								<div class="input_control">
									<div class="department_box">
										<div class="department_seleted">
											<a href="javascript:;">内科</a> <a href="javascript:;">外科</a>
										</div>
										<a href="javascript:;" class="department_add">新建科室</a>
									</div>
									<div class="new_department">
										<div class="input_group">
											<label class="input_text">科室名称</label>
											<div class="input_control">
												<input type="text" />
											</div>
										</div>
										<div class="input_group">
											<label class="input_text">科室图片</label>
											<div class="input_control">
												<div class="img_box">
													<div class="file_box">
														<input type="file" class="file_input" />
													</div>
													<!--有图片的情况-->
													<!--<div class="file_box">
																<input type="file" class="file_input" />
																<img src="images/logo.png" />
																<a href="javascript:;" class="file_delete" title="删除"></a>
															</div>-->
												</div>
											</div>
										</div>
										<div class="input_group">
											<label class="input_text"></label>
											<div class="input_control">
												<button type="button"
													class="btn btn_cancel department_cancel">关闭</button>
												&nbsp;&nbsp;
												<button type="button" class="btn btn_default">提交</button>
											</div>
										</div>
									</div>
									<div class="department_div">
										<a href="javascript:;" class="selected">内科</a> <a
											href="javascript:;" class="selected">外科</a> <a
											href="javascript:;">五官科</a> <a href="javascript:;">妇科</a> <a
											href="javascript:;">儿科</a> <a href="javascript:;">内科</a> <a
											href="javascript:;">外科</a> <a href="javascript:;">五官科</a> <a
											href="javascript:;">妇科</a> <a href="javascript:;">儿科</a>
									</div>
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
<script>
			$(document).ready(function() {
				$('.department_add').on('click', function() {
					$(".new_department").slideToggle();
				})
				$('.department_cancel').on('click', function() {
					$(".new_department").slideUp();
				})
			});
		</script>
</body>
</html>
