<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<div style="padding:10px 10px 10px 10px">
	<form id="content" method="post" name="table"  action="../contype/addtype.do"   onsubmit="return  validate(this);">
	      <fieldset>
	    <legend>>>新增消费名称：</legend> 
	    <table cellpadding="5">
	        <tr>
	            <td>名称:</td>
	            <td><input class="easyui-textbox" type="text" name="tName" data-options="required:true" style="width: 280px;"></input></td>
	        </tr>
	        <tr>
	            <td>备注</td>
	            <td><input class="easyui-textbox" type="text" name="tNote" data-options="required:true" style="width: 280px;"></input></td>
	        </tr>
	        <tr>
	            <td><input type="reset"></td>
	            <td><input type="submit" value="添加"></td>
	        </tr>
	    </table>
	    <script type="text/javascript">  
                    function validate(table)  
                    {  
                        if(table.tName.value=="" )  
                        {  
                            alert("名称不能为空");  
                            return false;  
                        }  
                    
                    }   
        </script>  
        </fieldset>   
	</form>
	
</div>
