<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<div style="padding:10px 10px 10px 10px">
	<form id="content" method="post" name="table"  action="../consum/addcon.do"   onsubmit="return  validate(this);">
	    <fieldset>
  <legend>>>新增消费名称：</legend>
	    <table cellpadding="5">
	    
	        <tr>
	            <td>消费名称:</td>
	            <td><input class="easyui-textbox" type="text" name="cName" data-options="required:true" style="width: 280px;"></input></td>
	        </tr>
	        <tr>
	            
	            <td><input  class="easyui-textbox"  type="hidden" name="tId" id = "a" value="<%=request.getParameter("tId")%>" data-options="required:true" style="width: 280px;"></input></td>
	        </tr>
	        <tr>
	            <td>消费备注</td>
	            <td><input class="easyui-textbox" type="text" name="cNote" data-options="required:true" style="width: 280px;"></input></td>
	        </tr>
	        <tr>
	            <td colspan='2'><input type="reset"><input type="submit" value="添加"><input type="button" value="返回" onclick="javascript:history.back(-1);"></td>
	        </tr>
	    </table>
	    <script type="text/javascript">  
                    function validate(table)  
                    {  
                        if(table.cName.value=="" || table.tid.value=="" )  
                        {  
                            alert("名称不能为空");  
                            return false;  
                        }  
                    
                    }   
        </script>
        </fieldset>          
	</form>
</div>
