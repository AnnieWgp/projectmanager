package cn.taobao.projectmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.taobao.projectmanager.service.ProjectService;
import cn.taobao.projectmanager.vo.EasyUIPage;

@Controller
public class ProjectAction {

	@Autowired
	ProjectService projectService;
	
	@RequestMapping("/page/{pageName}")
	public String toPage(@PathVariable(value="pageName") String pageName){
		return pageName;
	}
	
	
	
	@ResponseBody
	@RequestMapping(value="/page1/list")
	public EasyUIPage getUsers(@RequestParam("page")Integer pageNum,@RequestParam("rows")Integer pageSize){
		System.out.println(this.projectService.queryConsumption(pageNum,pageSize)+"11");
		return this.projectService.queryConsumption(pageNum,pageSize);
		
	}
}
