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
						<span class="fl">医师管理</span> <a href="javascript:;"
							class="add_doctors"><i class="iconfont icon-jiahao"></i>添加医师</a>
					</h3>
					<div class="account_main_pad">
						<div class="search_table">
							<table width="100%">
								<colgroup>
									<col class="search_col01">
									<col class="search_col02">
									<col class="search_col03">
									<col class="search_col04">
									<col class="search_col05">
									<col class="search_col06">
								</colgroup>
								<tr>
									<td class="text_right">医师姓名：</td>
									<td><input type="text" class="input_common input_middle" /></td>
									<td class="text_right">职 称：</td>
									<td><input type="text" class="input_common input_middle" /></td>
									<td class="text_right">关 键 字：</td>
									<td><input type="text" class="input_common input_middle" /></td>
								</tr>
								<tr>
									<td colspan="6">
										<button type="button" class="btn btn_default">搜 索</button>
									</td>
								</tr>
							</table>
						</div>
						<table class="alt" cellpadding="0" cellspacing="0">
							<colgroup>
								<col class="doctors_col01">
								<col class="doctors_col02">
								<col class="doctors_col03">
								<col class="doctors_col04">
								<col class="doctors_col05">
								<col class="doctors_col06">
								<col class="doctors_col07">
								<col class="doctors_col08">
							</colgroup>
							<thead>
								<tr>
									<th>医师姓名</th>
									<th>职称</th>
									<th>所属医院</th>
									<th>科室</th>
									<th>擅长</th>
									<th>预约费用</th>
									<th>备注</th>
									<th>操作</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>王娟</td>
									<td>科室主任</td>
									<td>健康国医馆</td>
									<td>内科</td>
									<td>
										<p class="doctors_advance">脑血管疾病、癫痫、运动神经、头痛、头晕、睡眠障碍、重症肌无力、周围
											神经病 。</p>
									</td>
									<td>￥140.00</td>
									<td>备注信息</td>
									<td><a href="doctors_edit.html" class="blue">编辑</a>&nbsp;&nbsp;
										<a href="javascript:;" class="blue">删除</a></td>
								</tr>
							</tbody>
						</table>
						<div class="centen_page">
							<a class="disabled">上一页</a> <a href="" class="page_on">1</a> <a
								href="">2</a> <a href="">3</a> <a href="">4</a> <a href="">5</a>
							<a href="">下一页</a> <a href="">最后一页</a> <span>共<strong>100</strong>条记录&nbsp;&nbsp;<strong>1</strong>/10页
							</span>
						</div>
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

<!--  layer弹框-->
<div id="adddoctorsLayer" class="hidden">
	<div class="layerDiv">
		<form>
			<div class="input_group clearfix">
				<label class="input_text">医生姓名：</label>
				<div class="input_control">
					<input type="text" class="input_long error_border" />
					<p class="error_text">错误提示</p>
				</div>
			</div>
			<div class="input_group clearfix">
				<label class="input_text">职称：</label>
				<div class="input_control">
					<select class="input_long">
						<option>请选择</option>
					</select>
				</div>
			</div>
			<div class="input_group clearfix">
				<label class="input_text">所属医院：</label>
				<div class="input_control">
					<select class="input_long">
						<option>请选择</option>
					</select>
				</div>
			</div>
			<div class="input_group clearfix">
				<label class="input_text">所在科室：</label>
				<div class="input_control">
					<select class="input_long">
						<option>请选择</option>
					</select>
				</div>
			</div>
			<div class="input_group clearfix">
				<label class="input_text">预约费用：</label>
				<div class="input_control">
					<input type="text" class="input_long" />&nbsp;次
				</div>
			</div>
			<div class="input_group clearfix">
				<label class="input_text">擅长：</label>
				<div class="input_control">
					<textarea class="input_long" placeholder="请填写备注信息"></textarea>
				</div>
			</div>
			<div class="input_group clearfix">
				<label class="input_text">备注：</label>
				<div class="input_control">
					<textarea class="input_long" placeholder="请填写备注信息"></textarea>
				</div>
			</div>
			<div class="button_div">
				<button type="button" class="btn_block100 btn_default closeLayer">提
					交</button>
				<button type="button" class="btn_block100 btn_cancel">重 置</button>
			</div>
		</form>
	</div>
</div>
<!-- layer弹框 end-->

<!--引用js-->
<script type="text/javascript" src="${ctx}/static/js/jquery.min.js"></script>
<script type="text/javascript" src="${ctx}/static/js/layer/layer.js"></script>
<script>
			$(document).ready(function() {
				$('.add_doctors').on('click', function() {
					var index = layer.open({
						type: 1,
						skin: 'demo-class',
						title: '添加医师',
						area: ['600px', '620px'],
						shadeClose: true, //点击遮罩关闭
						content: $('#adddoctorsLayer')
					});
					$('.closeLayer').on('click', function() {
						layer.close(index);
					});
				});
			});
		</script>
</body>
</html>
