<%@ page language="java" contentType="text/html;charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" href="../css/style.css">
<link rel="stylesheet" href="../css/layui.css">
<title>首页</title>
<style>
h1 {
	color: #1E9FFF;
	padding: 20px 0;
	text-align: center;
	FONT-SIZE: 50px;
	font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
}

.top {
	height: 20%;
	background: #d2d2d2
}

.head {
	width: 100%;
	margin: 0 auto;
	height: 20%;
	background: #c2c2c2
}

.main {
	width: 100%;
	height: 600px;
	margin: 0 auto;
}

.left {
	width: 20%;
	height: 100%;
	background: #009688;
	float: left;
} 

.right {
	width: 80%;
	height: 100%;
	background: #eeeeee;
	float: right
}

.footer {
	height: 10%;
	background: #01AAED;
	clear: both;
}

.table_out {
	width: 100%;
	height: 100%;
	border: 0;
	cellpadding: 0;
	cellspacing: 0;
}
</style>
</head>

<!-- <frameset rows="100,*" cols="*" frameborder="no" border="0" framespacing="0">
  <frame src="/page/top.do" name="topFrame"  noresize="noresize" id="topFrame" title="topFrame" />
  <frameset cols="213,*" frameborder="no" border="0" framespacing="0">
    <frame src="/page/left.do" name="leftFrame"  noresize="noresize" id="leftFrame" title="leftFrame" />
    <frame src="/main/mainfra.html" name="mainFrame" id="mainFrame" title="mainFrame" />
  </frameset>
</frameset> -->

<body>
	<SCRIPT language=JavaScript>
		function tupian(idt) {
			var nametu = "xiaotu" + idt;
			var tp = document.getElementById(nametu);
			tp.src = "../images/ico05.gif";

			for (var i = 1; i < 30; i++) {

				var nametu2 = "xiaotu" + i;
				if (i != idt * 1) {
					var tp2 = document.getElementById('xiaotu' + i);
					if (tp2 != undefined) {
						tp2.src = "../images/ico06.gif";
					}
				}
			}
		}

		function list(idstr) {
			var name1 = "subtree" + idstr;
			var name2 = "img" + idstr;
			var objectobj = document.all(name1);
			var imgobj = document.all(name2);

			//alert(imgobj);

			if (objectobj.style.display == "none") {
				for (i = 1; i < 10; i++) {
					var name3 = "img" + i;
					var name = "subtree" + i;
					var o = document.all(name);
					if (o != undefined) {
						o.style.display = "none";
						var image = document.all(name3);
						//alert(image);
						image.src = "../images/ico04.gif";
					}
				}
				objectobj.style.display = "";
				imgobj.src = "../images/ico03.gif";
			} else {
				objectobj.style.display = "none";
				imgobj.src = "../images/ico04.gif";
			}
		}
	</SCRIPT>

	<div class="top">
		<div class="head">
			<h1>财务管理系统</h1>
		</div>
	</div>
	<div class="main">
		<div class="left">
			<table width="198" border="0" cellpadding="0" cellspacing="0" class="left-table01">
  <tr>
    <TD>
		<table width="100%" border="0" cellpadding="0" cellspacing="0">
		  <tr>
			<td width="207" height="55" background="../images/nav01.gif">
				<table width="90%" border="0" align="center" cellpadding="0" cellspacing="0">
				  <tr>
					<td width="25%" rowspan="2"><img src="../images/ico02.gif" width="35" height="35" /></td>
					<td width="75%" height="22" class="left-font01">管理用户您好<span class="left-font02">king</span></td>
				  </tr>
				  <tr>
					<td height="22" class="left-font01">
						[&nbsp;<a href="../login.html" target="_top" class="left-font01">Welcome</a>&nbsp;]</td>
				  </tr>
				</table>
			</td>
		  </tr>
		</table>
		
		<TABLE width="100%" border="0" cellpadding="0" cellspacing="0" class="left-table03">
          <tr>
            <td height="29">
				<table width="85%" border="0" align="center" cellpadding="0" cellspacing="0">
					<tr>
						<td width="8%"><img name="img8" id="img8" src="../images/ico04.gif" width="8" height="11" /></td>
						<td width="92%">
								<a  target="mainFrame" class="left-font03" onClick="list('8');" >账单信息管理</a></td>
					</tr>
				</table>
			</td>
          </tr>		  
        </TABLE>
        
		<table id="subtree8" style="DISPLAY: none" width="80%" border="0" align="center" cellpadding="0" 
				cellspacing="0" class="left-table02">
				<tr>
				  <td width="9%" height="20" ><img id="xiaotu20" src="../images/ico06.gif" width="8" height="12" /></td>
				  <td width="91%"><a href="/getAccount.do" target="mainFrame" class="left-font03" onClick="tupian('20');">查询清单</a></td>
				</tr>
				<tr>
				  <td width="9%" height="20" ><img id="xiaotu20" src="../images/ico06.gif" width="8" height="12" /></td>
				  <td width="91%"><a href="/page/addaccount.do" target="mainFrame" class="left-font03" onClick="tupian('20');">新增一笔</a></td>
				</tr>
      </table>
      
      <TABLE width="100%" border="0" cellpadding="0" cellspacing="0" class="left-table03">
          <tr>
            <td height="29">
				<table width="85%" border="0" align="center" cellpadding="0" cellspacing="0">
					<tr>
						<td width="8%"><img name="img8" id="img8" src="../images/ico04.gif" width="8" height="11" /></td>
						<td width="92%">
								<a  target="mainFrame" class="left-font03" onClick="list('8');" >收入信息管理</a></td>
					</tr>
				</table>
			</td>
          </tr>		  
        </TABLE>
      
      <TABLE width="100%" border="0" cellpadding="0" cellspacing="0" class="left-table03">
          <tr>
            <td height="29">
				<table width="85%" border="0" align="center" cellpadding="0" cellspacing="0">
					<tr>
						<td width="8%"><img name="img8" id="img8" src="../images/ico04.gif" width="8" height="11" /></td>
						<td width="92%">
								<a  target="mainFrame" class="left-font03"  >资产信息管理</a></td>
					</tr>
				</table>
			</td>
          </tr>		  
        </TABLE>
      
          <tr>
            <td height="29">
				<table width="85%" border="0" align="center" cellpadding="0" cellspacing="0">
					<tr>
						<td width="8%"><img name="img8" id="img8" src="../images/ico04.gif" width="8" height="11" /></td>
						<td width="92%">
								<a href="/contype/list.do" target="mainFrame" class="left-font03" >消费类别</a></td>
					</tr>
				</table>
			</td>
          </tr>		  
     
          
	  </TD>
  </tr> 
</table>
		</div>

		<div class="right">
			<iframe name="mainFrame" id="mainFrame" title="mainFrame"
				frameborder="0" width="100%" height="100%" marginheight="0"
				marginwidth="0" scrolling="no" />
		</div>
		
		<div class="footer">footer</div>
	</div>
</body>

</html>