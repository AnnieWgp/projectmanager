<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page language="java" import="java.text.SimpleDateFormat"%>
<%@ page language="java" import="java.util.Date"%>
<%
	SimpleDateFormat df = new SimpleDateFormat("yyMMddHHmmss");
	String number = df.format(new Date());
%>
<head>
<meta charset="UTF-8">
<title></title>
<link rel="stylesheet"
	href="../css/base/jquery-ui-1.10.4.custom.min.css">
<script src="../js/jquery-1.10.2.js"></script>
<script src="../js/jquery-ui-1.10.4.custom.min.js"></script>
<link rel="stylesheet" href="../css/style.css">
<script type="text/javascript">
	$(function() {
		//1.为下拉框绑定一个键盘弹起事件
		$("#tid").focus(
				function() {
					//1.清空下拉框
					$("#tid").empty();
					$('#tid').append("<option value="+0+">--请选择--</option>");
					//2.ajax请求,从数据库获取列表值
					$.get("${pageContext.request.contextPath}/contype/getlist.do",
							function(data) {
								var temp = "";
								$.each(data, function(i, n) {
									temp += "<option value='"+n["tId"]+"'>"
											+ n["tName"] + "</option>"
								});
								$('#tid').append(temp);
							}, "json");
					$("#cid").empty();
					$('#cid').append("<option value="+0+">--请选择--</option>");
					$("#cid").attr("disabled", true);
				}).change(function() {
			//4.
			if ($("#tid").val() == 0) {
				$("#cid").attr("disabled", true);
			} else {
				$("#cid").attr("disabled", false);
			}

		});

		$("#cid").focus(
				function() {
					var tId = $("#tid").val();
					$("#cid").empty();
					$('#cid').append("<option value="+0+">--请选择--</option>");
					$.get(
							"${pageContext.request.contextPath}/consum/getlist.do?tId="
									+ tId, function(data) {
								var temp = "";
								$.each(data, function(i, n) {
									temp += "<option value='"+n["cId"]+"'>"
											+ n["cName"] + "</option>"
								});
								$('#cid').append(temp);
							}, "json");
				});

		$("#datetime").datepicker({
			dateFormat : 'yy-mm-dd',
			showAnim : 'slideDown'
		});
	});
</script>

</head>

<body>
	<div style="padding: 10px 10px 10px 10px">
		<form id="content" method="post" name="table"
			action="../addAccount.do" onsubmit="return  validate(this);">

 <fieldset>
  <legend>>>新增账单：</legend>

			<table cellpadding="5">

				<tr>
					<td>流水单号:</td>
					<td><input type="text" name="cNumber" value=<%=number%>
						readonly="readonly" readonly=true /></td>
				</tr>

				<tr>
					<td>消费类别:</td>
					<td><select name="tname" id="tid" style="width: 100px">
							<option value="0">--请选择--</option>
					</select></td>
				</tr>

				<tr>
					<td>消费名称:</td>
					<td><select name="cname" id="cid" disabled="true"
						style="width: 100px">
							<option value="0">--请选择--</option>
					</select></td>
				</tr>
				<tr>
					<td>消费金额:</td>
					<td><input type="text" name="cCost"></input></td>
				</tr>

				<tr>
					<td>消费方式:</td>
					<td><select name="cWay" id="ctype" style="width: 100px">
							<option value="0">--请选择--</option>
							<option value="1">储蓄卡</option>
							<option value="2">信用卡</option>
							<option value="3">支付宝</option>
							<option value="4">微信钱包</option>
							<option value="5">现金</option>
							<option value="6">其他</option>
					</select></td>
				</tr>

				<tr>
					<td>消费时间:</td>
					<td><input type="text" name="cTime" id="datetime"></td>
				</tr>



				<tr>
					<td>消费用户:</td>
					<td><input type="text" name="cUser" id="cUser"></td>
				</tr>

				<tr>
					<td>消费备注:</td>
					<td><input type="text" name="cNote" id="cNote"></td>
				</tr>
			</table>

			<input type="reset"> <input type="submit" value="添加">

			<script type="text/javascript">
				function validate(table) {
					if (table.cName.value == "" || table.tid.value == "") {
						alert("名称不能为空");
						return false;
					}

				}
			</script>
 </fieldset>
		</form>
	</div>

</body>
