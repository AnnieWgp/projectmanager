<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="../css/layui.css">
<script type="text/javascript"
	src="../../js/jquery-easyui-1.4/jquery.min.js"></script>
<script type="text/javascript">
function add() {
	window.open("../page/addtype.do",
			 'newwindow', 'height=200, width=400, top=300, left=700, toolbar=no, menubar=no, scrollbars=no, resizable=no,location=no, status=no');
}
</script>
<title>消费类别信息</title>
<style>
#ctypes {
	font-size:19px;
	font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
	width: 50%;
	border-collapse: collapse;
}

#ctypes td, #ctypes th {
	font-size:15px;
	border: 1px solid #98bf21;
	padding: 3px 7px 2px 7px;
}

#ctypes th {
	font-size: 1.1em;
	text-align: left;
	padding-top: 5px;
	padding-bottom: 4px;
	background-color: #A7C942;
	color: #ffffff;
}

#ctypes tr.alt td {
	color: #000000;
	background-color: #EAF2D3;
}

.button {
	background-color: #4CAF50;
	border: none;
	color: white;
	padding: 15px 32px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 16px;
	margin: 4px 2px;
	cursor: pointer;
}
</style>
</head>
<body>
	<div style="padding: 10px 10px 10px 10px">
		<div
			style="font-size:19px; text-align: left; padding-top: 5px; padding-bottom: 4px; background-color: #4CAF50; color: #ffffff">
			>>消费类别信息管理</div>
		</br>
		<table cellpadding="5" id="ctypes">
			<tr>
				<th>类别名称</th>
				<th>类别备注</th>
			</tr>

			<c:forEach items="${ContypeList}" var="Contype">
				<tr>
					<td><a href="/consum/list.do?tId=${Contype.tId}">
							<div>${Contype.tName }</div> </a></td>
					<td>${Contype.tNote}</td>
				</tr>
			</c:forEach>
		</table>
		<input type="button" class="button" value="添加" onclick="add()" />
	</div>
</body>
</html>