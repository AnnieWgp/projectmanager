<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<script type="text/javascript"
	src="../../js/jquery-easyui-1.4/jquery.min.js"></script>
<!-- <script type="text/javascript">
function add() {
	window.showModalDialog("../page/addCon.do");
}
</script> -->
<html>
<head>
<title>Insert title here</title>
<style type="text/css">
#tConsumption {
	font-size:19px;
	font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
	width: 50%;
	border-collapse: collapse;
}

#tConsumption td, #tConsumption th {
	font-size:15px;
	border: 1px solid #98bf21;
	padding: 3px 7px 2px 7px;
}

#tConsumption th {
	font-size: 1.1em;
	text-align: left;
	padding-top: 5px;
	padding-bottom: 4px;
	background-color: #A7C942;
	color: #ffffff;
}

#tConsumption tr.alt td {
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
			>>消费列表</div>
		</br>
	
	<table cellpadding="5" id="tConsumption">
		<tr>
			<th>消费日期</th>
			<th>消费类别</th>
			<th>消费种类</th>
			<th>消费金额</th>
			<th>消费方式</th>
		</tr>

		<c:forEach items="${AccountList}" var="Account">
			<tr>
				<td><fmt:formatDate value="${Account.consumeTime}" pattern="yyyy/MM/dd"/></td>
				<td>${Account.tId}</td>
				<td>${Account.cId}</td>
				<td>${Account.consumeCost}</td>
				<td><c:choose>
   					 <c:when test="${Account.consumeWay == 1}">
     				  储蓄卡
   					 </c:when>
   					 <c:when test="${Account.consumeWay == 2}">
     				  信用卡
   					 </c:when>
   					 <c:when test="${Account.consumeWay == 3}">
     				  支付宝
   					 </c:when>
   					 <c:when test="${Account.consumeWay == 4}">
     				  微信钱包
   					 </c:when>
   					 <c:when test="${Account.consumeWay == 5}">
     				 现金
   					 </c:when>
				</c:choose>
				</td>
			</tr>
		</c:forEach>
	</table>
	<%-- <a href="../page/addCon.do?tId=<%=request.getParameter("tId")%>"> <input
		type="button" class="button" value="添加" onclick="add()" /></a>
	<a href="#"> <input
		type="button" class="button" value="返回" onclick="javascript:history.back(-1);" /></a> --%>
</div>
</body>
</html>